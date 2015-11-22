package com.fictional.ibank.web;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import redis.embedded.RedisServer;

public abstract class RedisBasedTest {
    private static RedisServer redisServer;

    @BeforeClass
    public static void setup() throws Exception {
        //TODO: hard coded port number is no good
        redisServer = new RedisServer(6379);
        redisServer.start();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        redisServer.stop();
    }

}
