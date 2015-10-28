package com.fictional.ibank.profile.api;


import com.fictional.nfs2.domain.exception.InvalidParameterException;
import com.fictional.nfs2.domain.exception.NoDataFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoDataFoundException.class)
    @ResponseBody
    public Map handleNoDataFound(HttpServletRequest req, Exception e) {
        logExceptionLocation(req, e);
        return exceptionToMap(e);
    }


    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler(InvalidParameterException.class)
    @ResponseBody
    public Map handleInvalidParameter(HttpServletRequest req, Exception e) {
        logExceptionLocation(req, e);
        return exceptionToMap(e);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Map handleValidationException(HttpServletRequest req, Exception e) {
        logExceptionLocation(req, e);
        return exceptionToMap(e);
    }

    private void logExceptionLocation(HttpServletRequest req, Exception e) {
        //TODO: extract call stack and log it
        String url = req.getRequestURL().toString();
        LOG.info("request {} caused exception {}", url, e.getMessage());
    }

    private Map exceptionToMap(Exception ex) {
        HashMap<String, String> exMap = new HashMap<>();
        exMap.put("exception", ex.getClass().getCanonicalName());
        exMap.put("message", ex.getMessage());
        if (ex.getCause() != null) {
            exMap.put("cause", ex.getCause().getMessage());
        }
        //TODO: add stack info?
        return exMap;
    }
}
