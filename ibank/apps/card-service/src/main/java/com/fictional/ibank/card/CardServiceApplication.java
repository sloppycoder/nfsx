package com.fictional.ibank.card;

import com.fictional.ibank.card.persistence.entity.CreditCardEntity;
import org.springframework.beans.factory.annotation.Value;
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
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EntityScan(basePackageClasses=CreditCardEntity.class)
@ComponentScan
@EnableResourceServer
@ImportResource("classpath:cxf.xml")
public class CardServiceApplication {

    @Value("${cors.allow.origin}")
    private String originDomain;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // @formatter:off
                registry
                    .addMapping("/**")
                        .allowedOrigins(originDomain)
                        .allowedMethods("GET","POST", "DELETE", "PUT")
                        .maxAge(3600);
                // @formatter:on
            }
        };
    }

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

