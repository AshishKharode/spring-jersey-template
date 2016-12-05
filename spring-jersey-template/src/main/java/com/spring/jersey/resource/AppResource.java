package com.spring.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jersey.manager.AppManager;

@Component
@Path("/webapi")
public class AppResource {
	
	@Autowired
	private AppManager manager;
	
	@GET
	@Path("/message")
	public Response getNewMessage(){
		return Response.ok(manager.getMessage()).build();
	}
}
