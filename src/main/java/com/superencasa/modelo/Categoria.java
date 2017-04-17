package com.superencasa.modelo;

public class Categoria 
{
	private Integer idCategoria;
	private String nombre;
	private Integer idCategoriaPadre;
	
	public Categoria() { }
	
	public Categoria(int idCategoria, String nombre, Integer idCategoriaPadre)
	{
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.idCategoriaPadre = idCategoriaPadre;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getIdCategoriaPadre() {
		return idCategoriaPadre;
	}
	
	/* cambian?
	
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdCategoriaPadre(Integer idCategoriaPadre) {
		this.idCategoriaPadre = idCategoriaPadre;
	}
	
	*/
	
}
