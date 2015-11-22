package com.fictional.ibank.web;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainAppApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
public class CustomHealthIndicatorTests extends RedisBasedTest {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


    @Test public void
    health_check_shows_git_info() {
        given().
        when().
        get("/health").
        then().
        statusCode(200).
        body(containsString("git.commit.id")).
        log().
        all();
    }
}
