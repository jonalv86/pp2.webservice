package com.superencasa.modelo;

import java.util.*;

public class DatosTemp 
{
	private ArrayList<Categoria> categoriasTemp = new ArrayList<Categoria>();
	private ArrayList<Producto> productosTemp = new ArrayList<Producto>();
	
	public DatosTemp()
	{
		categoriasTemp = obtenerCategorias();
		productosTemp = obtenerProductos();
	}
	
	public ArrayList<Categoria> obtenerCategorias()
	{
		if(categoriasTemp.isEmpty())
		{
			categoriasTemp.add(new Categoria(1, "Lacteos", null));
			categoriasTemp.add(new Categoria(2, "Frutas", null));
			categoriasTemp.add(new Categoria(3, "Verduras", null));
		}
		return categoriasTemp;
	}
	
	public ArrayList<Producto> obtenerProductos()
	{
		if(productosTemp.isEmpty())
		{
			productosTemp.add(new Producto(1, "Queso", 1));
			productosTemp.add(new Producto(2, "Leche", 1));
			productosTemp.add(new Producto(3, "Banana", 2));
			productosTemp.add(new Producto(4, "Manzana", 2));
			productosTemp.add(new Producto(5, "Zapallito", 3));
			productosTemp.add(new Producto(6, "Papa", 3));
		}
		return productosTemp;
	}

	public Categoria obtenerCategoriaPorId(int i) 
	{
		Categoria resultado = new Categoria();
		for(Categoria c : categoriasTemp)
		{
			if(c.getIdCategoria() == i)
			{
				resultado = c;
			}
		}
		return resultado;
	}

	public ArrayList<Producto> getProductosPorCategoria(int i) 
	{
		ArrayList<Producto> resultados = new ArrayList<Producto>();
		for(Producto p : productosTemp)
		{
			if(p.getIdCategoria() == i)
			{
				resultados.add(p);
			}
		}
		return resultados;
	}
}
