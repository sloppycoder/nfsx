package com.fictional.nfs2.service.config;

import com.fictional.nfs2.service.filter.CORSFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
public class CORSFilterAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(CORSFilterAutoConfiguration.class);

    @Configuration
    @ConditionalOnExpression("${nfs2.commonCORSFilter.enabled:true}")
    public static class CORSFilterConfiguration {

        @Bean
        @ConditionalOnMissingBean(name = "commonCORSFilter")
        public CORSFilter commonCORSFilter() {
            LOG.info("CORSFilter registered");
            return new CORSFilter();
        }
    }
}
