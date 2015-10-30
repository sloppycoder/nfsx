package com.fictional.ibank.web;

import com.fictional.ibank.web.service.profile.CustomerServiceProxy;
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

    @Value("${security.oauth2.client.ssoLogoutUrl}")
    String ssoLogoutUrl;

    @Autowired
    CustomerServiceProxy customerServiceProxy;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ssologout").setViewName("ssologout");
    }

    @RequestMapping(value = {"/dashboard"})
    public String showDashboard(Map<String, Object> model) throws Exception {
        model.put("customer", customerServiceProxy.getCustomerFromBackend());
        model.put("sso_logout_url", ssoLogoutUrl);
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
                .antMatchers("/", "/ssologout").permitAll()
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
