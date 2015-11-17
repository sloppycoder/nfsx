package com.fictional.nfsx.service.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import java.util.Properties;

public class BuildInfoHealthCheck implements HealthIndicator {

    private static final Logger LOG = LoggerFactory.getLogger(BuildInfoHealthCheck.class);

    private static Properties buildProps = new Properties();

    @Override
    public Health health() {
        Properties props = getBuildInfo();

        if (props.isEmpty() ||
        props.getProperty("git.commit.id").contains("@") ||
        props.getProperty("git.commit.id.describe").endsWith("dirty") ) {
            // the build that does not have a invalid git.commit.id or
            // was created with local uncommitted file is considered unhealthy
            // for production environment
            return Health.unknown().withDetail("build", props).build();
        }

        return Health.up().withDetail("build", props).build();
    }

    private Properties getBuildInfo() {
        if (buildProps.isEmpty()) {
            try {
                buildProps.load(getClass().getClassLoader().getResourceAsStream("build-info.properties"));
            } catch (Exception e) {
                LOG.warn("unable to read build-info.properties", e);
                buildProps = new Properties();
            }
        }
        return buildProps;
    }

}
