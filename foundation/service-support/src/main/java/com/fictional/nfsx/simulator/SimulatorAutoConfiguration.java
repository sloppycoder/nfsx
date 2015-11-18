package com.fictional.nfsx.simulator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
public class SimulatorAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(SimulatorAutoConfiguration.class);
    public static final String CONTEXT_PATH = "/simulate";

    @Configuration
    @ConditionalOnExpression("${nfs.simulatorServlet.enabled:false}")
    public static class SimulatorConfiguration {

        private SimulatorResponseProvider responseProvider;

        public SimulatorConfiguration() {
            this.responseProvider = new SimulatorResponseProvider("application.yml");
        }

        @Bean
        public ServletRegistrationBean servletRegistrationBean(){
            SimulatorServlet servlet = new SimulatorServlet();
            servlet.setResponseProvider(this.responseProvider);
            return new ServletRegistrationBean(servlet, CONTEXT_PATH + "/*");
        }

        @Bean
        @ConditionalOnMissingBean(name = "simulatorResponseProvider")
        public SimulatorResponseProvider simulatorResponseProvider(){
            return this.responseProvider;
        }
    }
}

