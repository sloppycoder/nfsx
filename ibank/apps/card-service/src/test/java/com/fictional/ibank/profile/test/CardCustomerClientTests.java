package com.fictional.ibank.profile.test;

import com.fictional.ibank.card.CardServiceApplication;
import com.fictional.ibank.card.ccms.service.CardCustomerBackendClient;
import com.fictional.ibank.card.ccms.service.CreditCardBackendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CardServiceApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
public class CardCustomerClientTests {

    @Autowired
    private CardCustomerBackendClient cardCustomerBackendClient;

    @Autowired
    private CreditCardBackendService cardBackendService;

    @Test
    public void
    customer_has_cards_from_backend() throws Exception {
        assertThat(cardCustomerBackendClient.enquireLinkedCards("MY", "123").size(), greaterThan(20)); // should return 50
    }

    @Test
    public void
    customer_has_active_cards() throws Exception {
        int cardCount = cardBackendService.getCardsOverview("MY123").size();
        assertThat(cardCount, greaterThan(2)); // should return 7
        assertThat(cardCount, lessThan(20)); // should return 7
    }
}
