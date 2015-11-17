package com.fictional.nfs2.sample;

import com.fictional.nfs2.annotation.Audited;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
@Controller
@EnableWebMvc
public class TestWebAppApplication extends WebMvcConfigurerAdapter {

    @Audited
    @RequestMapping(value={"/dashboard"})
    public String showIndex(Map<String,Object> model) throws Exception {
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

