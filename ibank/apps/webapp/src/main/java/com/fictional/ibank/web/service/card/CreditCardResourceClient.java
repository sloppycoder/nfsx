package com.fictional.ibank.web.service.card;

import com.fictional.ibank.card.service.CreditCardService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("card-service")
public interface CreditCardResourceClient extends CreditCardService{
}
