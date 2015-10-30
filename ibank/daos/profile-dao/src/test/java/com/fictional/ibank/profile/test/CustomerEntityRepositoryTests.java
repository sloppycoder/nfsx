package com.fictional.ibank.profile.test;

import com.fictional.ibank.profile.ProfileDaoTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProfileDaoTestApplication.class)
public class CustomerEntityRepositoryTests {

    @Autowired
    protected ApplicationContext context;

//    @Autowired
//    protected CustomerEntityRepository customerEntityRepository;

    @Test
    public void testGetCustomer() throws Exception {
//        CustomerEntity mario = customerEntityRepository.getCustomer("MY", "123456");
//        assertTrue(mario.getName().equalsIgnoreCase("Hayashi San"));
//
//        CustomerEntity nobody = customerEntityRepository.getCustomer("SG", "1000"); // does not exist
//        assertNull(nobody);
    }

}

