package com.fictional.ibank.profile.api;

import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.profile.persistence.service.JpaCustomerService;
import com.fictional.ibank.profile.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

@RestController
@EnableResourceServer
public class CustomerResource extends ResourceServerConfigurerAdapter implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerResource.class);

    @Autowired
    JpaCustomerService customerService;

    @Override
    @RolesAllowed("ROLE_USER")
    public     Customer getCustomer(@PathVariable("cust_id") @NotNull String id)
    throws Exception {
        return customerService.getCustomer(id);
    }

    @Override
    @RolesAllowed("ROLE_USER")
    public Customer getCustomerByLogin(@PathVariable("login_id") @NotNull String id)
    throws Exception {
        return customerService.getCustomerByLogin(id);
    }

    @Override
    @RolesAllowed("ROLE_USER")
    public void addCustomer(@Valid @RequestBody Customer newCustomer)
    throws Exception {
        //TODO: somehow database auto generate timestamp not working
        newCustomer.setLastUpdate(new Date());
        customerService.addCustomer(newCustomer);
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

