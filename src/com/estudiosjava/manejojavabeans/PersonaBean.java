package com.estudiosjava.manejojavabeans;

import java.io.Serializable;

//1. Implementa la interface Serializable del paquete java.io
//Serializable sirve para mandar la clase por la red, y serializar la clase en 1 y 0 o guardar el estado de la clase
public class PersonaBean implements Serializable{
	
	//2. Cada propiedad es de tipo private
	private String nombre;
	private int edad;
	
	//3. Siempre tiene un constructor sin argumentos
	public PersonaBean() {
		
	}
	
	//Constructor del javaBean no requerido
	public PersonaBean(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//4. Por cada propiedad agrega un get y set, o sólo uno de ellos
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
