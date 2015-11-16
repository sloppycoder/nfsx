package com.fictional.nfs2.annotation;

public enum AuditActionType {
    DB("DB"), JMS_QUEUE("JMS_QUEUE"), JMS_TOPIC("JMS_TOPIC"), CUSTOM("CUSTOM");

    private String actionType;

    private AuditActionType(String s) {
        actionType = s;
    }

    public String getAuditActionType() {
        return actionType;
    }

}
