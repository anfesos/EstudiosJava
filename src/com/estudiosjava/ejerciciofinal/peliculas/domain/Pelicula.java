package com.estudiosjava.ejerciciofinal.peliculas.domain;

/**
 * 
 * @author andres.sossa
 * @version 1
 * 
 * Representa los objetos pel�cula
 * utilizados en la aplicaci�n
 * Cat�logo de pel�culas
 * 
 */

public class Pelicula {
	
	//Atributos de la clase
	private String nombre;
	
	/**
	 * Constructor vacio
	 */
	public Pelicula() {
		
	}
	
	/**
	 * Constructor sobre cargado con 1 parametro
	 * @param nombre : Nombre de la pelicula
	 */
	public Pelicula(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + "]";
	}
	 	
}
