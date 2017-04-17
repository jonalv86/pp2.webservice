package superencasa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.superencasa.modelo.Carrito;
import com.superencasa.modelo.Producto;

public class CarritoTest {

private Carrito carrito;
	
	@Before
	public void setUp() throws Exception {
        this.carrito = new Carrito();
    }

	@Test
    public void agregarItem() {
		
		assertTrue(this.carrito.estaVacio());
		
		Producto producto = new Producto(1, "anana", 1);
        this.carrito.agregarItem(producto);
        assertTrue(this.carrito.loContiene(producto));
        
    }
	
	@Test
    public void getCantidad() {
		
		int actual = 0;
		int esperado = this.carrito.getCantidad();
		assertEquals(esperado, actual);
		
		Producto producto = new Producto(1, "anana", 1);
		this.carrito.agregarItem(producto);
		actual = 1;
		esperado = this.carrito.getCantidad();
		assertEquals(esperado, actual);
		
    }
	
	@Test
	public void getItems () {
		
		List<Producto> actual = this.carrito.getItems();
		List<Producto> esperado = new LinkedList<Producto>();
		
		assertEquals(esperado, actual);
		
	}
	
	@Test
	public void equals () {
		
		Carrito actual = this.carrito;
		Carrito esperado = new Carrito();
		Carrito vacio = null;
		
		Object obj = new Object();
		assertTrue(!actual.equals(obj));
		
		obj = this.carrito;
		assertTrue(actual.equals(obj));
		
		Carrito incorrecto = new Carrito();
		incorrecto.agregarItem(new Producto(1, "naranja", 2));
		
		assertTrue(!actual.equals(vacio));
		assertTrue(!actual.equals(incorrecto));
		assertTrue(actual.equals(esperado));
		
	}
	
}
