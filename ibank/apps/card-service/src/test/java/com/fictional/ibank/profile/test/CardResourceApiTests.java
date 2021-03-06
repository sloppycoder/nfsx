package com.fictional.ibank.profile.test;

import com.fictional.ibank.card.CardServiceApplication;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CardServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ActiveProfiles("test,h2")
public class CardResourceApiTests {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test public void
    get_cards_by_valid_customer_id() {
        // @formatter:off
        given()
        .when()
            .get("/cards_overview/MY123456")
        .then()
            .statusCode(200)
            .body("[0].customerId", equalTo("123456"))
        .log()
            .all();
        // @formatter:on
    }

    @Test public void
    no_cards_for_valid_customer_id() {
        // @formatter:off
        given()
        .when()
            .get("/customer/MY8888888")  // valid customer but has no cards
        .then()
            .statusCode(404)
        .log()
            .ifError();
        // @formatter:on
    }

    @Test public void
    get_customer_by_invalid_id() {
        // @formatter:off
        given()
        .when()
            .get("/cards_overview/M1")  // invalid customer id
        .then()
            .statusCode(422)
        .log()
            .ifError();
        // @formatter:on
    }

}

