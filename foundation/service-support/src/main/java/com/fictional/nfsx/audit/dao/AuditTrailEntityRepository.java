package com.fictional.nfsx.audit.dao;

import com.fictional.nfsx.audit.entity.AuditTrailEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuditTrailEntityRepository  extends CrudRepository<AuditTrailEntity, Long> {
}
