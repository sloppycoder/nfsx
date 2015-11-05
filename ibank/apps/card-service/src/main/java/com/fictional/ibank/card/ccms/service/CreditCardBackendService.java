package com.fictional.ibank.card.ccms.service;

import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.card.service.CreditCardService;
import com.fictional.nfs2.domain.exception.InvalidParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.Collection;

@Service
public class CreditCardBackendService  implements CreditCardService {

    private static final Logger LOG = LoggerFactory.getLogger(CreditCardBackendService.class);

    @Autowired
    private CardCustomerBackendClient cardCustomerBackendClient;

    @Override
    public Collection<CreditCard> getCardsOverview(@PathVariable("cust_id") @NotNull String id) throws Exception {
        if (id.length() < 3)  {
            LOG.info("invalid customer id {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer Id", id));
        }

        //TODO: can we use modelmapper to do this mapping?
        ArrayList<CreditCard> outputList = new ArrayList<>();
        for (com.fictional.ibank.card.ccms.xmlmodel.CreditCard card :
                cardCustomerBackendClient.enquireLinkedCards(id.substring(0,2), id.substring(2))) {

            JAXBElement<String> cardNo = card.getCreditCardNo();
            JAXBElement<String> limit = card.getCreditLimit();
            if (cardNo != null && cardNo.getValue().length() > 4 && limit != null && !"0".equals(limit.getValue()))  {
                CreditCard targetCard = new CreditCard();
                targetCard.setCountryCode("MY");
                targetCard.setProductName(cardNo.getValue());
                targetCard.setAvailableLimit(Double.valueOf(card.getAvailableCredit().getValue()));
                targetCard.setBalance(Double.valueOf(card.getCurrentBalance().getValue()));
                // it's a valid card
                outputList.add(targetCard);
            }
        }

        return outputList;
    }
}
