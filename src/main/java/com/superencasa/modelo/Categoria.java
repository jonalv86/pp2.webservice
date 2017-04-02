package com.superencasa.modelo;

public class Categoria 
{
	private int idCategoria;
	private String nombre;
	private int idCategoriaPadre;
	
	public Categoria(int idCategoria, String nombre, int idCategoriaPadre)
	{
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.idCategoriaPadre = idCategoriaPadre;		
	}
}
