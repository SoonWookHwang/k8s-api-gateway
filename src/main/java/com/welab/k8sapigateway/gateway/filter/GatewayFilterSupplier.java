package com.welab.k8sapigateway.gateway.filter;

import org.springframework.cloud.gateway.server.mvc.filter.SimpleFilterSupplier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterSupplier extends SimpleFilterSupplier {
    public GatewayFilterSupplier() {
        super(GatewayFilterFunction.class);
    }
}
