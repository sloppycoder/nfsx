package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
    for some unkown reason, this class must be in this package
    not any sub-package below. otherwise test case will not work.
    I think it's related to Spring's auto-scan mechanism just don't
    exactly know what.
 */

@SpringBootApplication
@EntityScan(basePackageClasses=CustomerEntity.class)
@ComponentScan(basePackages = "com.fictional.ibank")
@EnableJpaRepositories("com.fictional.ibank.profile.persistence.dao")
public class ProfileDaoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProfileDaoTestApplication.class, args);
    }
}
