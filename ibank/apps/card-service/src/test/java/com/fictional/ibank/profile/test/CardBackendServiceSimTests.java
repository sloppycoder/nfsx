package com.fictional.ibank.profile.test;

import com.fictional.ibank.card.CardServiceApplication;
import com.fictional.ibank.card.ccms.service.CreditCardBackendService;
import com.fictional.nfsx.simulator.SimulatorAutoConfiguration;
import com.fictional.nfsx.simulator.SimulatorResponseProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CardServiceApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test,h2")
public class CardBackendServiceSimTests {

    @LocalServerPort
    private int port;

    @Autowired
    private CreditCardBackendService cardBackendService;

    @Autowired
    SimulatorResponseProvider responseProvider;

    @Test
    public void
    customer_has_active_cards() throws Exception {
        responseProvider.setFilename("xml/enquire_linked_cards_response_success.xml");
        cardBackendService.setEndpointUrl(getFullUrl());
        int cardCount = cardBackendService.getCardsOverview("MY123").size();
        assertThat(cardCount, greaterThan(2)); // should return 7
        assertThat(cardCount, lessThan(20));
    }

    @Test
    public void
    customer_has_no_card() throws Exception {
        responseProvider.setFilename("xml/enquire_linked_cards_response_not_found.xml");
        cardBackendService.setEndpointUrl(getFullUrl());
        int cardCount = cardBackendService.getCardsOverview("MY321").size();
        assertEquals(cardCount, 0);
    }

    private String getFullUrl() {
        return "http://localhost:" + port +  SimulatorAutoConfiguration.CONTEXT_PATH;
    }

}
