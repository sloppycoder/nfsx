package com.fictional.nfsx.sample.persistence.converter;

import com.fictional.nfsx.sample.helper.AutowireHelper;
import com.fictional.nfsx.sample.security.CryptoKeyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.codec.Base64;

import javax.crypto.Cipher;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class EncryptedStringConverter implements AttributeConverter<String, String> {

    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";

    // Autowire doesn't work in this class. A helper is needed for this to work
    // http://stackoverflow.com/questions/4143881/spring-entitymanagerfactory-hibernate-listeners-injection/4144102#4144102
    @Autowired
    private CryptoKeyManager keyManager;

    @Override
    public String convertToDatabaseColumn(String attribute) {
        AutowireHelper.autowire(this, this.keyManager);
        try {
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.ENCRYPT_MODE, keyManager.getKeyForDBPersistence());
            return new String(Base64.encode(c.doFinal(attribute.getBytes())));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        AutowireHelper.autowire(this, this.keyManager);
        try {
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.DECRYPT_MODE, keyManager.getKeyForDBPersistence());
            return new String(c.doFinal(Base64.decode(dbData.getBytes())));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
