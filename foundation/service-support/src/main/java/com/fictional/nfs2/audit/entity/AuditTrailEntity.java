package com.fictional.nfs2.audit.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "nfs2_audit_log")
public class AuditTrailEntity extends AbstractPersistable<Long> {

    @Column(name = "user_name", length = 16, nullable = false)
    private String username;

    @Column(name = "action", length = 64, nullable = false)
    private String action;

    @Column(name = "param1", length = 1024, nullable = false)
    private String param1;

    @Column(name = "param2", length = 1024, nullable = false)
    private String param2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", columnDefinition = "timestamp default sysdate", nullable = false)
    private Date lastUpdate;

    public AuditTrailEntity(String username, String action, String param1, String param2) {
        super();
        this.username = username;
        this.action = action;
        this.param1 = param1;
        this.param2 = param2;
        this.lastUpdate = new Timestamp(new java.util.Date().getTime());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AuditTrailEntity that = (AuditTrailEntity) o;

        if (!username.equals(that.username)) return false;
        if (!action.equals(that.action)) return false;
        if (param1 != null ? !param1.equals(that.param1) : that.param1 != null) return false;
        if (param2 != null ? !param2.equals(that.param2) : that.param2 != null) return false;
        return lastUpdate.equals(that.lastUpdate);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + action.hashCode();
        result = 31 * result + (param1 != null ? param1.hashCode() : 0);
        result = 31 * result + (param2 != null ? param2.hashCode() : 0);
        result = 31 * result + lastUpdate.hashCode();
        return result;
    }
}
