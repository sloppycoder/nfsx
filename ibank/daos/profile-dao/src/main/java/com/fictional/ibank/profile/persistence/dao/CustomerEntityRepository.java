package com.fictional.ibank.profile.persistence.dao;


import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerEntityRepository extends CrudRepository<CustomerEntity, Long> {

    @Query("select a from #{#entityName} a where a.countryCode = ?1 and a.customerId = ?2 ")
    CustomerEntity getCustomer(String countryCode, String customerId);

    @Query("select a from #{#entityName} a where a.countryCode = ?1 and a.login = ?2 ")
    CustomerEntity getCustomerByLogin(String countryCode, String login);
}
