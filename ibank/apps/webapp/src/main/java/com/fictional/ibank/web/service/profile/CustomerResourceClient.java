package com.fictional.ibank.web.service.profile;

import com.fictional.ibank.profile.service.CustomerService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("profilesvc")
public interface CustomerResourceClient extends CustomerService {
}
