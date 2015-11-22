package com.fictional.infra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CloudServerApplication.class)
@ActiveProfiles("test,native")
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class CloudServerApplicationTests {

    private RestTemplate template = new TestRestTemplate();

    @Value("${local.server.port}")
    private int port;

    @Test
    public void eurekaLoads() {
        ResponseEntity<String> response =
            template.getForEntity(fullUrl(), String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Instances currently registered with Eureka"));
    }

    @Test
    public void hystrixDashboardLoads() {
        ResponseEntity<String> response =
        template.getForEntity(fullUrl("hystrix"), String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Hystrix Dashboard"));
    }

    @Test
    public void configServerLoads() {
        ResponseEntity<String> response =
            template.getForEntity(fullUrl("cloudconfig/application.yml/default"), String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("profiles"));
    }

    private String fullUrl() {
        return "http://localhost:" + port;
    }

    private String fullUrl(String path) {
        return fullUrl() + (path.isEmpty() ? "" : "/" + path);
    }
}
