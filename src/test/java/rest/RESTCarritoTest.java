package rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.superencasa.rest.RESTCarrito;

public class RESTCarritoTest {
	
	@Test
	public void sincronizar () {
		String jsonCliente = "[{\"idProducto\":4, \"nombre\":\"Manzana\",\"idCategoria\":2},{\"idProducto\":2, \"nombre\":\"manzana\",\"idCategoria\":1}]";
		boolean actual = RESTCarrito.sincronizar(jsonCliente);
		boolean esperado = true;
		assertEquals(esperado, actual);
		
		
		
	}

}
