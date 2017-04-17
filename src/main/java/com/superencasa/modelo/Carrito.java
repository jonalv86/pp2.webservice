package com.superencasa.modelo;

import java.util.LinkedList;
import java.util.List;

public class Carrito {
	
	private List<Producto> productos;
	
	public Carrito() {
		this.productos = new LinkedList<Producto>();
	}
	
	public boolean agregarItem (Producto producto) {
		return this.productos.add(producto);
	}
	
	public int getCantidad() {
		return this.productos.size();
	}
	
	public List<Producto> getItems() {
		return this.productos;
	}
	
	public boolean loContiene (Producto producto) {
		return this.productos.contains(producto);
	}
	
	public boolean estaVacio () {
		return this.productos.isEmpty();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Carrito other = (Carrito) obj;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		return true;
	}
	
}