package com.fictional.ibank.card.test;

import com.fictional.ibank.card.model.CreditCard;
import com.fictional.ibank.card.service.CreditCardService;
import com.fictional.nfsx.domain.exception.InvalidParameterException;
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

import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CardDaoTestApplication.class)
@ActiveProfiles("test,h2")
@TestExecutionListeners({
DependencyInjectionTestExecutionListener.class,
FlywayTestExecutionListener.class
})
@FlywayTest
public class JpaCardServiceTests {

    @Autowired
    protected ApplicationContext context;

    @Autowired
    protected CreditCardService cardService;

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
    get_cards_for_valid_customer() throws Exception {
        Collection<CreditCard> cardList = cardService.getCardsOverview("MY123456");
        assertEquals(cardList.size(), 2);
    }

    @Test
    @FlywayTest
    public void
    no_cards_for_valid_customer() throws Exception {
        Collection<CreditCard> cardList = cardService.getCardsOverview("MY123457");
        assertEquals(cardList.size(), 0);
    }

    @Test(expected = InvalidParameterException.class)
    @FlywayTest
    public void
    exception_for_invalid_customer_id() throws Exception {
        cardService.getCardsOverview("SG"); // invalid customer id
    }

}

