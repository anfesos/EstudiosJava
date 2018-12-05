package com.estudiosjava.pasoPorReferencia;

import com.estudiosjava.Clases.Personas.Persona;

public class pasoPorReferencia {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.cambiarNombre("Juan");
		
		imprimirNombre(p); //imprime Juan
		modificarPersona(p);
		imprimirNombre(p);//imprime Carlos

	}

	private static void modificarPersona(Persona arg) {
		arg.cambiarNombre("Carlos");
		
	}

	private static void imprimirNombre(Persona p) {
		System.out.println("Valor recibido :" + p.obtenerNombre());
		
	}
	
	

}
