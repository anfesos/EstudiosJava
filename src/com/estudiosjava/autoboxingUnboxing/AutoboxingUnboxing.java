package com.estudiosjava.autoboxingUnboxing;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		//Autoboxing(Se convierten de datos primitivos a tipo object)
		Integer enteroObj = 10;
		Float flotanteObj = 12.3F;
		Double doubleObj = 40.1;
		System.out.println("Autoboxing");
		System.out.println("Entero Obj: " + enteroObj.intValue());
		System.out.println("Flotante Obj: " + flotanteObj.floatValue());
		System.out.println("Double obj: " + doubleObj.doubleValue());
		
		//Unboxing(Se convierten de objetos a tipos primitivos)
		int entero = enteroObj;
		float flotante = flotanteObj;
		double doble = doubleObj;
		System.out.println("\nUnboxing");
		System.out.println("Entero: " + entero);
		System.out.println("Flotante: " + flotante);
		System.out.println("Double: " + doble);
		
		
	}
}
