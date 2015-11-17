package com.fictional.nfsx.domain.exception;

public class BackendServiceException extends Exception {
    public BackendServiceException(String message) {
        super(message);
    }
    public BackendServiceException(Exception cause) {
        super(cause);
    }
}
