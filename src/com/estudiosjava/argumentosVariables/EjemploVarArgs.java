package com.estudiosjava.argumentosVariables;

public class EjemploVarArgs {

	public static void main(String[] args) {
		// Imprimimos varios números
		imprimirNumeros(15,20,3,61,75,18);
		variosParametros("Juan",true, 12,13,14,15);

	}
	
	public static void imprimirNumeros(int... numeros) {
		//Recorremos cada elemento
		int elemento;
		for(int i= 0;i < numeros.length;i++) {
			elemento = numeros[i];
			System.out.println("Elementos: " + elemento);
		}
	}
	
	//Nota: Cuando se utilice argumentos variables este debe ser el último
	
	public static void variosParametros(String nombre, boolean valido, int... numeros) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Valido: " + valido);
		
		for(int numero : numeros) {
			System.out.println("número es: " + numero);
		}
	}
}
