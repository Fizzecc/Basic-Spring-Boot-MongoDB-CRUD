package com.jing.springbootstarter.topic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jersey")
public class SampleEndpoint {
	
	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_PLAIN)
	public Response sampleGet() {
		
		return Response.ok("Sample getssss").build();
	}
}
