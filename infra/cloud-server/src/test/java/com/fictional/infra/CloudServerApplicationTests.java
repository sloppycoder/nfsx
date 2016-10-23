package com.fictional.infra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CloudServerApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test,native")
public class CloudServerApplicationTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void eurekaLoads() {
        ResponseEntity<String> response =
            template.getForEntity("/", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Instances currently registered with Eureka"));
    }

    @Test
    public void hystrixDashboardLoads() {
        ResponseEntity<String> response =
        template.getForEntity("/hystrix", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Hystrix Dashboard"));
    }

    @Test
    public void configServerLoads() {
        ResponseEntity<String> response =
            template.getForEntity("/cloudconfig/application.yml/default", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("profiles"));
    }

}
