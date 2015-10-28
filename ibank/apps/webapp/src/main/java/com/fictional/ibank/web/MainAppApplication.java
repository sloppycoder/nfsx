package com.fictional.ibank.web;

import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.web.service.profile.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
//@EnableZuulProxy
@Controller
@EnableOAuth2Sso
@EnableDiscoveryClient
@EnableFeignClients
public class MainAppApplication extends WebMvcConfigurerAdapter {

    @Autowired
    CustomerClient customerClient;

    @RequestMapping(value={"/dashboard"})
    public String showIndex(Map<String,Object> model) throws Exception {
        Customer customer = customerClient.getCustomer("MY123456");
        model.put("customer", customer);
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

