package com.fictional.nfsx.sample.test;

import com.fictional.nfsx.sample.TestWebAppApplication;
import com.fictional.nfsx.simulator.SimulatorAutoConfiguration;
import com.fictional.nfsx.simulator.SimulatorResponseProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestWebAppApplication.class, webEnvironment= WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test,h2")
public class SimulatorTests {

    @Autowired
    private TestRestTemplate template;

    @Autowired
    SimulatorResponseProvider responseProvider;

    @Test
    @Ignore
    public void simulator_responses_to_post() throws Exception {
        responseProvider.setFilename("test1.xml");
        String response = template.postForObject(SimulatorAutoConfiguration.CONTEXT_PATH, "Doesn't matter", String.class);
        assertTrue(response.contains("Hello"));
        assertTrue(response.contains("World"));
    }
}

