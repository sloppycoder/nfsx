package com.fictional.nfsx.simulator;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Map;

public class SimulatorResponseProvider {
    String filename;
    Map headers = null;
    public SimulatorResponseProvider(String filename) { this.filename = filename; }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public Map getHeaders() {
        return headers;
    }
    public void setHeaders(Map headers) {
        this.headers = headers;
    }
    public void setHeaders(String[] headers) {
        this.headers = ArrayUtils.toMap(headers);
    }
}
