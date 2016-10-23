package com.fictional.nfsx.test;

import com.fictional.nfsx.audit.dao.AuditTrailEntityRepository;
import com.fictional.nfsx.test.helper.AuditTrailTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class AuditTrailTests {

    @Autowired
    AuditTrailEntityRepository repo;

    @Autowired
    AuditTrailTestHelper helper;

    @Test
    public void
    audit_trail_created_after_method_call() {
        assertThat(repo.count(), equalTo(0L));
        helper.invokeSimpleArgument("audit this");
        assertThat(repo.count(), equalTo(1L));
    }
}
