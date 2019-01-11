package com.estudiosjava.matrices;

public class EjemploMatrices {

	public static void main(String[] args) {
		//1. Declarar una matriz de tipo int
		int edades[][];
		
		//2. Instanciamos la matriz de tipo int
		edades = new int[3][2];
		
		//3. Instanciar los valores de la matriz
		edades[0][0] = 30;
		edades[0][1] = 15;
		edades[1][0] = 20;
		edades[1][1] = 45;
		edades[2][0] = 5;
		edades[2][1] = 38;
		
		//4.Imprimir
		System.out.println("Matriz enteros indices 0 0: " + edades[0][0]);
		System.out.println("Matriz enteros indices 0 0: " + edades[2][0]);
		
		//1. Declaración matriz tipo Object
		Persona personas[][] = new Persona[1][2];
		
		//2. Inicializamos valores
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		
		//3. Imprimimos valores
		System.out.println("Matriz personas indices 0 0: " + personas[0][0]);
		System.out.println("Matriz personas indices 0 0: " + personas[0][1]);
		
		for (int i = 0; i < personas.length; i++) {
			
			for(int j = 0; j < personas[i].length; j++) {
				System.out.println("Matriz Personas indices: " + i + " - " + j + " : " + personas[i][j]);
			}
			
		}
		
		//Sintaxis Simplificada
		String nombres[][] = {{"Teresa","Cesar","William"},{"Yesenia","Esteban", "Maria"}};
		
		for (int i = 0; i < nombres.length; i++) {
			
			for(int j = 0; j < nombres[i].length; j++) {
				System.out.println("Matriz Personas indices: " + i + " - " + j + " : " + nombres[i][j]);
			}
			
		}

	}

}
