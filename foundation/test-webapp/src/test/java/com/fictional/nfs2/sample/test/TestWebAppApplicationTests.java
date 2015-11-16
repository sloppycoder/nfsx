package com.fictional.nfs2.sample.test;

import com.fictional.nfs2.sample.TestWebAppApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestWebAppApplication.class)
@ActiveProfiles("test,h2")
@WebAppConfiguration
//@IntegrationTest("server.port:0")
public class TestWebAppApplicationTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {  mockMvc = MockMvcBuilders.webAppContextSetup(context).build(); }

    @Test
    public void contextLoads() {
    }

    @Test
    public void diashboard_displays() throws Exception {
        mockMvc.perform(get("/dashboard").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk()).andExpect(content().string(containsString("Mr. Bean")));
    }

}
