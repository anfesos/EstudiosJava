package com.estudiosjava.usoinstanceof;

public class EjemploUsoInstanceOf {

	public static void main(String[] args) {
		FiguraGeometrica figura;
		figura = new Elipse();
		//Determina sólo un tipo, el que corresponda con la jerarquia
		determinaTipo(figura);
		//Determina todos los tipos posibles
		System.out.println("\nTodos sus tipos");
		determinaTodosLosTipos(figura);

	}
	
	private static void determinaTodosLosTipos(FiguraGeometrica figura) {
		if(figura instanceof Elipse) {
			//Procesa algo particular de la elipse
			System.out.println("Es una Elipse");
		}
		if(figura instanceof Circulo) {
			//Procesa algo particular del circulo
			System.out.println("Es un circulo");
		}
		if(figura instanceof FiguraGeometrica) {
			//Procesa algo particular de la figura Geometrica
			System.out.println("Es una figura Geometrica");
		}
		if(figura instanceof Object) {
			//Procesa algo particular de la clase Object
			System.out.println("Es un Object");
		}
		else
		{
			System.out.println("No se encontro el tipo");
		}
	}
	
	private static void determinaTipo(FiguraGeometrica figura) {
		if(figura instanceof Elipse) {
			//Procesa algo particular de la elipse
			System.out.println("Es una Elipse");
		}
		else if(figura instanceof Circulo) {
			//Procesa algo particular del Circulo
			System.out.println("Es una Circulo");
		}
		else if(figura instanceof FiguraGeometrica) {
			//PRocesa algo particular de Figura Geometrica
			System.out.println("Es una Figura Geometrica");
		}
		else if(figura instanceof Object) {
			//Procesa algo particular de la clase Objet
			System.out.println("Es un Objet");
		}
		else
		{
			System.out.println("No se encontro el tipo");
		}
	}

}
