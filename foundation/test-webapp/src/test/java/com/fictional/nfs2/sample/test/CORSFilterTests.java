package com.fictional.nfs2.sample.test;

import com.fictional.nfs2.sample.TestWebAppApplication;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestWebAppApplication.class)
@ActiveProfiles("test")
@WebAppConfiguration
public class CORSFilterTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setup() { mockMvc = MockMvcBuilders.standaloneSetup(context).build(); }

    @Ignore
    @Test
    public void cors_headers_are_present() throws Exception {

        // @formatter:off
        MockHttpServletRequestBuilder request = options("/user");

        mockMvc.perform(request)
            .andExpect(status().isOk())
            .andExpect(header().string("Access-Control-Allow-Origin", "*"))
            .andExpect(header().string("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE"))
            .andExpect(header().string("Access-Control-Allow-Headers", "x-requested-with"));
        // @formatter:on
    }


}

