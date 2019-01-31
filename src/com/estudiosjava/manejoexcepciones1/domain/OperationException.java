package com.estudiosjava.manejoexcepciones1.domain;

public class OperationException extends Exception{
	//Es de tipo Check exception, osea se debe procesar donde se genera
	public OperationException(String mensaje) {
		//Inicializamos el mensaje de error de la clase padre
		super(mensaje);
	}
	
	
	
}
