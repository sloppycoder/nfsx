package com.fictional.nfs2.audit.config;

import com.fictional.nfs2.audit.aspect.AuditAspect;
import com.fictional.nfs2.audit.entity.AuditTrailEntity;
import com.fictional.nfs2.audit.event.AuditTrailEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@AutoConfigureAfter({JpaRepositoriesAutoConfiguration.class})
public class AuditAspectAutoConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(AuditAspectAutoConfiguration.class);

    @Configuration
    @ConditionalOnExpression("${nfs2.auditAspect.enabled:true}")
    @EnableAspectJAutoProxy
    @EntityScan(basePackageClasses = AuditTrailEntity.class)
    @EnableJpaRepositories("com.fictional.nfs2.audit.dao")
    public static class AuditAspectConfiguration implements ApplicationEventPublisherAware {
        private ApplicationEventPublisher publisher;

        public AuditAspectConfiguration() {};


        public AuditAspectConfiguration(ApplicationEventPublisher applicationEventPublisher) {
            this.publisher = applicationEventPublisher;
        }

        @Bean
        @ConditionalOnMissingBean(name = "auditAspect")
        public AuditAspect auditAspect() {
            LOG.info("AuditAspect registered");
            return new AuditAspect(this.publisher);
        }

        @Bean
        @ConditionalOnMissingBean(name = "auditTrailEventListener")
        public AuditTrailEventListener auditTrailEventListener() {
            return new AuditTrailEventListener();
        }

        @Override
        public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
            this.publisher = applicationEventPublisher;
        }
    }
}
