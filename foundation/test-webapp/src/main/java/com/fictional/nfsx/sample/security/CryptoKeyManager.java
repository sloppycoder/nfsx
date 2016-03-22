package com.fictional.nfsx.sample.security;

import com.ibm.websphere.crypto.KeyException;
import com.ibm.websphere.crypto.KeySetHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

@Component
public class CryptoKeyManager {

    private static final Logger LOG = LoggerFactory.getLogger(CryptoKeyManager.class);

    @Value("${app.db.crypto.key}")
    String crytoKey;

    @Value("${app.db.crypto.webspherekeyset}")
    String websphereKeySetName;

    private Key dbPersistenceKey = null;

    public Key getKeyForDBPersistence() {
        if (dbPersistenceKey == null) {
            dbPersistenceKey = initializeDBPersistenceKey();
        }
        return dbPersistenceKey;
    }

    private Key initializeDBPersistenceKey(){
        if (websphereKeySetName != null && !websphereKeySetName.trim().isEmpty()) {
            LOG.info("reading key from Websphere KeyHelper");
            com.ibm.websphere.crypto.KeySetHelper ksh = KeySetHelper.getInstance();
            try {
                Key key = (Key) ksh.getLatestKeyForKeySet(websphereKeySetName);
                // sanity check the key first
                LOG.info(".got key {} {}", key.getAlgorithm(), key.getFormat());
                return key;
            } catch (KeyException e) {
                throw new RuntimeException(e);
            }
        } else {
            LOG.info("reading key from application configuration");
            return new SecretKeySpec(crytoKey.getBytes(), "AES");
        }
    }
}
