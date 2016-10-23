package com.fictional.infra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuthserverApplication.class, webEnvironment= WebEnvironment.RANDOM_PORT)
public class AuthserverApplicationTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void homePageProtected() {
        ResponseEntity<String> response = template.getForEntity("/uaa/", String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
    }

    @Test
    public void authorizationRedirects() {
        ResponseEntity<String> response = template.getForEntity("/uaa/oauth/authorize", String.class);
        assertEquals(HttpStatus.FOUND, response.getStatusCode());
        String location = response.getHeaders().getFirst("Location");
        assertTrue("Wrong header: " + location,
        location.contains("/uaa/login"));
    }

    @Test
    public void loginSucceeds() {
        ResponseEntity<String> response = template.getForEntity("/uaa/login", String.class);
        assertEquals(response.getStatusCode(), HttpStatus.FOUND);

        URI loginUri = response.getHeaders().getLocation();
        response = template.getForEntity(loginUri, String.class);

        MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
        form.set("username", "user");
        form.set("password", "user");
        form.set("_csrf", getCsrf(response.getBody()));
        HttpHeaders headers = new HttpHeaders();
        headers.put("COOKIE", response.getHeaders().get("Set-Cookie"));

        RequestEntity<MultiValueMap<String, String>> request = new RequestEntity<MultiValueMap<String, String>>(
        form, headers, HttpMethod.POST, loginUri);
        ResponseEntity<Void> response2 = template.exchange(request, Void.class);
        assertTrue(response2.getHeaders().getLocation().getPath().endsWith("/uaa/"));
    }

    private String getCsrf(String soup) {
        Matcher matcher = Pattern.compile("(?s).*name=\"_csrf\".*?value=\"([^\"]+).*")
        .matcher(soup);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

}
