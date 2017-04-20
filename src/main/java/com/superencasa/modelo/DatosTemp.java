package com.superencasa.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

public class DatosTemp 
{
	private ArrayList<Categoria> categoriasTemp = new ArrayList<Categoria>();
	private ArrayList<Producto> productosTemp = new ArrayList<Producto>();
	private Carrito carritoClienteTemp = new Carrito();
	private Carrito carritoServerTemp = new Carrito();
	
	public DatosTemp()
	{
		categoriasTemp = obtenerCategorias();
		productosTemp = obtenerProductos();
		carritoClienteTemp = obtenerCarritoCliente();
		carritoServerTemp = inicializarCarritoServer();
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
	
	public Carrito inicializarCarritoServer () {
		carritoServerTemp.agregarItem(new Producto(1, "Queso", 1));
		carritoServerTemp.agregarItem(new Producto(2, "Leche", 1));
		carritoServerTemp.agregarItem(new Producto(3, "Banana", 2));
		carritoServerTemp.agregarItem(new Producto(4, "Manzana", 2));
		carritoServerTemp.agregarItem(new Producto(5, "Zapallito", 3));
		carritoServerTemp.agregarItem(new Producto(6, "Papa", 3));
		return carritoServerTemp;
	}
	
	public Carrito obtenerCarritoServer () {
		return this.carritoServerTemp;
	}
	
	public String obtenerJsonCarritoServer () {
		Gson gson = new Gson();
		return gson.toJson(carritoServerTemp);
	}
	
	public Carrito obtenerCarritoCliente () {
		
		carritoClienteTemp.agregarItem(new Producto(1, "Anana", 2));
		carritoClienteTemp.agregarItem(new Producto(2, "Manzana", 2));
		carritoClienteTemp.agregarItem(new Producto(3, "Naranja", 2));
		carritoClienteTemp.agregarItem(new Producto(4, "Kiwi", 2));
		
		return carritoClienteTemp;
	}
	
	public String obtenerJsonCarritoCliente () {
		Gson gson = new Gson();
		return gson.toJson(carritoClienteTemp);
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

	public ArrayList<Categoria> obtenerCategoriasGenerales() 
	{
		ArrayList<Categoria> resultados = new ArrayList<Categoria>();
		for(Categoria c : categoriasTemp)
		{
			if(c.getIdCategoriaPadre() == null)
			{
				resultados.add(c);
			}
		}
		return resultados;
	}
}
