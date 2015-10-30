package com.fictional.ibank.web.service.profile;

import com.fictional.ibank.profile.model.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceProxy {

    @Autowired
    CustomerResourceClient customerResourceClient;

    @HystrixCommand(fallbackMethod = "anonymousCustomer")
    public Customer getCustomerFromBackend() throws Exception {
       return customerResourceClient.getCustomer("MY123456");
    }

    public Customer anonymousCustomer(){
        Customer anonymouse = new Customer();
        anonymouse.setName("Anonymous User");
        return anonymouse;
    }


}
