package com.estudiosjava.ejemploEnumeracion;

public class EjemploEnumeraciones {

	public static void main(String[] args) {
		// VALORES DE LA ENUMERACIÓN
		System.out.println("Valor 1: " + Dias.LUNES);
		
		//Hacemos un test del día utilizado
		indicarDia(Dias.VIERNES);
		
		//Utilizamos la enumeración de países
		System.out.println("Continente no.4:" + Continentes.AMERICA);
		System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());
		
		//Hacemos el test del número de paises por continente
		System.out.println("");
		indicarPaises(Continentes.AFRICA);
		
		//Imprimimos los continentes
		System.out.println("");
		ImprimirContinentes();

	}
	
	public static void indicarDia(Dias dias) {
		
		switch(dias) {
			
			//Podemos usar un valor constante de la neumeración directament
		case LUNES:
			System.out.println("Primer día de la semana");
			break;
		case MARTES:
			System.out.println("Segundo día de la semana");
			break;
		default:
			System.out.println("Y así seguimos con el resto de días de la semana");
		}
		
	}
	
	public static void indicarPaises(Continentes continentes) {
		
		switch (continentes) {
		//Podemos usar algún valor constante de la enumeración directamente
		case AFRICA:
			System.out.println("No. paises en: " + continentes + ": " + continentes.getPaises());
			break;
		default:
			System.out.println("Y así seguimos con los demás continentes");
		}
		
	}
	
	public static void ImprimirContinentes() {
		//Utilizamos un forEcah
		for(Continentes c : Continentes.values()) {
			System.out.println("Continente:" + c + " Contiene " + c.getPaises() + " paises.");			
		}
		
	}
}
