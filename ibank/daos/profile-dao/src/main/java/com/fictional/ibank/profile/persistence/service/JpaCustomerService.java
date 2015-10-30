package com.fictional.ibank.profile.persistence.service;

import com.fictional.nfs2.domain.exception.InvalidParameterException;
import com.fictional.nfs2.domain.exception.NoDataFoundException;
import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.profile.persistence.dao.CustomerEntityRepository;
import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaCustomerService {

    @Autowired
    private CustomerEntityRepository customerEntityRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Customer getCustomerByLogin(String country, String login) throws NoDataFoundException {

        CustomerEntity customerEntity = customerEntityRepository.getCustomerByLogin(country, login);
        if (customerEntity == null) {
            throw new NoDataFoundException("Customer not found");
        }

        Customer customer = modelMapper.map(customerEntity, Customer.class);
        return customer;
    }

    public Customer getCustomer(String country, String id) throws NoDataFoundException {
        CustomerEntity customerEntity = customerEntityRepository.getCustomer(country, id);
        if (customerEntity == null) {
            throw new NoDataFoundException("Customer not found");
        }

        Customer customer = modelMapper.map(customerEntity, Customer.class);
        return customer;
    }

    public void addCustomer(Customer customer) throws InvalidParameterException {
        CustomerEntity customerEntity = modelMapper.map(customer, CustomerEntity.class);
        customerEntityRepository.save(customerEntity);
    }
}
