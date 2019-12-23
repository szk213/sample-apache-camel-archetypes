package com.szk213.samples;

import org.apache.camel.Exchange;
import org.apache.camel.support.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Hello producer.
 */
public class HelloProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(HelloProducer.class);
    private HelloEndpoint endpoint;

    public HelloProducer(HelloEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
