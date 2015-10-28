package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.ProfileServiceApplication;
import com.fictional.ibank.profile.persistence.dao.CustomerEntityRepository;
import com.fictional.ibank.profile.persistence.entity.CustomerEntity;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;
import org.flywaydb.test.annotation.FlywayTest;
import org.flywaydb.test.junit.FlywayTestExecutionListener;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/*
this test class serves as example for using FlywayTest support.
https://github.com/flyway/flyway-test-extensions/wiki/Usage-flyway-spring-test
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProfileServiceApplication.class)
@ActiveProfiles("test,h2")
@TestExecutionListeners({
DependencyInjectionTestExecutionListener.class,
FlywayTestExecutionListener.class
})
@WebAppConfiguration
@FlywayTest
public class CustomerEntityRepositoryTests {

    @Autowired
    protected ApplicationContext context;

    @Autowired
    CustomerEntityRepository customerEntityRepository;

    @Rule
    public TestName testName = new TestName();

    @After
    public void after() {
        Flyway flyway = context.getBean(Flyway.class);
        System.out.println(String.format("***** AFTER %s **********", testName.getMethodName()));

        MigrationInfoService  info = flyway.info();
        System.out.println(info);
        for ( MigrationInfo mi : info.all() ) {
            System.out.println(String.format("\t%s\t%s\t%s", mi.getVersion(), mi.getScript(), mi.getType()));
        }
        System.out.println("***** END AFTER **********");
    }

    @Test
    @FlywayTest
    public void testGetCustomer() throws Exception {
        CustomerEntity mario = customerEntityRepository.getCustomer("MY", "123456");
        assertTrue(mario.getName().equalsIgnoreCase("Hayashi San"));

        CustomerEntity nobody = customerEntityRepository.getCustomer("SG", "1000"); // does not exist
        assertNull(nobody);
    }

}

