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

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getIdCategoria() {
		return idCategoria;
	}
	
	@Override
	public String toString() {
		return this.idProducto + " " + this.nombre + " " + this.idCategoria;
	}
	
	/* inmutables
	
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	} 
	
	*/
}
