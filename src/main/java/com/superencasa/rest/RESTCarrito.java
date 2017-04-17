package com.superencasa.rest;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.superencasa.helpers.Constantes;
import com.superencasa.helpers.Conversor;
import com.superencasa.modelo.DatosTemp;
import com.superencasa.modelo.Producto;

@Path("/carrito")
public class RESTCarrito {
	
	@Path("/getProductos")
	@GET
	public static String getProductos()
	{	
		DatosTemp dbTemp = Constantes.dbTemp;
		List<Producto> productos = new LinkedList<Producto>();
		productos = dbTemp.obtenerCarrito();
		return "{\"carrito\":" + Conversor.conversorJson(productos) + "}";
	}
	
}