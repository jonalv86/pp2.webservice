package helpers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.superencasa.helpers.CarritoUOW;
import com.superencasa.modelo.Producto;

public class CarritoUOWTest {
	
	CarritoUOW carritoOUW;
	
	@Before
	public void setUp() {
		this.carritoOUW = new CarritoUOW();
	}

	@Test
	public void test() {
		assertTrue(this.carritoOUW.getNuevos().isEmpty());
		assertTrue(this.carritoOUW.getModificados().isEmpty());
		assertTrue(this.carritoOUW.getEliminados().isEmpty());
		
		int esperado, actual;
		
		this.carritoOUW.registrarNew(new Producto(1, "anana", 1));
		esperado = 1;
		actual = this.carritoOUW.getNuevos().size();
		assertEquals(esperado, actual);
		
		this.carritoOUW.registrarDirty(new Producto(1, "anana", 1));
		esperado = 1;
		actual = this.carritoOUW.getModificados().size();
		assertEquals(esperado, actual);
		
		this.carritoOUW.registrarRemoved(new Producto(1, "anana", 1));
		esperado = 1;
		actual = this.carritoOUW.getEliminados().size();
		assertEquals(esperado, actual);
		
		this.carritoOUW.clear();
		
		boolean expected = true;
		
		boolean real = this.carritoOUW.isEmpty();
		assertEquals(expected, real);
		
		real = this.carritoOUW.commit();
		assertEquals(expected, real);
		
		real = this.carritoOUW.rollback();
		assertEquals(expected, real);
	}

}
