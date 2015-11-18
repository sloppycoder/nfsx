package com.fictional.nfsx.simulator;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class SimulatorServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(SimulatorServlet.class);

    private SimulatorResponseProvider responseProvider;

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        responseFromUrl(req, resp);
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{
        responseFromUrl(req, resp);
    }

    private void responseFromUrl(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        URL outFileUrl =  getClass().getClassLoader().getResource(responseProvider.getFilename());
        if (outFileUrl != null) {
            String ext = FilenameUtils.getExtension(responseProvider.getFilename()).toLowerCase();
            switch (ext) {
                case "xml":
                    resp.setContentType("application/xml");
                    break;
                case "json":
                    resp.setContentType("application/json");
                    break;
                case "txt":
                    resp.setContentType("text/plain");
                    break;
                default:
                    resp.setContentType("application/octet-stream");
            }

            Map<String, String> headers = (Map<String, String>) responseProvider.getHeaders();
            if (headers != null) {
                for (String key : headers.keySet()) {
                    resp.addHeader(key, headers.get(key));
                }
            }

            resp.setStatus(200);
            IOUtils.copy(outFileUrl.openStream(), resp.getOutputStream());
            LOG.info("responding {} using content from file {}. status 200", req.getMethod(), responseProvider.getFilename());
        } else {
            resp.setStatus(404);
            LOG.info("responding {} status 404", req.getMethod());
        }

    }

    public SimulatorResponseProvider getResponseProvider() {
        return responseProvider;
    }

    public void setResponseProvider(SimulatorResponseProvider responseProvider) {
        this.responseProvider = responseProvider;
    }
}
