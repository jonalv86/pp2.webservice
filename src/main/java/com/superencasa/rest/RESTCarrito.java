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
	public static boolean sincronizar (@PathParam("json") String jsonCliente) {
		
		Gson gson = new Gson();
		CarritoUOW carritoUOW = gson.fromJson(jsonCliente, CarritoUOW.class);
		
		carritoUOW.commit();
		
		/* CarritoUOW carritoUOW = new CarritoUOW (); // este es el que va a commitear los cambios

		Carrito carritoCliente = new Carrito();
		Carrito carritoServer = new Carrito();
		
		DatosTemp dbTemp = Constantes.dbTemp;
		carritoServer = dbTemp.obtenerCarritoServer();
				
		try {
			carritoCliente.llenarCarrito(Conversor.conversorProductos(jsonCliente));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < carritoServer.getCantidad(); i++) {
			Producto actual = carritoServer.getItems().get(i);
			int index = carritoCliente.getItems().indexOf(actual);
			try {
				carritoUOW.updateModificado(carritoCliente.getItems().get(index));
				carritoCliente.getItems().remove(index);
			} catch (Exception e) {
				carritoUOW.deleteEliminado(actual);
			}
		}
		
		carritoUOW.getNuevos().addAll(carritoServer.getItems()); */
		
		if (carritoUOW.commit())
			return true;
		else return false;
	}
		
}