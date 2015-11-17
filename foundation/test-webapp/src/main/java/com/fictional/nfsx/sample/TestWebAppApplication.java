package com.fictional.nfsx.sample;

import com.fictional.nfsx.annotation.Audited;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

/**

To test CORS functionality,

curl -v -X OPTIONS http://localhost:8080/user \
  -H 'Origin: http://localhost:9292' \
  -H 'Access-Control-Request-Headers: Origin, Accept, Content-Type' \
  -H 'Access-Control-Request-Method: GET'

output:

> OPTIONS /user HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.43.0
> Accept: * /*

> Origin: http://localhost:9000
> Access-Control-Request-Headers: Origin
> Access-Control-Request-Method: PUT
>

 < HTTP/1.1 200 OK
< Server: Apache-Coyote/1.1
< X-Application-Context: test-webapp:8080
< Access-Control-Allow-Origin: http://localhost:9000
< Vary: Origin
< Access-Control-Allow-Methods: GET,POST,DELETE,PUT
< Access-Control-Allow-Headers: Origin
< Access-Control-Allow-Credentials: true
< Access-Control-Max-Age: 3600
< Allow: GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH
< Content-Length: 0
< Date: Tue, 17 Nov 2015 17:32:06 GMT


**/

@SpringBootApplication
@Controller
@EnableWebMvc
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

    @Audited
    @RequestMapping(value = {"/dashboard"})
    public String showIndex(Map<String, Object> model) throws Exception {
        model.put("customer", "Mr. Bean");
        return "dashboard";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }



    public static void main(String[] args) {
        SpringApplication.run(TestWebAppApplication.class, args);
    }

}

