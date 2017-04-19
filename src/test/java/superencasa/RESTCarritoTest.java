package superencasa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.superencasa.modelo.Carrito;
import com.superencasa.modelo.Producto;

public class RESTCarritoTest {
	
	private Carrito local, remoto, esperado, sincronizado;
	
	@Before
	public void setUp() {
		this.local = new Carrito();
		this.local.agregarItem(new Producto(2, "anana", 1));
		this.local.agregarItem(new Producto(4, "naranja", 1));
		
		this.remoto = new Carrito();
		this.remoto.agregarItem(new Producto(1, "manzana", 1));
		this.remoto.agregarItem(new Producto(2, "anana", 1));
		this.remoto.agregarItem(new Producto(3, "kiwi", 1));
	}

	@Test
	public void getCarritoLocal() {
		this.esperado = new Carrito();
		this.esperado.agregarItem(new Producto(2, "anana", 1));
		this.esperado.agregarItem(new Producto(4, "naranja", 1));
		
//		assertTrue(esperado.equals(this.local));
	}
	
	@Test
	public void getCarritoRemoto() {
		this.esperado = new Carrito();
		this.esperado.agregarItem(new Producto(1, "manzana", 1));
		this.esperado.agregarItem(new Producto(2, "anana", 1));
		this.esperado.agregarItem(new Producto(3, "kiwi", 1));
		
//		assertTrue(esperado.equals(this.remoto));
	}
	
	@Test
	public void sincronizar () {
		
	}

}
