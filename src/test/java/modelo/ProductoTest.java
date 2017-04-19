package modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.superencasa.modelo.Producto;

public class ProductoTest {
	
	private Producto producto;
	private Producto igual;
	private Producto distinto;

	@Before
	public void setUp() throws Exception {
        this.producto = new Producto(1, "anana", 1);
        this.igual = new Producto(1, "anana", 1);
        this.distinto = new Producto(2, "manzana", 2);
    }
	
	@Test
	public void getIdProducto () {
		Integer esperado = 1;
		Integer actual = this.producto.getIdProducto();
		assertEquals(esperado, actual);
		
		assertTrue(this.producto.getIdProducto() == this.igual.getIdCategoria());
		assertTrue(this.producto.getIdProducto() != this.distinto.getIdCategoria());
	}
	
	@Test
	public void getNombre () {
		String esperado = "anana";
		String actual = this.producto.getNombre();
		assertEquals(esperado, actual);
		
		assertTrue(this.producto.getNombre().equals(this.igual.getNombre()));
		assertTrue(!this.producto.getNombre().equals(this.distinto.getNombre()));
	}
	
	@Test
	public void getIdCategoria () {
		Integer esperado = 1;
		Integer actual = this.producto.getIdCategoria();
		assertEquals(esperado, actual);
		
		assertTrue(this.producto.getIdCategoria() == this.igual.getIdCategoria());
		assertTrue(this.producto.getIdCategoria() != this.distinto.getIdCategoria());
	}

	@Test
	public void equals() {
		assertTrue(this.producto.equals(this.igual));
		assertTrue(!this.producto.equals(this.distinto));
	}
}
