package com.fictional.nfs2.test.helper;

import com.fictional.nfs2.annotation.Audited;
import org.springframework.stereotype.Component;

@Component
public class AuditTrailTestHelper {

    @Audited
    public void invokeSimpleArgument(String param1) {
        System.out.println("haha, i'm here. " + param1);
    }
}
