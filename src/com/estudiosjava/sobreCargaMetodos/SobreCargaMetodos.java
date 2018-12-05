package com.estudiosjava.sobreCargaMetodos;

public class SobreCargaMetodos {

	public static void main(String[] args) {
		
		System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));
		
		System.out.println("Resultado 2: " + Operaciones.sumar(5, 4.1));
		
		System.out.println("Resultado 3: " + Operaciones.sumar(7.1, 3));
		
		System.out.println("Resultado 4: " + Operaciones.sumar(2.2, 6.8));
		
		//¿Cuál método se manda a Llamar?
		System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L)); //la L o l es long
		
		//Cuál método se manda a llamar
		System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A')); //La F o f es float

	}

}
