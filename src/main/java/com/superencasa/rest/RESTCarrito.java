package com.superencasa.rest;

import javax.ws.rs.Path;

import com.superencasa.helpers.CarritoUOW;
import com.superencasa.modelo.Carrito;
import com.superencasa.modelo.Producto;

@Path("/carrito")
public class RESTCarrito {
	
	public void sincronizar (Carrito remoto, Carrito local) {
		
		CarritoUOW carritoUOW = new CarritoUOW (); // este es el que va a commitear los cambios
		remoto = getCarritoRemoto();
		local = getCarritoLocal();
		
		for (int i = 0; i < local.getCantidad(); i++) {
			Producto actual = local.getItems().get(i);
			if (remoto.loContiene(actual)) {
				carritoUOW.updateModificado(actual);				
			} else {
				carritoUOW.insertarNuevo(actual);
			}
		}
		
		for (int i = 0; i < remoto.getCantidad(); i++) {
			Producto actual = remoto.getItems().get(i);
			if (!local.loContiene(actual)) {
				carritoUOW.deleteEliminado(actual);
			}
		}
		
		carritoUOW.commit();
	}
	
	public Carrito getCarritoLocal() {
		// TODO viene de la app
		return new Carrito();
	}
	
	public Carrito getCarritoRemoto() {
		// TODO viene de la db
		return new Carrito();
	}
	
}