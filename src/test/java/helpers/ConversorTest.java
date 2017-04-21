package helpers;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.superencasa.helpers.CarritoUOW;
import com.superencasa.helpers.Conversor;
import com.superencasa.modelo.Producto;

public class ConversorTest {

	@Test
	public void conversorJson() {
		Producto prod1 = new Producto(1, "anana", 1);
		String actual = Conversor.conversorJson(prod1);
		
		String esperado = "{\"idProducto\":1,\"nombre\":\"anana\",\"idCategoria\":1}";
		String incorrecto = "{\"idProducto\":1,\"nombre\":\"manzana\",\"idCategoria\":1}";
		
		assertEquals(esperado, actual);
		assertNotEquals(incorrecto, actual);
	}
	
	@Test
	public void conversorProductos() {
		
		Producto prod1 = new Producto(1, "anana", 1);
		Producto prod2 = new Producto(2, "manzana", 1);
		List<Producto> esperado = new LinkedList<Producto>();
		esperado.add(prod1);
		esperado.add(prod2);
		
		List<Producto> actual = Conversor.conversorProductos
				("[{\"idProducto\":1,\"nombre\":\"anana\",\"idCategoria\":1},"
						+ "{\"idProducto\":2,\"nombre\":\"manzana\",\"idCategoria\":1}]");
		
		List<Producto> incorrecto = Conversor.conversorProductos
				("[{\"idProducto\":2,\"nombre\":\"anana\",\"idCategoria\":2},"
						+ "{\"idProducto\":4,\"nombre\":\"anana\",\"idCategoria\":3}]");
		
		assertEquals(esperado.toString(), actual.toString());
		assertNotEquals(incorrecto.toString(), actual.toString());
	}
	
	@Test
	public void conversorCarritoUOWs() {
		CarritoUOW carritoEsperado = new CarritoUOW();
		Producto producto = new Producto(1, "Queso", 1);
		String testearConversion = "{\"nuevos\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}],\"modificados\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}],\"eliminados\":[{\"idProducto\":1,\"nombre\":\"Queso\",\"idCategoria\":1}]}";
		carritoEsperado.registrarNew(producto);
		carritoEsperado.registrarDirty(producto);
		carritoEsperado.registrarRemoved(producto);
		CarritoUOW carritoVacio = new CarritoUOW();
		
		assertEquals(Conversor.conversorCarritoUOW(testearConversion).getNuevos().toString(), carritoEsperado.getNuevos().toString());
		assertEquals(Conversor.conversorCarritoUOW(testearConversion).getModificados().toString(), carritoEsperado.getModificados().toString());
		assertEquals(Conversor.conversorCarritoUOW(testearConversion).getEliminados().toString(), carritoEsperado.getEliminados().toString());
		
		assertNotEquals(Conversor.conversorCarritoUOW(testearConversion).getNuevos().toString(), carritoVacio.getNuevos().toString());
		assertNotEquals(Conversor.conversorCarritoUOW(testearConversion).getModificados().toString(), carritoVacio.getModificados().toString());
		assertNotEquals(Conversor.conversorCarritoUOW(testearConversion).getEliminados().toString(), carritoVacio.getEliminados().toString());
	}
}
