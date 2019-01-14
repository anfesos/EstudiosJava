package com.estudiosjava.ejemploEnumeracion;

public class EjemploEnumeraciones {

	public static void main(String[] args) {
		// VALORES DE LA ENUMERACI�N
		System.out.println("Valor 1: " + Dias.LUNES);
		
		//Hacemos un test del d�a utilizado
		indicarDia(Dias.VIERNES);
		
		//Utilizamos la enumeraci�n de pa�ses
		System.out.println("Continente no.4:" + Continentes.AMERICA);
		System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());
		
		//Hacemos el test del n�mero de paises por continente
		System.out.println("");
		indicarPaises(Continentes.AFRICA);
		
		//Imprimimos los continentes
		System.out.println("");
		ImprimirContinentes();

	}
	
	public static void indicarDia(Dias dias) {
		
		switch(dias) {
			
			//Podemos usar un valor constante de la neumeraci�n directament
		case LUNES:
			System.out.println("Primer d�a de la semana");
			break;
		case MARTES:
			System.out.println("Segundo d�a de la semana");
			break;
		default:
			System.out.println("Y as� seguimos con el resto de d�as de la semana");
		}
		
	}
	
	public static void indicarPaises(Continentes continentes) {
		
		switch (continentes) {
		//Podemos usar alg�n valor constante de la enumeraci�n directamente
		case AFRICA:
			System.out.println("No. paises en: " + continentes + ": " + continentes.getPaises());
			break;
		default:
			System.out.println("Y as� seguimos con los dem�s continentes");
		}
		
	}
	
	public static void ImprimirContinentes() {
		//Utilizamos un forEcah
		for(Continentes c : Continentes.values()) {
			System.out.println("Continente:" + c + " Contiene " + c.getPaises() + " paises.");			
		}
		
	}
}
