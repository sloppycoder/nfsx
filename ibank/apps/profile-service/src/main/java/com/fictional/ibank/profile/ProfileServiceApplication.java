package com.fictional.ibank.profile;

import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EntityScan(basePackageClasses=CustomerEntity.class)
@ComponentScan
@EnableResourceServer
public class ProfileServiceApplication {

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

    public static void main(String[] args) {
        SpringApplication.run(ProfileServiceApplication.class, args);
    }

}

