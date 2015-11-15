package com.fictional.nfs2.audit.dao;

import com.fictional.nfs2.audit.entity.AuditTrailEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuditTrailEntityRepository  extends CrudRepository<AuditTrailEntity, Long> {
}
