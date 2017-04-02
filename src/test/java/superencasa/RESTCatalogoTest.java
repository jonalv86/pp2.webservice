package superencasa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.superencasa.modelo.Catalogo;

public class RESTCatalogoTest 
{
	//Para todos los casos: Dado un id que no existe el resultado es un catalogo sin Categoria ni listas
	//de productos ni idCategrorias padre.
	@Test
	public void testCatalogoConCategoriaInexistente()
	{
		Catalogo catalogo = new Catalogo(-1);
		//catalogo = catalogo.obtenerCatalogoPorIdCategoria(-1);
		//assertEquals(null, catalogo.Categoria);
		//assertTrue(true, catalogo.Productos);
		//assertTrue(true, catalogo.CategoriasPadre);
	}
	
	//Testear que dado un id, el FacadeCatalogo obtenido tiene la categoria con el mismo id.
	@Test
	public void testCatalogoCorrecto()
	{
		
		assertEquals("", "");
	}
	
	//Testear que dado un id, el FacadeCatalogo obtenido tiene un lista de categorias con idCategoriaPadre 
	//iguales que el id.
	@Test
	public void testCategoriasHijoCorrectas()
	{
		//Varios asserts.
	}
	
	//Testear que dado un id, el FacadeCatalogo obtenido tiene una lista de productos con su idCategoria
	//igual que el id dado *.
	
	//* Pendiente: o recursivamente igual que algun idCategoriaPadre.
	@Test
	public void testCategoriasDeProdictosCorrectas()
	{
		
	}
}
