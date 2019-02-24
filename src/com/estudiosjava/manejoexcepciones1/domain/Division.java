package com.estudiosjava.manejoexcepciones1.domain;

public class Division {
	
	//atributo de la clase
	private int numerador;
	//atributo de la clase
	private int denominador;
	
	public Division(int numerador, int denominador) throws OperationException {
		
		if(denominador == 0) {
			//throw new IlegalArgumentException("Denominador igual a cero");
			throw new OperationException("Denominador igual a cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarOperacion() {
		System.out.println("El resultado de la divisi�n es: " + numerador/denominador);
	}
}
