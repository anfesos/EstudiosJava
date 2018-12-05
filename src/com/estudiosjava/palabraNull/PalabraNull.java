package com.estudiosjava.palabraNull;

public class PalabraNull {

	public static void main(String[] args) {
		Persona p1 = new Persona("Juan");
		System.out.println("nombre p1: " + p1.obtenerNombre());
		
		Persona p2 = p1; //p2 apunta al mismo objeto p1
		System.out.println("nombre p2: " + p2.obtenerNombre());
		
		//Hacemos que p1 ya no apunte al objeto p1
		p1 = null;
		
		//comprobamos que p2 sigue apuntando al objeto
		System.out.println("Nombre p2: " + p2.obtenerNombre());
		
		//LA siguiente linea marca error de NullPointerException
		//System.out.println("Nombre p1 : " + p1.obtenerNombre());
		//Solo en caso de que no sea nulo podemos utilizar este método en esta variable
		if(p1 != null) {
			System.out.println("Nombre p1 : " + p1.obtenerNombre());
		}
	}

}

class Persona{
	
	String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
}