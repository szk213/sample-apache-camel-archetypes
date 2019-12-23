package com.szk213.samples;

import org.apache.camel.Processor;
import org.apache.camel.support.component.AbstractApiConsumer;

import com.szk213.samples.internal.HelloApiName;

/**
 * The Hello consumer.
 */
public class HelloConsumer extends AbstractApiConsumer<HelloApiName, HelloConfiguration> {

    public HelloConsumer(HelloEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
    }

}
