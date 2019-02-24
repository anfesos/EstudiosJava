package com.estudiosjava.ejerciciofinal.peliculas.datos;
import java.util.List;


import com.estudiosjava.ejerciciofinal.peliculas.domain.*;
import com.estudiosjava.ejerciciofinal.peliculas.excepciones.*;

/**
 * 
 * @author andres.sossa
 * @version 1
 * 
 * Contiene las operaciones a ejecutar
 * en el archivo de peliculas.txt
 * 
 * Interface para manejar datos, desde la creación, lectura y escritura
 */
public interface AccesoDatos {
	
	public boolean existe(String nombreArchivo) throws AccesoDatosEx;
	
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
	
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
	
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
	
	public void crear(String nombreArchivo) throws AccesoDatosEx;
	
	public void borrar(String nombreArchivo) throws AccesoDatosEx;
} 
