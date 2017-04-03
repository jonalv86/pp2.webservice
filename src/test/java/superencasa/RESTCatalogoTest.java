package superencasa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.superencasa.helpers.Constantes;
import com.superencasa.modelo.DatosTemp;
import com.superencasa.rest.RESTCatalogo;

public class RESTCatalogoTest 
{
	DatosTemp dbTemp = Constantes.dbTemp;
	String jsonEsperado = "\"categoria\":{},\"productos\":[]";
	String jsonSinResultado = RESTCatalogo.obtenerCatalogo("no se admiten string que no sean numeros");
	String jsonSinResultado2 = RESTCatalogo.obtenerCatalogo("-1");
	String jsonConResultado = RESTCatalogo.obtenerCatalogo("1");
	String jsonMenuPrincipal = RESTCatalogo.obtenerMenuPrincipal();
	
	//Testear que si el parametro no es un int devuelve el mismo resultado que si no puede armar el catalogo:
	//Categoria null y lista de productos vacia
	
	@Test
	public void testLlamadaConParametroErroneo()
	{
		//assertEquals(jsonEsperado, jsonSinResultado);	//Este no sirve si se agregan cosas al json
		assertTrue(jsonSinResultado.contains(jsonEsperado));
		assertFalse(jsonConResultado.contains(jsonEsperado));
	}
	
	@Test
	public void testLlamadaCategoriaInexistente()
	{
		assertTrue(jsonSinResultado2.contains(jsonEsperado));
	}
	
	@Test
	public void testLlamadaCategoriasPrincipales()
	{
		assertFalse(jsonMenuPrincipal.contains("idCategoriaPadre"));
	}
}
