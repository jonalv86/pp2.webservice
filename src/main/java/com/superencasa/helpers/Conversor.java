package com.superencasa.helpers;

import com.google.gson.Gson;

public class Conversor 
{
	public static String conversorJson(Object o)
	{
		Gson gson = new Gson();
		String resultado = gson.toJson(o);
		return resultado;
	}
}
