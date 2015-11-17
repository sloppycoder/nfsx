package com.fictional.nfsx.sample.test;

import com.fictional.nfsx.sample.TestWebAppApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestWebAppApplication.class)
@ActiveProfiles("test")
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class CORSFilterTests {

    @Value("${cors.allow.origin}")
    private String originDomain;

    @Value("${local.server.port}")
    private int port;

    private RestTemplate template = new TestRestTemplate();

    @Test
    public void cors_allowed_for_correct_origin() throws Exception {

        HttpEntity<String> entity = createTestHttpEntityForOrigin(originDomain);
        ResponseEntity<String> response = template.exchange(getFullUrl("/user"), HttpMethod.OPTIONS, entity, String.class);

        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getHeaders().getAccessControlAllowOrigin(), originDomain);
        List<HttpMethod> methods = response.getHeaders().getAccessControlAllowMethods();
        assertTrue(methods.contains(HttpMethod.GET));
    }


    @Test
    public void cors_denied_for_incorrect_origin() throws Exception {

        HttpEntity<String> entity = createTestHttpEntityForOrigin("http://hacked.domain");
        ResponseEntity<String> response = template.exchange(getFullUrl("/user"), HttpMethod.OPTIONS, entity, String.class);

        assertEquals(response.getStatusCode(), HttpStatus.FORBIDDEN);
    }

    private HttpEntity<String> createTestHttpEntityForOrigin(String originDomain) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Origin", originDomain);
        headers.add("Access-Control-Request-Headers", "Origin");
        headers.add("Access-Control-Request-Method", "GET");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        return entity;
    }

    private String getFullUrl(String path) {
        return "http://localhost:" + port + path;
    }
}

