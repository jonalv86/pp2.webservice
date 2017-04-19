package com.superencasa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.superencasa.helpers.CarritoUOW;
import com.superencasa.helpers.Conversor;
import com.superencasa.modelo.Carrito;
import com.superencasa.modelo.DatosTemp;
import com.superencasa.modelo.Producto;

@Path("/carrito")
public class RESTCarrito {
	
	
	@Path("/sincronizar/{json}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static boolean sincronizar (@PathParam("json") String jsonCliente) {
		
//		if (dispositivo.estaConectado()) {	
//		}
		
		CarritoUOW carritoUOW = new CarritoUOW (); // este es el que va a commitear los cambios

		Carrito carritoCliente = new Carrito();
		Carrito carritoServer = new Carrito();
		
		String jsonServer = new DatosTemp().obtenerJsonCarritoServer();
				
		try {
			carritoCliente.llenarCarrito(Conversor.conversorProductos(jsonCliente));
			carritoServer.llenarCarrito(Conversor.conversorProductos(jsonServer));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < carritoCliente.getCantidad(); i++) {
			Producto actual = carritoCliente.getItems().get(i);
			if (carritoServer.loContiene(actual)) {
				carritoUOW.updateModificado(actual);				
			} else {
				carritoUOW.insertarNuevo(actual);
			}
		}
		
		for (int i = 0; i < carritoServer.getCantidad(); i++) {
			Producto actual = carritoServer.getItems().get(i);
			if (!carritoCliente.loContiene(actual)) {
				carritoUOW.deleteEliminado(actual);
			}
		}
		
		if (carritoUOW.commit())
			return true;
		else return false;
	}
		
}