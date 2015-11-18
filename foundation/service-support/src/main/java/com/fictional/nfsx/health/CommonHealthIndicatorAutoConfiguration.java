package com.fictional.nfsx.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration;
import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
 copied from:
 http://jdpgrailsdev.github.io/blog/2014/11/11/spring_boot_health_indicators_auto_config.html
 */


@Configuration
@AutoConfigureBefore({EndpointAutoConfiguration.class})
@AutoConfigureAfter({HealthIndicatorAutoConfiguration.class})
public class CommonHealthIndicatorAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(CommonHealthIndicatorAutoConfiguration.class);

    @Configuration
    @ConditionalOnExpression("${nfs.commonHealthIndicator.enabled:true}")
    public static class CommonHealthIndicatorConfiguration {

        @Autowired
        private HealthAggregator healthAggregator;

        @Bean
        @ConditionalOnMissingBean(name = "commonHealthIndicator")
        public HealthIndicator commonHealthIndicator() {
            LOG.info("CommonHealthIndicator registered");
            return new BuildInfoHealthCheck();
       }
    }
}
