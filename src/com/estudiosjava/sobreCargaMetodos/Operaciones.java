package com.estudiosjava.sobreCargaMetodos;

public class Operaciones {
	
	//MEtodo sumar
	public static int sumar(int a, int b) {
		System.out.println("metodo sumar (int, int)");
		return a+b;
	}
	
	//Sobrecarga metodo sumar
	public static double sumar(double a, double b) {
		System.out.println("metodo sumar (double, double)");
		return a+b;
	}
	
	public static double sumar(int a, double b) {
		System.out.println("metodo sumar (int, double)");
		return a+b;
	}
	
	public static double sumar(double a, int b) {
		System.out.println("Metodo sumar (double, int)");
		return a+b;
	}
}
