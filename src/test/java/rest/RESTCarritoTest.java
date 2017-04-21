package rest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.superencasa.helpers.CarritoUOW;
import com.superencasa.helpers.Conversor;
import com.superencasa.modelo.Producto;
import com.superencasa.rest.RESTCarrito;

public class RESTCarritoTest {
	
	
	@Test
	public void sincronizar () {
		String json = "{\"nuevos\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}],\"modificados\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}],\"eliminados\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}]}";

		//Cuando guarde en db hay que testear que devuelva false cuando falle y true cuando guarde ok.
		Boolean sincronizar = RESTCarrito.sincronizar(json);
		assertTrue(sincronizar);
	}

}
