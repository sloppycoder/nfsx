package com.fictional.ibank.card;

import com.fictional.ibank.card.persistence.entity.CreditCardEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EntityScan(basePackageClasses=CreditCardEntity.class)
@ComponentScan
@EnableResourceServer
@ImportResource("classpath:cxf.xml")
public class CardServiceApplication {

    // for some unknown reason spring-boot is confused to use jetty
    // for this application, so we explicitly use of Tomcat here
    @Bean
    public EmbeddedServletContainerFactory tomcatContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory();
    }

    public static void main(String[] args) {
        SpringApplication.run(CardServiceApplication.class, args);
    }

}

