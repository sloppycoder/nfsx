package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses=CustomerEntity.class)
@ComponentScan(basePackages = "com.fictional.ibank")
@EnableJpaRepositories("com.fictional.ibank.profile.persistence.dao")
public class ProfileDaoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProfileDaoTestApplication.class, args);
    }
}
