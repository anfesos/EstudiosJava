package com.estudiosjava.manejointerfaces.datos;

public interface AccesoDatos {
	
	//Una constante en una interface siempre sera public y Static
	public static int MAX_REGISTROS = 10;
	
	//Un metodo en una interface nunca se implementa en ella, tiene diferencia en ejecuci�n a un abstact pero se define as�
	//Si no se pone public y abstract en el metodo de una interface se pondra por defecto
	public abstract void insertar();
	public abstract void listar();
}
