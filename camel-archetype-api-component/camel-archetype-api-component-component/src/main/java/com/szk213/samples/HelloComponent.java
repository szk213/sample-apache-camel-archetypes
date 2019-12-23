package com.szk213.samples;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.support.component.AbstractApiComponent;

import com.szk213.samples.internal.HelloApiCollection;
import com.szk213.samples.internal.HelloApiName;

/**
 * Represents the component that manages {@link HelloEndpoint}.
 */
public class HelloComponent extends AbstractApiComponent<HelloApiName, HelloConfiguration, HelloApiCollection> {

    public HelloComponent() {
        super(HelloEndpoint.class, HelloApiName.class, HelloApiCollection.getCollection());
    }

    public HelloComponent(CamelContext context) {
        super(context, HelloEndpoint.class, HelloApiName.class, HelloApiCollection.getCollection());
    }

    @Override
    protected HelloApiName getApiName(String apiNameStr) throws IllegalArgumentException {
        return HelloApiName.fromValue(apiNameStr);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String methodName, HelloApiName apiName,
                                      HelloConfiguration endpointConfiguration) {
        HelloEndpoint endpoint = new HelloEndpoint(uri, this, apiName, methodName, endpointConfiguration);
        endpoint.setName(methodName);
        return endpoint;
    }

    /**
     * To use the shared configuration
     */
    @Override
    public void setConfiguration(HelloConfiguration configuration) {
        super.setConfiguration(configuration);
    }

}
