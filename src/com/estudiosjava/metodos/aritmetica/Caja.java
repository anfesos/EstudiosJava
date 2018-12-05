package com.estudiosjava.metodos.aritmetica;

public class Caja {
	
	
	//Atributos
	int alto;
	int ancho;
	int profundo;
	
	Caja(){}
	
	Caja(int alto,int ancho, int profundo){
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}
	
	int calcularVolumen() {
		return alto*ancho*profundo;
	}
	

}
