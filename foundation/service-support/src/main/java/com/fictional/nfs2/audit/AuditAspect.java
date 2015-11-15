package com.fictional.nfs2.audit;

import com.fictional.nfs2.annotation.Audited;
import com.fictional.nfs2.audit.dao.AuditTrailEntityRepository;
import com.fictional.nfs2.audit.entity.AuditTrailEntity;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    private static final Logger LOG = LoggerFactory.getLogger(AuditAspect.class);

    @Autowired
    AuditTrailEntityRepository auditRepo;

    @After("@annotation(audited)")
    public void logAuditActivity(JoinPoint jp, Audited audited) {

        String username = "unknown";
        String action = "log type " + audited.actionType().getAuditActionType();

        try {
            username = SecurityContextHolder.getContext().getAuthentication().getName();
        } catch (Exception e) {
            LOG.info("Unable to get username {}", e.getMessage());
        }

        Object args = jp.getArgs();

        LOG.info("Audit trail - username {}, action {}, param1 {}", username, action, ((Object[]) args)[0].toString());

        auditRepo.save(new AuditTrailEntity(username, action, "param1", "param2"));
    }
}
