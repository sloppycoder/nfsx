package com.fictional.nfs2.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
@Controller
public class TestApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
            SpringApplication.run(TestApplication.class, args);
        }

}

