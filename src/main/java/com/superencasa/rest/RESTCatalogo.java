package com.superencasa.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.superencasa.helpers.Constantes;
import com.superencasa.helpers.Conversor;
import com.superencasa.helpers.Validador;
import com.superencasa.modelo.Catalogo;
import com.superencasa.modelo.Categoria;
import com.superencasa.modelo.DatosTemp;

@Path("/catalogo")
public class RESTCatalogo {
	
	@Path("/obtenerCatalogo/{i}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static String obtenerCatalogo(@PathParam("i") String i)
	{
		int parametro = Validador.validarParametroInt(i);
		Catalogo catalogoPedido = new Catalogo(parametro);
		//Gson gson = new Gson();
		//String resultado = gson.toJson(catalogoPedido);
		//return resultado;
		return Conversor.conversorJson(catalogoPedido);
	}
	
	@Path("/obtenerMenuPrincipal")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static String obtenerMenuPrincipal()
	{	
		DatosTemp dbTemp = Constantes.dbTemp;
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		categorias = dbTemp.obtenerCategoriasGenerales();
		return Conversor.conversorJson(categorias);
	}
}
