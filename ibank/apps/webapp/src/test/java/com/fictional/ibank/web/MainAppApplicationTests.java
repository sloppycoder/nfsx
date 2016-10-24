package com.fictional.ibank.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =  MainAppApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test,h2")
public class MainAppApplicationTests extends RedisBasedTest {

    @Value("${server.context-path}")
    String contextPath;

    @Value("${security.oauth2.client.userAuthorizationUri}")
    private String authorizeUri;

    @Autowired
    private TestRestTemplate template;

    @Test
    public void userEndpointProtected() {
        ResponseEntity<String> response = template.getForEntity("/user", String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
        String location = response.getHeaders().getFirst("Location");
        assertTrue("Wrong location: " + location, location.contains("/login"));
    }

    @Test
    public void loginRedirects() {
        ResponseEntity<String> response = template.getForEntity("/login", String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
        String location = response.getHeaders().getFirst("Location");
        assertTrue("Wrong location: " + location, location.startsWith(authorizeUri));
    }
}
