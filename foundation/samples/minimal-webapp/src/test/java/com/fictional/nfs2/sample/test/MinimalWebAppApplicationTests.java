package com.fictional.nfs2.sample.test;

import com.fictional.nfs2.sample.MinimalWebAppApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MinimalWebAppApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class MinimalWebAppApplicationTests {
    @Test
    public void contextLoads() {
    }
}
