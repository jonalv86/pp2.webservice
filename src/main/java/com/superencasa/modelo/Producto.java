package com.superencasa.modelo;

public class Producto
{
	private int idProducto;
	private String nombre;
	private int idCategoria;
	
	public Producto(int idProducto, String nombre, int idCategoria)
	{
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.idCategoria = idCategoria;
	}
}
