package com.fictional.csl.infra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
@EnableDiscoveryClient
public class CloudServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudServerApplication.class).run(args);
    }

}
