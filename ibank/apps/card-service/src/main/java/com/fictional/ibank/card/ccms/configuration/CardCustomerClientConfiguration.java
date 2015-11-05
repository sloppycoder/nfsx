package com.fictional.ibank.card.ccms.configuration;

import com.fictional.ibank.card.ccms.service.CardCustomerBackendClient;
import com.fictional.ibank.card.ccms.xmlmodel.CardCustomerService;
import com.fictional.ibank.card.ccms.xmlmodel.CardCustomerService_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.BindingProvider;
import java.net.URL;

@Configuration
public class CardCustomerClientConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(CardCustomerClientConfiguration.class);

    @Value("${nfs2.ccms.card-customer-service.endpoint-url}")
    String endpointUrl;

    @Bean
    public CardCustomerBackendClient cardCustomerClient(){
        CardCustomerBackendClient client = new CardCustomerBackendClient();
        try {
            URL wsdlURL = getClass().getClassLoader().getResource("wsdl/CardCustomerService.wsdl");
            CardCustomerService_Service service = new CardCustomerService_Service(wsdlURL, CardCustomerBackendClient.SERVICE_NAME);
            CardCustomerService port = service.getCardCustomerService0();
            ((BindingProvider) port).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            client.setWsPort(port);
        } catch (Exception e) {
            LOG.warn("Unable to initialize CardCustomerClient", e);
        }
        return client;
    }
}
