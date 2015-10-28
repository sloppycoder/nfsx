package com.fictional.ibank.profile.api;

import com.fictional.nfs2.domain.exception.InvalidParameterException;
import com.fictional.ibank.profile.persistence.service.JpaCustomerService;
import com.fictional.ibank.profile.service.CustomerService;
import com.fictional.ibank.profile.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/")
@EnableResourceServer
public class CustomerResource extends ResourceServerConfigurerAdapter implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerResource.class);

    @Autowired
    JpaCustomerService customerService;

    @RolesAllowed("ROLE_USER")
    public     Customer getCustomer(@PathVariable("cust_id") @NotNull String id)
    throws Exception {

        if (id.length() < 3)  {
            LOG.info("invalid customer id {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer Id", id));
        }

        return customerService.getCustomer(id.substring(0, 2), id.substring(2));
    }

    @RolesAllowed("ROLE_USER")
    public Customer getCustomerByLogin(@PathVariable("login_id") @NotNull String id)
    throws Exception {

        if (id.length() < 3)  {
            LOG.info("invalid customer login {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer login", id));
        }

        return customerService.getCustomerByLogin(id.substring(0, 2), id.substring(2));
    }

    @RolesAllowed("ROLE_USER")
    public void addCustomer(@Valid @RequestBody Customer newCustomer)
    throws Exception {
        //TODO: somehow database auto generate timestamp not working
        newCustomer.setLastUpdate(new Date());
        customerService.addCustomer(newCustomer);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
        .antMatchers("/api")
        .and()
        .authorizeRequests()
        .anyRequest().authenticated();
    }
}

