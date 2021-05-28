package com.tobuku.common;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.tobuku.resource.CustomerResource;

public class ApplicationConfig extends ResourceConfig{
	public ApplicationConfig() {
		register(RequestContextFilter.class);       
        register(CustomerResource.class);
        register(CustomExceptionMapper.class);
	}
}
