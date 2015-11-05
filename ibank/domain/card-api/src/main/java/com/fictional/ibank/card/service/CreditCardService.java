package com.fictional.ibank.card.service;

import com.fictional.ibank.card.model.CreditCard;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotNull;
import java.util.Collection;


public interface CreditCardService {
    @RequestMapping(value="/cards_overview/{cust_id}",  method= RequestMethod.GET)
    Collection<CreditCard> getCardsOverview(@PathVariable("cust_id") @NotNull String id) throws Exception;
}
