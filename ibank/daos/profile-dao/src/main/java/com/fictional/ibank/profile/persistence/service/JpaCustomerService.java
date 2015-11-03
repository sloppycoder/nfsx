package com.fictional.ibank.profile.persistence.service;

import com.fictional.ibank.profile.service.CustomerService;
import com.fictional.nfs2.domain.exception.InvalidParameterException;
import com.fictional.nfs2.domain.exception.NoDataFoundException;
import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.profile.persistence.dao.CustomerEntityRepository;
import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;

@Service
public class JpaCustomerService implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(JpaCustomerService.class);

    @Autowired
    private CustomerEntityRepository customerEntityRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Customer getCustomer(@PathVariable("cust_id") @NotNull String id) throws Exception {

        if (id.length() < 3)  {
            LOG.info("invalid customer id {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer Id", id));
        }

        CustomerEntity customerEntity = customerEntityRepository.getCustomer(id.substring(0, 2), id.substring(2));
        if (customerEntity == null) {
            throw new NoDataFoundException("Customer not found");
        }

        Customer customer = modelMapper.map(customerEntity, Customer.class);
        return customer;
    }

    @Override
    public Customer getCustomerByLogin(@PathVariable("login_id") @NotNull String id) throws Exception {

        if (id.length() < 3)  {
            LOG.info("invalid customer login {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer login", id));
        }

        CustomerEntity customerEntity = customerEntityRepository.getCustomerByLogin(id.substring(0, 2), id.substring(2));
        if (customerEntity == null) {
            throw new NoDataFoundException("Customer not found");
        }

        Customer customer = modelMapper.map(customerEntity, Customer.class);
        return customer;
    }

    @Override
    public void addCustomer(Customer customer) throws InvalidParameterException {
        CustomerEntity customerEntity = modelMapper.map(customer, CustomerEntity.class);
        customerEntityRepository.save(customerEntity);
    }
}
