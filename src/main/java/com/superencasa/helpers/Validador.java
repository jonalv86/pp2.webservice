package com.superencasa.helpers;

public class Validador {

	public static int validarParametroInt(String i) 
	{
		int validacion = 0;
		try
		{
			validacion = Integer.parseInt(i);
		}
		catch(Exception e){}
		return validacion;
	}

}
