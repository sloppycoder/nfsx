package com.fictional.ibank.card.persistence.dao;


import com.fictional.ibank.card.persistence.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CreditCardEntityRepository extends CrudRepository<CreditCardEntity, Long> {

    @Query("select a from #{#entityName} a where a.countryCode = ?1 and a.customerId = ?2 ")
    Collection<CreditCardEntity> getCardsOverview(String countryCode, String customerId);
}
