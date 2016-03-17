package com.fictional.nfsx.sample.test;

import com.fictional.nfsx.sample.TestWebAppApplication;
import com.fictional.nfsx.simulator.SimulatorAutoConfiguration;
import com.fictional.nfsx.simulator.SimulatorResponseProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestWebAppApplication.class)
@WebAppConfiguration
@ActiveProfiles("test,h2")
@IntegrationTest("server.port:0")
public class SimulatorTests {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    SimulatorResponseProvider responseProvider;

    private RestTemplate template = new TestRestTemplate();

    @Test
    public void simulator_responses_to_post() throws Exception {
        responseProvider.setFilename("test1.xml");
        String response = template.postForObject(new URI(getFullUrl()), "Doesn't matter", String.class);
        assertTrue(response.contains("Hello"));
        assertTrue(response.contains("World"));
    }

    private String getFullUrl() {
        return "http://localhost:" + port + SimulatorAutoConfiguration.CONTEXT_PATH;
    }
}

