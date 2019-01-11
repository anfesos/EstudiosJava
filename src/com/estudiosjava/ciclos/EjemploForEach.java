package com.estudiosjava.ciclos;

public class EjemploForEach {

	public static void main(String[] args) {
		imprimirNumerosForEach(12,15,17,20,39);

	}
	
	public static void imprimirNumerosForEach(int... numeros) {
		
		//Usamos un forEach en vez de un for normal
		for(int numero:numeros) {
			System.out.println("el número es " + numero);
		}
	}

}
