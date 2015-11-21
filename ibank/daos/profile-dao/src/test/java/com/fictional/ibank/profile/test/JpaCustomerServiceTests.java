package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.model.Customer;
import com.fictional.ibank.profile.service.CustomerService;
import com.fictional.nfsx.domain.exception.NoDataFoundException;
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

import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProfileDaoTestApplication.class)
@ActiveProfiles("test,h2")
@TestExecutionListeners({
DependencyInjectionTestExecutionListener.class,
FlywayTestExecutionListener.class
})
@FlywayTest
public class JpaCustomerServiceTests {

    @Autowired
    protected ApplicationContext context;

    @Autowired
    protected CustomerService customerService;

    @Rule
    public TestName testName = new TestName();

    @After
    public void after() {
        Flyway flyway = context.getBean(Flyway.class);
        System.out.println(String.format("***** AFTER %s **********", testName.getMethodName()));

        MigrationInfoService info = flyway.info();
        System.out.println(info);
        for ( MigrationInfo mi : info.all() ) {
            System.out.println(String.format("\t%s\t%s\t%s", mi.getVersion(), mi.getScript(), mi.getType()));
        }
        System.out.println("***** END AFTER **********");
    }

    @Test
    @FlywayTest
    public void
    get_valid_customer() throws Exception {
        Customer customer = customerService.getCustomer("MY123456");
        assertTrue(customer.getName().equalsIgnoreCase("Hayashi San"));
    }

    @Test(expected = NoDataFoundException.class)
    @FlywayTest
    public void
    get_customer_not_found() throws Exception {
        customerService.getCustomer("SG1000"); // does not exist
    }

}

