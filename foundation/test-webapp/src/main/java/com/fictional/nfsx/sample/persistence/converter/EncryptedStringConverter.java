package com.fictional.nfsx.sample.persistence.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class EncryptedStringConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return reverse(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return reverse(dbData);
    }

    static private String reverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}
