package com.szk213.samples;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.support.DefaultComponent;

/**
 * Represents the component that manages {@link HelloEndpoint}.
 */
public class HelloComponent extends DefaultComponent {
    
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new HelloEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
