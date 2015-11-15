package com.fictional.nfs2.domain.exception;

public class BackendServiceException extends Exception {
    public BackendServiceException(String message) {
        super(message);
    }
    public BackendServiceException(Exception cause) {
        super(cause);
    }
}
