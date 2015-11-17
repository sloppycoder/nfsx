package com.fictional.ibank.card.api;

import com.fictional.ibank.card.ccms.service.CreditCardBackendService;
import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.card.persistence.service.JpaCreditCardService;
import com.fictional.ibank.card.service.CreditCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@RestController
@EnableResourceServer
public class CardResource extends ResourceServerConfigurerAdapter implements CreditCardService {

    private static final Logger LOG = LoggerFactory.getLogger(CardResource.class);

    @Autowired
    private JpaCreditCardService cardJpaService;

    @Autowired
    private CreditCardBackendService cardBackendService;


    @Override
    @RolesAllowed("ROLE_USER")
    public Collection<CreditCard> getCardsOverview(@PathVariable("cust_id") @NotNull String id) throws Exception {
        try {
            return getCardOverviewOnline(id);
        } catch (Exception e) {
            LOG.info("Falling back to getCardOverviewOffline", e);
            return getCardOverviewOffline(id);
        }
    }

    //TODO: enable this later, not working at the moment
    // @HystrixCommand(fallbackMethod = "getCardOverviewOffline")
    private Collection<CreditCard> getCardOverviewOnline(String id) throws Exception {
        return cardBackendService.getCardsOverview(id);
    }

    private Collection<CreditCard> getCardOverviewOffline(String id) throws Exception {
        return cardJpaService.getCardsOverview(id);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // without this block the unit tests fails, why??
        // @formatter:off
        http
            .requestMatchers()
            .antMatchers("/**")
        .and()
            .authorizeRequests()
            .anyRequest()
            .authenticated();
        // @formatter:on
    }

}

