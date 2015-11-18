package com.fictional.ibank.web;

import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.web.service.card.CreditCardResourceClient;
import com.fictional.ibank.web.service.profile.CustomerServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@SpringBootApplication
//@EnableZuulProxy
@Controller
@ComponentScan
@EnableOAuth2Sso
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class MainAppApplication extends WebMvcConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(MainAppApplication.class);

    @Value("${security.oauth2.client.ssoLogoutUri}")
    String ssoLogoutUri;

    @Autowired
    CustomerServiceProxy customerServiceProxy;

    @Autowired
    CreditCardResourceClient creditCardClient;

    @Value("${server.context-path}")
    String contextPath;


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/autologout").setViewName("autologout");
    }

    @RequestMapping(value = {"/autologout"})
    public String autoLogout(Map<String, Object> model) throws Exception {
        model.put("context", contextPath);
        return "autologout";
    }

    @RequestMapping(value = {"/dashboard"})
    public String showDashboard(Map<String, Object> model) throws Exception {

        Collection<CreditCard> cards;
        try {
            cards = creditCardClient.getCardsOverview("MY123456");
        } catch (Exception e) {
            LOG.warn("Cannot retrieve card overview {}", e);
            cards = new ArrayList<CreditCard>();
        }

        model.put("cards", cards);
        model.put("customer", customerServiceProxy.getCustomerFromBackend());
        model.put("sso_logout_url", ssoLogoutUri);

        return "dashboard";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping("/")
    public String index() {
        return "redirect:dashboard";
    }

    public static void main(String[] args) {
        SpringApplication.run(MainAppApplication.class, args);
    }

    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {

        @Autowired
        private SecurityProperties security;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // @formatter:off
            http
                .authorizeRequests()
                    .antMatchers("/").permitAll()
                    .anyRequest().fullyAuthenticated()
            .and()
                .formLogin()
                    .loginPage("/login").failureUrl("/login?error")
                .permitAll()
            .and()
                .logout().permitAll();
            // @formatter:on
        }

    }

}
