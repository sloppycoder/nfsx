package com.fictional.nfs2.audit.event;

import com.fictional.nfs2.annotation.AuditActionType;

import java.sql.Timestamp;

public class AuditTrailEvent {
    private String username;
    private String action;
    private String param1;
    private String param2;
    private Timestamp eventTimestamp;
    private AuditActionType actionType;

    public AuditTrailEvent() {};

    public AuditTrailEvent(AuditActionType actionType, String username, String action, String param1, String param2) {
        this.actionType = actionType;
        this.username = username;
        this.action = action;
        this.param1 = param1;
        this.param2 = param2;
        this.eventTimestamp = new Timestamp(new java.util.Date().getTime());
    }

    public String toString() {
        return String.format("AuditTrailEvent - type: %s, username: %s, action: %s, param1: %s, param2: %s ",
                                actionType, username, action, param1, param2);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Timestamp getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(Timestamp eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public AuditActionType getActionType() {
        return actionType;
    }

    public void setActionType(AuditActionType actionType) {
        this.actionType = actionType;
    }
}
