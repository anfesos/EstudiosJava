package com.estudiosjava.metodos.aritmetica;

public class AritmeticaV3 {
	
	//Atributos de la clase
	int a;
	int b;
	
	//cosntructor Vacio
	//Recordar que si agregamos un constructor distinto al vacio
	//Ya no se crea este contructor y nosotros debemos crearlo si lo necesitamos
	
	AritmeticaV3(){}
	
	//Constructor con dos argumentos 
	AritmeticaV3(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	//Este metodo toma los atributos de la clase para hacer la suma
	int sumar() {
		return a+b;
	}
	
	//Metodo restar
	int restar() {
		return a-b;
	}
	
	//Metodo multiplicar
	int multiplicar() {
		return a*b;
	}
	
	//Metodo dividir
	int dividir() {
		return a/b;
	}
	
	int sumar(int a,int b) {
		return a+b;
	}
	
	
}
