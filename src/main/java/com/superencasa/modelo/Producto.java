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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idCategoria != other.idCategoria)
			return false;
		if (idProducto != other.idProducto)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
