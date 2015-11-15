package com.fictional.nfs2.annotation;

public enum AuditActionType {
    NORMAL("NORMAL"), MASKED("MASKED"), SECURE("SECURE"), TRANSIENT("TRANSIENT");

    private String actionType;

    private AuditActionType(String s) {
        actionType = s;
    }

    public String getAuditActionType() {
        return actionType;
    }

}
