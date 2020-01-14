package com.jing.springbootstarter.topic;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(SampleEndpoint.class);
	}
}
