package com.fictional.ibank.card.ccms.service;

import com.fictional.ibank.card.ccms.xmlmodel.*;
import com.fictional.nfs2.domain.exception.BackendServiceException;
import com.fictional.nfs2.domain.exception.NoDataFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CardCustomerBackendClient {

    private static final Logger LOG = LoggerFactory.getLogger(CardCustomerBackendClient.class);
    public static final QName SERVICE_NAME = new QName("http://services.cards.common.scb", "CardCustomerService");
    private ObjectFactory WS_FACTORY = new ObjectFactory();

    private CardCustomerService wsPort = null;

    public CardCustomerService getWsPort() {
        return wsPort;
    }

    public void setWsPort(CardCustomerService wsPort) {
        this.wsPort = wsPort;
    }

    public List<CreditCard> enquireLinkedCards(String country, String customerId)
    throws NoDataFoundException, BackendServiceException {

        String responseCode = null;
        try {
            CardCustomer response = getWsPort().enquireLinkedCards(getRequestheader(country), createCardCustomer(customerId));
            responseCode = response.getResponse().getValue().getResponseCode().getValue();
            if ("00000".equals(responseCode)) {
                return response.getCreditCard();
            }
        } catch (Exception e) {
            throw new BackendServiceException(e);
        }

        throw new NoDataFoundException("No credit card found. response code is " + responseCode);
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
}
