package com.fictional.nfs2.service.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CORSFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(CORSFilter.class);

    @Autowired
    private Environment env;

    private List<String> listDomainsAllowed;
    private boolean isAnyDomainAllowed = false;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        validateRequestOriginInDomainsAllowed(response, request);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        chain.doFilter(req, res);
    }

    private void validateRequestOriginInDomainsAllowed(
    final HttpServletResponse res, final HttpServletRequest req) {
        final String originRequest = req.getHeader("origin");

        String anyDomainAllowed = "*";
        if (listDomainsAllowed == null) {
            final String domainsAccessControlAllowOrigin = getDomainsAccessControlAllowOrigin();
            final String delimiter = ",";
            if (anyDomainAllowed.equals(domainsAccessControlAllowOrigin)) {
                isAnyDomainAllowed = true;
            }
            final String[] domainsAllowed = StringUtils.tokenizeToStringArray(
            domainsAccessControlAllowOrigin, delimiter);
            listDomainsAllowed = new ArrayList<>(
            Arrays.asList(domainsAllowed));
        }
        if (isAnyDomainAllowed) {
            res.addHeader("Access-Control-Allow-Origin", anyDomainAllowed);
        } else if (listDomainsAllowed.contains(originRequest)
        && org.apache.commons.validator.routines.UrlValidator.getInstance().isValid(originRequest)) {
            res.addHeader("Access-Control-Allow-Origin", originRequest);
        }
    }

    private String getDomainsAccessControlAllowOrigin() {
        return env.getProperty("domains.access.control.allow.origin");
    }

    @Override
    public void init(FilterConfig filterConfig) {
        //nothing we need to do here
    }

    @Override
    public void destroy() {
        //nothing we need to do here
    }
}



