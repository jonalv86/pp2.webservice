package com.superencasa.modelo;

public class Categoria 
{
	private Integer idCategoria;
	private String nombre;
	private Integer idCategoriaPadre;
	
	public Categoria() { }
	
	public Categoria(int idCategoria, String nombre, Integer idCategoriaPadre)
	{
		this.setIdCategoria(idCategoria);
		this.setNombre(nombre);
		this.setIdCategoriaPadre(idCategoriaPadre);		
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCategoriaPadre() {
		return idCategoriaPadre;
	}

	public void setIdCategoriaPadre(Integer idCategoriaPadre) {
		this.idCategoriaPadre = idCategoriaPadre;
	}
}
