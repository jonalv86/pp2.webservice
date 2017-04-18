package com.superencasa.helpers;

import java.util.LinkedList;
import java.util.List;

import com.superencasa.modelo.Producto;

public class CarritoUOW implements UnitOfWork {
	
	List<Producto> nuevos;
	List<Producto> modificados;
	List<Producto> eliminados;
	
	public CarritoUOW() {
		this.nuevos = new LinkedList<Producto>();
		this.modificados = new LinkedList<Producto>();
		this.eliminados = new LinkedList<Producto>();
	}

	public void insertarNuevo(Producto producto) {
		if (this.nuevos.contains(producto)) {
			this.nuevos.add(producto);
		}
	}
	
	public void updateModificado (Producto producto) {
		if (!this.modificados.contains(producto)) {
			this.modificados.add(producto);
		}
	}
	
	public void deleteEliminado (Producto producto) {
		if (!this.eliminados.contains(producto)) {
			this.eliminados.add(producto);
		}
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		// for each en cada lista: insert, update o delete de la db
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
	}

	@Override
	public void clear() {
		this.nuevos.clear();
		this.modificados.clear();
		this.eliminados.clear();
	}

}
