package com.fictional.nfsx.sample.persistence.dao;

import com.fictional.nfsx.sample.persistence.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ClientRepository extends CrudRepository<Client, Long> {
    @Query("from #{#entityName} a where a.relationshipManagerId = ?1 ")
    Collection<Client> getClientForUser(String user);
}
