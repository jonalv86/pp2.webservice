package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/catalogo")
public class RESTCatalogo 
{
	@Path("/obtenerCatalogo/{i}")
	@GET
	@Produces("application/json")
	public String obtenerCatalogo(@PathParam("i") String i)
	{
		
		return null;
	}
}
