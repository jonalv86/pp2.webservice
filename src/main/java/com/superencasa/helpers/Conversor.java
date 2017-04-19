package com.superencasa.helpers;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.superencasa.modelo.Producto;

public class Conversor {
	
	public static String conversorJson(Object o) {
		Gson gson = new Gson();
		String resultado = gson.toJson(o);
		return resultado;
	}
	
	public static List<Producto> conversorProductos (String json) {
		Gson gson = new Gson();
	    java.lang.reflect.Type listType = new TypeToken<List<Producto>>(){}.getType();
	    List<Producto> productos = gson.fromJson(json, listType);
	    return productos;
	}
		
}
