package com.fictional.nfsx.sample.security;

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

    private Key dbPersistenceKey = null;

    public Key getKeyForDBPersistence() {
        if (dbPersistenceKey == null) {
            dbPersistenceKey = initializeDBPersistenceKey();
        }
        return dbPersistenceKey;
    }

    private Key initializeDBPersistenceKey(){
        LOG.info("reading key from application configuration");
        return new SecretKeySpec(crytoKey.getBytes(), "AES");
    }
}
