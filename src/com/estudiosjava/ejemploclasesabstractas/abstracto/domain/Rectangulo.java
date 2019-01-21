package com.estudiosjava.ejemploclasesabstractas.abstracto.domain;

public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar() {
		System.out.println("Aqui debería dibujar un: " + this.getClass().getSimpleName());
	}

}
