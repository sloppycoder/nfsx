package com.fictional.nfsx.test.helper;

import com.fictional.nfsx.annotation.Audited;
import org.springframework.stereotype.Component;

@Component
public class AuditTrailTestHelper {

    @Audited
    public void invokeSimpleArgument(String param1) {
        System.out.println("haha, i'm here. " + param1);
    }
}
