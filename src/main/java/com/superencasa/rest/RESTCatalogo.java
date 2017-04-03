package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.superencasa.helpers.Validador;
import com.superencasa.modelo.Catalogo;

@Path("/catalogo")
public class RESTCatalogo 
{
	@Path("/obtenerCatalogo/{i}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static String obtenerCatalogo(@PathParam("i") String i)
	{
		int parametro = Validador.validarParametroInt(i);
		Catalogo catalogoPedido = new Catalogo(parametro);
		Gson gson = new Gson();
		String resultado = gson.toJson(catalogoPedido);
		return resultado;
	}
}
