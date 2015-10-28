package com.fictional.nfs2.sample.test;

import com.fictional.nfs2.sample.MinimalServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MinimalServiceApplication.class)
@WebAppConfiguration
@ActiveProfiles("test,h2")
public class MinimalServiceApplicationTests {
	@Test
	public void contextLoads() {
	}

}
