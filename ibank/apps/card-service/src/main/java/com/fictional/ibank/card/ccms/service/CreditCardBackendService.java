package com.fictional.ibank.card.ccms.service;

import com.fictional.ibank.card.ccms.xmlmodel.*;
import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.card.service.CreditCardService;
import com.fictional.nfsx.domain.exception.InvalidParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Service
public class CreditCardBackendService  implements CreditCardService {

    private static final Logger LOG = LoggerFactory.getLogger(CreditCardBackendService.class);
    private ObjectFactory WS_FACTORY = new ObjectFactory();

    @Value("${nfs.ccms.card-customer-service.endpoint-url}")
    String endpointUrl;

    @Autowired
    private CardCustomerService cardCustomerService;

    @Override
    public Collection<CreditCard> getCardsOverview(@PathVariable("cust_id") @NotNull String id) throws Exception {
        if (id.length() < 3)  {
            LOG.info("invalid customer id {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer Id", id));
        }

        //TODO: can we use modelmapper to do this mapping?
        ArrayList<CreditCard> outputList = new ArrayList<>();
        for (com.fictional.ibank.card.ccms.xmlmodel.CreditCard card :
                getCardCustomerServiceProxy()
                .enquireLinkedCards(getRequestheader(id.substring(0, 2)), createCardCustomer(id.substring(2)))
                .getCreditCard()) {

            JAXBElement<String> cardNo = card.getCreditCardNo();
            JAXBElement<String> limit = card.getCreditLimit();
            if (cardNo != null && cardNo.getValue().length() > 4 && limit != null && !"0".equals(limit.getValue()))  {
                CreditCard targetCard = new CreditCard();
                targetCard.setCountryCode("MY");
                targetCard.setCustomerId(id.substring(2));
                targetCard.setProductName(cardNo.getValue());
                targetCard.setAvailableLimit(Double.valueOf(card.getAvailableCredit().getValue()));
                targetCard.setBalance(Double.valueOf(card.getCurrentBalance().getValue()));
                // it's a valid card
                outputList.add(targetCard);
            }
        }

        return outputList;
    }


    // use endpoint URL in application configuration to override
    // URL provided in WSDL file during generation.
    // probably a hack, but CXF documentation is unclear about how to
    // do this properly
    private CardCustomerService getCardCustomerServiceProxy() {
        ((BindingProvider) cardCustomerService).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
        return cardCustomerService;
    }

    private CardCustomer createCardCustomer(String customerId) {

        CardCustomer customer = WS_FACTORY.createCardCustomer();
        customer.setCustomerID(WS_FACTORY.createCardCustomerCustomerID(customerId));
        customer.setEntityType(WS_FACTORY.createCardCustomerEntityType("25"));
        customer.setOrganisationNo(WS_FACTORY.createCardCustomerOrganisationNo("001"));
        customer.setRequestFlag(WS_FACTORY.createCardCustomerRequestFlag("1020"));

        return customer;
    }

    private ServiceHeader getRequestheader(String country) {

        ServiceHeader header = WS_FACTORY.createServiceHeader();

        UserNameToken token = WS_FACTORY.createUserNameToken();
        token.setUserName(WS_FACTORY.createUserNameTokenUserName("IBNK"));
        token.setPassword(WS_FACTORY.createUserNameTokenPassword("IBNK"));
        header.setUserNameToken(WS_FACTORY.createServiceHeaderUserNameToken(token));

        header.setConsumerCountry(WS_FACTORY.createServiceHeaderConsumerCountry(country));
        header.setConsumerID(WS_FACTORY.createServiceHeaderConsumerID("IBNK"));
        header.setRequestID(WS_FACTORY.createServiceHeaderRequestID(String.valueOf(UUID.randomUUID())));
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        header.setServiceTimeStamp(WS_FACTORY.createServiceHeaderServiceTimeStamp(timestamp));
        header.setTargetFlag(WS_FACTORY.createServiceHeaderTargetFlag("1"));

        return header;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }
}
