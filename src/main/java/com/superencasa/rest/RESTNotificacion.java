package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.superencasa.helpers.Constantes;

@Path("/notificar")
public class RESTNotificacion {
	
	@Path("/sincronizado")
	@GET // deberia ser POST?
	public static String sincroCorrecta()
	{	
		return Constantes.msg_sinc_ok;
	}
	
	@Path("/no_sincronizado")
	@GET
	public static String sincroIncorrecta()
	{	
		return Constantes.msg_sinc_error;
	}
	
}
