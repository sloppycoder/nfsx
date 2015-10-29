package com.fictional.ibank.web;

import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.web.service.profile.CustomerClient;
import com.fictional.ibank.web.service.profile.CustomerServiceProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
//@EnableZuulProxy
@Controller
@ComponentScan
@EnableOAuth2Sso
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class MainAppApplication extends WebMvcConfigurerAdapter {

    @Autowired
    CustomerServiceProxy customerServiceProxy;

    @RequestMapping(value={"/dashboard"})
    public String showIndex(Map<String,Object> model) throws Exception {
        model.put("customer", customerServiceProxy.getCustomerFromBackend());
        return "dashboard";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping("/")
    public String index() { return "redirect:dashboard"; }

    public static void main(String[] args) {
            SpringApplication.run(MainAppApplication.class, args);
        }

}

