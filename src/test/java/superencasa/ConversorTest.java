package superencasa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

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
}
