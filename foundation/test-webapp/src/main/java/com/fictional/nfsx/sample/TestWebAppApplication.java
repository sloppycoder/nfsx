package com.fictional.nfsx.sample;

import com.fictional.nfsx.sample.persistence.entity.Client;
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
        model.put("user", user == null ? "anonymous" : user.getName());
        return "dashboard";
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

    public static void main(String[] args) {
        SpringApplication.run(TestWebAppApplication.class, args);
    }

}

