package com.estudiosjava.ejemploclasesabstractas.abstracto.domain;

public class Triangulo extends FiguraGeometrica{
	
	public Triangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar() {
		System.out.println("Aqui debería dibujar un: " + this.getClass().getSimpleName());
	}

}
