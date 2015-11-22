package com.fictional.ibank.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainAppApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class MainAppApplicationTests extends RedisBasedTest {

    @Value("${server.context-path}")
    String contextPath;

    @Value("${local.server.port}")
    private int port;

    @Value("${security.oauth2.client.userAuthorizationUri}")
    private String authorizeUri;

    private RestTemplate template = new TestRestTemplate();

    @Test
    public void userEndpointProtected() {
        ResponseEntity<String> response = template.getForEntity(fullUrl("/user"), String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
        String location = response.getHeaders().getFirst("Location");
        assertTrue("Wrong location: " + location, location.startsWith(fullUrl("/login")));
    }

    @Test
    public void loginRedirects() {
        ResponseEntity<String> response = template.getForEntity(fullUrl("/login"), String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
        String location = response.getHeaders().getFirst("Location");
        assertTrue("Wrong location: " + location, location.startsWith(authorizeUri));
    }

    private String fullUrl(String path) {
        return String.format("http://localhost:%s%s%s", port, contextPath, path);
    }

}
