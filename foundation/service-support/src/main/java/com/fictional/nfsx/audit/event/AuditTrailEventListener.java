package com.fictional.nfsx.audit.event;

import com.fictional.nfsx.audit.dao.AuditTrailEntityRepository;
import com.fictional.nfsx.audit.entity.AuditTrailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

public class AuditTrailEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(AuditTrailEventListener.class);

    @Autowired
    AuditTrailEntityRepository repo;

    @EventListener
    public void handleAuditTrailEvent(AuditTrailEvent event) {
        switch(event.getActionType()) {
            case DB:
                repo.save(new AuditTrailEntity(event));
                LOG.debug("saved event {} to audit DB", event);
                break;
            default:
                LOG.info("unable to handle audit trail event {}", event);
                break;
        }
    }

}
