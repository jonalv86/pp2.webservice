package com.superencasa.helpers;

import java.util.HashSet;
import java.util.Set;

import com.superencasa.modelo.Producto;

public class CarritoUOW implements UnitOfWork {
	
    private Set<Producto> nuevos;
    private Set<Producto> modificados;
    private Set<Producto> eliminados;

    public CarritoUOW() {
        this.nuevos = new HashSet<Producto>();
        this.modificados = new HashSet<Producto>();
        this.eliminados = new HashSet<Producto>();
    }

    @Override
    public void registrarNew(Object o) {
        this.nuevos.add((Producto) o);
    }

    @Override
    public void registrarDirty(Object o) {
        this.modificados.add((Producto) o);
    }

    @Override
    public void registrarRemoved(Object o) {
        this.eliminados.add((Producto) o);
    }

    @Override
    public boolean commit() {
    	// TODO conexion db
    	return true;
    }

    @Override
    public boolean rollback() {
    	// TODO
    	return true;
    }

    @Override
    public boolean clear() {
        this.nuevos.clear();
        this.modificados.clear();
        this.eliminados.clear();
        return true;
    }

    public boolean isEmpty () {
        return this.nuevos.isEmpty() && this.modificados.isEmpty()  && this.eliminados.isEmpty();
    }
    
    public Set<Producto> getNuevos () {
    	return this.nuevos;
    }
    
    public Set<Producto> getModificados () {
    	return this.nuevos;
    }
    
    public Set<Producto> getEliminados () {
    	return this.nuevos;
    }
	
}


