package modelo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.superencasa.helpers.Constantes;
import com.superencasa.modelo.Catalogo;
import com.superencasa.modelo.Categoria;
import com.superencasa.modelo.DatosTemp;
import com.superencasa.modelo.Producto;

public class CatalogoTest 
{
	DatosTemp dbTemp = Constantes.dbTemp;
	Catalogo catalogoIncorrecto = new Catalogo(-1);
	Catalogo catalogoCorrecto = new Catalogo(1);
	
	//Para todos los casos: Dado un id que no existe el resultado es un catalogo sin Categoria ni listas
	//de productos ni idCategrorias padre.
	
	@Test
	public void testCatalogoConCategoriaInexistente()
	{
		assertTrue(catalogoIncorrecto.getCategoria().getIdCategoria() == null);
		assertTrue(catalogoIncorrecto.getCategoria().getNombre() == null);
		assertTrue(catalogoIncorrecto.getCategoria().getIdCategoriaPadre() == null);
		assertTrue(catalogoIncorrecto.getProductos().isEmpty());
	}
	
	//Testear que dado un id, el Catalogo obtenido tiene la categoria con el mismo id.
	@Test
	public void testCatalogoCorrecto()
	{
		assertEquals(new Integer(1), catalogoCorrecto.getCategoria().getIdCategoria());
		assertNotEquals(new Integer(5), catalogoCorrecto.getCategoria().getIdCategoria());	//A maven no le gusta el assertNotEquals
	}
	
	//Testear que dado un id, el Catalogo obtenido tiene un lista de categorias con idCategoriaPadre 
	//iguales que el id.
	@Test
	public void testCategoriasHijoCorrectas()
	{
		//Aun no aplica.
	}
	
	//Testear que dado un id, el Catalogo obtenido tiene una lista de productos con su idCategoria
	//igual que el id dado *.
	
	//* Pendiente: o recursivamente igual que algun idCategoriaPadre.
	@Test
	public void testCategoriasDeProductosCorrectas()
	{
		int idCategoria = catalogoCorrecto.getCategoria().getIdCategoria();
		for(Producto p : catalogoCorrecto.getProductos())
		{
			assertEquals(idCategoria, p.getIdCategoria());
		}
	}
	
	//Testear que al obtenerCategoriasPrinciipales ninguna categoria tiene idCategoriaPadre.
	@Test
	public void testCategoriasPrincipales()
	{
		ArrayList<Categoria> categorias = dbTemp.obtenerCategoriasGenerales();
		for(Categoria c : categorias)
		{
			assertEquals(null, c.getIdCategoriaPadre());
		}
	}
	
}
