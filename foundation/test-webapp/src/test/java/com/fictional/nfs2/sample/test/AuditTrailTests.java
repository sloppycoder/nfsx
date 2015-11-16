package com.fictional.nfs2.sample.test;

import com.fictional.nfs2.audit.dao.AuditTrailEntityRepository;
import com.fictional.nfs2.sample.TestWebAppApplication;
import com.fictional.nfs2.sample.helper.AuditTrailTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestWebAppApplication.class)
@ActiveProfiles("test")
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
