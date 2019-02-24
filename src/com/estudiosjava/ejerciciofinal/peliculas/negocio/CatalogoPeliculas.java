package com.estudiosjava.ejerciciofinal.peliculas.negocio;


/**
 * 
 * @author andres.sossa
 * @version 1
 * 
 * Contiene las operaciones necesarias de la aplicaci�n
 * CatalogoPeliculas
 */
public interface CatalogoPeliculas {

	public void agregarPelicula(String nombrePelicula, String nombreArchivo);
	
	public void listarPeliculas(String nombreArchivo);
	
	public void buscarPelicula(String nombreArchivo, String buscar);
	
	public void iniciarArchivo(String nombreArchivo);
	
}
