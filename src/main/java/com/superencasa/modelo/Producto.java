package com.superencasa.modelo;

public class Producto
{
	private int idProducto;
	private String nombre;
	private int idCategoria;
	
	public Producto(int idProducto, String nombre, int idCategoria)
	{
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setIdCategoria(idCategoria);
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
}
