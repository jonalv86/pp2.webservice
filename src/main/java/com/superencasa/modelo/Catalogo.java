package com.superencasa.modelo;

import java.util.ArrayList;

import com.superencasa.helpers.Constantes;

public class Catalogo 
{
	private Categoria categoria;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	//private ArrayList<Categoria> categoriasHijo = new ArrayList<Categoria>();	//No aplica por el momento.
	
	public Catalogo(int idCategoria)
	{
		DatosTemp dbTemp = Constantes.dbTemp;	//Esto parece entity framework.
		this.setCategoria(dbTemp.obtenerCategoriaPorId(idCategoria));
		if(categoria.getIdCategoria() != null)
		{
			this.setProductos(dbTemp.getProductosPorCategoria(idCategoria));
		}
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
