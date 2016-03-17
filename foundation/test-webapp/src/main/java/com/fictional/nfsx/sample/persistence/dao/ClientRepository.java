package com.fictional.nfsx.sample.persistence.dao;

import com.fictional.nfsx.sample.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
