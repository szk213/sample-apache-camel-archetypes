package com.szk213.samples.internal;

import org.apache.camel.support.component.ApiMethodPropertiesHelper;

import com.szk213.samples.HelloConfiguration;

/**
 * Singleton {@link ApiMethodPropertiesHelper} for Hello component.
 */
public final class HelloPropertiesHelper extends ApiMethodPropertiesHelper<HelloConfiguration> {

    private static HelloPropertiesHelper helper;

    private HelloPropertiesHelper() {
        super(HelloConfiguration.class, HelloConstants.PROPERTY_PREFIX);
    }

    public static synchronized HelloPropertiesHelper getHelper() {
        if (helper == null) {
            helper = new HelloPropertiesHelper();
        }
        return helper;
    }
}
