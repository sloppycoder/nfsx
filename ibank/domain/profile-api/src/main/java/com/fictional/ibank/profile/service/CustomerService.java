package com.fictional.ibank.profile.service;

import com.fictional.ibank.profile.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public interface CustomerService {
    @RequestMapping(value="/customer/{cust_id}",  method= RequestMethod.GET )
    Customer getCustomer(@PathVariable("cust_id") @NotNull String id) throws Exception;

    @RequestMapping(value="/customer_by_login/{login_id}",  method= RequestMethod.GET )
    Customer getCustomerByLogin(@PathVariable("login_id") @NotNull String id) throws Exception;

    @RequestMapping(value="/customer", method= RequestMethod.POST)
    void addCustomer(@Valid @RequestBody Customer newCustomer) throws Exception;
}
