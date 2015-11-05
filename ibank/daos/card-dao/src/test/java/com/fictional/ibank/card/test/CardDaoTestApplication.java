package com.fictional.ibank.card.test;

import com.fictional.ibank.card.persistence.entity.CreditCardEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses=CreditCardEntity.class)
@ComponentScan(basePackages = "com.fictional.ibank")
@EnableJpaRepositories("com.fictional.ibank.card.persistence.dao")
public class CardDaoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardDaoTestApplication.class, args);
    }
}
