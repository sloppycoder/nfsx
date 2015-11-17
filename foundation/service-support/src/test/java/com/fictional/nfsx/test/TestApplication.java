package com.fictional.nfsx.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class TestApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
            SpringApplication.run(TestApplication.class, args);
        }

}

