package com.szk213.samples;

import org.apache.camel.support.component.AbstractApiProducer;

import com.szk213.samples.internal.HelloApiName;
import com.szk213.samples.internal.HelloPropertiesHelper;

/**
 * The Hello producer.
 */
public class HelloProducer extends AbstractApiProducer<HelloApiName, HelloConfiguration> {

    public HelloProducer(HelloEndpoint endpoint) {
        super(endpoint, HelloPropertiesHelper.getHelper());
    }
}
