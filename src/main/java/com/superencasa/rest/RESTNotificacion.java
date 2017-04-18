package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/notificar")
public class RESTNotificacion {
	
	@Path("/sincronizado")
	@GET // deberia ser POST?
	public static String sincroCorrecta()
	{	
		return "Se sincronizo correctamente.";
	}
	
	@Path("/no_sincronizado")
	@GET
	public static String sincroIncorrecta()
	{	
		return "No se pudo realizar la sincronizacion.";
	}

}
