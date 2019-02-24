package com.estudiosjava.manejogenericos;

public class ManejoGenericos {
	
	public static void main(String[] args) {
		//Creamos una instancia de ClaseGenerica para integer
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
		
		objetoInt.obtenerTipo();
		
		//Creamos una instancia de ClaseGenerica para String
		//Se puede utilizar la inferencia del tipo del lado derecho
		ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Prueba");
		objetoStr.obtenerTipo();
		
		//Los genericos no pueden ser aplicados a tipos primitivos
		//Por lo que esto marcaría un error de compilación
		//ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int>(88);
	}
}
