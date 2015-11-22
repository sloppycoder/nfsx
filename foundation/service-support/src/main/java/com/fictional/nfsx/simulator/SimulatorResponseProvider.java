package com.fictional.nfsx.simulator;

import java.util.Map;

public class SimulatorResponseProvider {
    String filename;
    Map<String, String> headers = null;
    public SimulatorResponseProvider(String filename) { this.filename = filename; }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public Map<String, String> getHeaders() { return headers; }
    public void setHeaders(Map<String, String> headers) { this.headers = headers; }
}
