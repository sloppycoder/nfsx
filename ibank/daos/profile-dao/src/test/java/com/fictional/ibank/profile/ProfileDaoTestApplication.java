package com.fictional.ibank.profile;

import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/*
    for some unkown reason, this class must be in this package
    not any sub-package below. otherwise test case will not work.
    I think it's related to Spring's auto-scan mechanism just don't
    exactly know what.
 */

@SpringBootApplication
@EntityScan(basePackageClasses=CustomerEntity.class)
@ComponentScan
public class ProfileDaoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProfileDaoTestApplication.class, args);
    }
}
