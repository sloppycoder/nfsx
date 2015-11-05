package com.fictional.ibank.card.persistence.service;

import com.fictional.ibank.card.service.CreditCardService;
import com.fictional.nfs2.domain.exception.InvalidParameterException;
import com.fictional.nfs2.domain.exception.NoDataFoundException;
import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.card.persistence.dao.CreditCardEntityRepository;
import com.fictional.ibank.card.persistence.entity.CreditCardEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Type;
import java.util.Collection;

@Service
public class JpaCreditCardService implements CreditCardService {

    private static final Logger LOG = LoggerFactory.getLogger(JpaCreditCardService.class);

    @Autowired
    private CreditCardEntityRepository creditCardEntityRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Collection<CreditCard> getCardsOverview(@PathVariable("cust_id") @NotNull String id) throws Exception {
        if (id.length() < 3)  {
            LOG.info("invalid customer id {}", id);
            throw new InvalidParameterException(String.format("%s is not a valid customer Id", id));
        }

        Collection<CreditCardEntity> cardList = creditCardEntityRepository.getCardsOverview(id.substring(0, 2), id.substring(2));
        if (cardList == null) {
            throw new NoDataFoundException("no card information available");
        }

        Type targetType = new TypeToken<Collection<CreditCard>>() {}.getType();
        Collection<CreditCard> targetList = modelMapper.map(cardList, targetType);
        return targetList;
    }
}
