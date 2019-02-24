package com.estudiosjava.manejoexcepciones2.excepciones;

public class AccesoDatosEx extends Exception{
	//Exception es la clase padre y seran sus subclases del tipo Check Exception
	
	public AccesoDatosEx(String mensaje) {
		super(mensaje);
	}
}
