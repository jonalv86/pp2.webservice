package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.superencasa.helpers.CarritoUOW;

@Path("/carrito")
public class RESTCarrito {
	
	@Path("/sincronizar/{json}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static boolean sincronizar (@PathParam("json") String jsonClienteUOW) {
		
		// System.out.println(jsonClienteUOW);
		
		// TODO revisar
		Gson gson = new Gson();
		CarritoUOW carritoUOW = gson.fromJson(jsonClienteUOW, CarritoUOW.class);
		
		return carritoUOW.commit() ? carritoUOW.clear() : carritoUOW.rollback();
		
	}
		
}