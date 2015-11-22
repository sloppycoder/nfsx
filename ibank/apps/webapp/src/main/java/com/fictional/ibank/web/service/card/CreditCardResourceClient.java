package com.fictional.ibank.web.service.card;

import com.fictional.ibank.card.service.CreditCardService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("cardsvc")
public interface CreditCardResourceClient extends CreditCardService{
}
