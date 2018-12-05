package com.estudiosjava.sobreCargaConstructores;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int edad;
	private static int contadorPersonas;
	
	//Cosntructor sin argumentos y privado
	//Asigna el idPersona
	private Persona() {
		this.idPersona = ++contadorPersonas;
	}
	
	//Cosntructor completo sobrecargado
	public Persona(String nombre, int edad) {
		this();
		this.nombre= nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
	}

}
