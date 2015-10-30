package com.fictional.ibank.web.service.profile;

import com.fictional.ibank.profile.service.CustomerService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("profile-service")
public interface CustomerResourceClient extends CustomerService {
}
