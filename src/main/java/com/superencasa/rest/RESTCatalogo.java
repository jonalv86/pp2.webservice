package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.superencasa.modelo.Catalogo;

@Path("/catalogo")
public class RESTCatalogo 
{
	@Path("/obtenerCatalogo/{i}")
	@GET
	@Produces("application/json")
	public String obtenerCatalogo(@PathParam("i") String i)
	{
		Catalogo catalogoPedido = new Catalogo(Integer.parseInt(i)); 
		return null;
	}
}
