package com.fictional.nfs2.test;

import com.fictional.nfs2.audit.entity.AuditTrailEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
@EntityScan(basePackageClasses=AuditTrailEntity.class)
@EnableJpaRepositories("com.fictional.nfs2.audit.dao")
@ComponentScan(basePackages = "com.fictional.nfs2")
public class TestApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
            SpringApplication.run(TestApplication.class, args);
        }

}

