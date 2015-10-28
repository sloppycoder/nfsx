package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.ProfileServiceApplication;
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
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProfileServiceApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
public class CustomerResourceApiTests {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test public void
    get_customer_by_id() {
        given().
        when().
            get("/customer/MY123456").
        then().
            statusCode(200).
        body("name", equalTo("Hayashi San")).
        log().ifError();
    }

    @Test public void
    get_customer_but_not_exist() {
        given().
        when().
            get("/customer/MY8888888").  // this customer id does not exist
        then().
            statusCode(404).
        log().ifError();
    }

    @Test public void
    get_customer_by_invalid_id() {
        given().
        when().
        get("/customer/M1").  // invalid customer id
        then().
            statusCode(422).
        log().ifError();
    }

    @Test public void
    get_customer_by_login() {
        given().
        when().
            get("/customer_by_login/MYmyuser1").
        then().
            statusCode(200).
        body("name", equalTo("Hayashi San")).
        log().ifError();
    }

    @Test public void
    create_customer_fail_validation() {
        given().
            contentType("application/json").
        body(INVALID_CREATE_CUSTOMER_JSON).
        when().
            post("/customer").
        then().
            statusCode(400).
        body("exception", containsString("MethodArgumentNotValidException")).
        log().ifError();

    }

    @Test public void
    create_customer_success() {
        given().
            contentType("application/json").
            body(VALID_CREATE_CUSTOMER_JSON).
        when().
            post("/customer").
        then().
            statusCode(200).
        log().ifError();

        given().
        when().
            get("/customer/MY654322").
        then().
            statusCode(200).
            body("name", equalTo("Shinzo Abe")).
            body("id", notNullValue()).
            body("lastUpdate", notNullValue()).
        log().ifError();
    }

    private static final String  VALID_CREATE_CUSTOMER_JSON =
     " { \"countryCode\": \"MY\", \"customerId\": \"654322\", \"name\": \"Shinzo Abe\", \"login\": \"abeabc\"  }";

    // invalid because the login name is too short, does not satisfy the
    // validation annotation in Customer domain class
    private static final String  INVALID_CREATE_CUSTOMER_JSON =
    " { \"countryCode\": \"MY\", \"customerId\": \"654322\", \"name\": \"Shinzo Abe\", \"login\": \"abe\"  }";
}

