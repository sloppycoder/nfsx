package com.fictional.nfsx.sample;

import com.fictional.nfsx.sample.helper.AutowireHelper;
import com.fictional.nfsx.sample.persistence.dao.ClientRepository;
import com.fictional.nfsx.sample.persistence.entity.Client;
import com.fictional.nfsx.sample.security.CryptoKeyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.ManagementServerProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.security.Principal;
import java.util.Collection;
import java.util.Map;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Controller
@ComponentScan
@EntityScan(basePackageClasses=Client.class)
@EnableJpaRepositories("com.fictional.nfsx.sample.persistence.dao")
public class TestWebAppApplication extends WebMvcConfigurerAdapter {

    @Value("${cors.allow.origin}")
    private String originDomain;

    @Autowired
    private ClientRepository clientRepo;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // @formatter:off
                registry
                    .addMapping("/**")
                        .allowedOrigins(originDomain)
                        .allowedMethods("GET","POST", "DELETE", "PUT")
                        .maxAge(3600);
                // @formatter:on
            }
        };
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/dashboard").setViewName("dashboard");
    }

    @RequestMapping(value = {"/dashboard"})
    public String showDashboard(Map<String, Object> model, Principal user) throws Exception {

        String username =  user == null ? "anonymous" : user.getName();
        Collection<Client> clientList = clientRepo.getClientForUser(username);

//        if (clientList.size() <= 0) {
//            fabricateClientData(username);
//            clientList = clientRepo.getClientForUser(username);
//        }

        model.put("clients", clientList);
        model.put("user", username);

        return "dashboard";
    }

    private void fabricateClientData(String username) {

        Client c1, c2;

        if ("joe".equalsIgnoreCase(username)) {
            c1 = new Client();
            c1.setClientId("C101");
            c1.setCountryCode("HK");
            c1.setName("JACKIE CHAN");
            c1.setRelationshipManagerId("joe");

            c2 = new Client();
            c2.setClientId("C102");
            c2.setCountryCode("HK");
            c2.setName("CHOW YON FAT");
            c2.setRelationshipManagerId("joe");

            clientRepo.save(c1);
            clientRepo.save(c2);
            clientRepo.flush();

        } else if ("mary".equalsIgnoreCase(username)) {
            c1 = new Client();
            c1.setClientId("C010");
            c1.setCountryCode("SG");
            c1.setName("BILL WINTERS");
            c1.setRelationshipManagerId("mary");

            clientRepo.save(c1);
            clientRepo.flush();
        }

    }

    @RequestMapping("/")
    public String index() {
        return "redirect:dashboard";
    }


    @Configuration
    @Order(ManagementServerProperties.ACCESS_OVERRIDE_ORDER)
    protected static class LoginConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private DataSource dataSource;

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            // http://stackoverflow.com/questions/22886186/how-to-setup-access-control-allow-origin-filter-problematically-in-spring-securi
            // @formatter:off
            http
                .csrf().ignoringAntMatchers("/logout")
            .and()
                .formLogin().loginPage("/login").permitAll()
            .and()
                .authorizeRequests()
                .anyRequest().authenticated()
            .and()
                .logout()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/")
                .permitAll();
            // @formatter:on
        }


        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            // @formatter:off
            auth.jdbcAuthentication()
                .dataSource(this.dataSource)
                .usersByUsernameQuery(
                        "select username, password, enabled from users where username=?")
                .authoritiesByUsernameQuery(
                        "select username, authority from authorities where username=?");
            // @formatter:on
        }

    }

    @Bean
    public AutowireHelper autowireHelper(){
        return AutowireHelper.getInstance();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestWebAppApplication.class, args);
    }

}

