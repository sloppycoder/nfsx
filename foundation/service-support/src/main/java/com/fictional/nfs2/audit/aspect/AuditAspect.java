package com.fictional.nfs2.audit.aspect;

import com.fictional.nfs2.annotation.AuditActionType;
import com.fictional.nfs2.annotation.Audited;
import com.fictional.nfs2.audit.event.AuditTrailEvent;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    private static final Logger LOG = LoggerFactory.getLogger(AuditAspect.class);

    private final ApplicationEventPublisher publisher;

    @Autowired
    public AuditAspect(ApplicationEventPublisher publisher) { this.publisher = publisher; }

    @After("@annotation(audited)")
    public void doAudit(JoinPoint jp, Audited audited) {

        String username = "unknown";
        String action = "log type " + audited.actionType().getAuditActionType();

        try {
            username = SecurityContextHolder.getContext().getAuthentication().getName();
        } catch (Exception e) {
            LOG.info("Unable to get username {}", e.getMessage());
        }

        Object args = jp.getArgs();
        AuditTrailEvent event = new AuditTrailEvent(audited.actionType(), username, action, ((Object[]) args)[0].toString(), "");
        LOG.info("{}", event);
        publisher.publishEvent(event);
        publisher.publishEvent(new AuditTrailEvent(AuditActionType.JMS_QUEUE, username, action, ((Object[]) args)[0].toString(), ""));
    }
}
