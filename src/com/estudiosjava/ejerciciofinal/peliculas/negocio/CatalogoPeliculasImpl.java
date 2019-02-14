package com.estudiosjava.ejerciciofinal.peliculas.negocio;
import java.util.List;

import com.estudiosjava.ejerciciofinal.peliculas.datos.*;
import com.estudiosjava.ejerciciofinal.peliculas.domain.Pelicula;
import com.estudiosjava.ejerciciofinal.peliculas.excepciones.AccesoDatosEx;
import com.estudiosjava.ejerciciofinal.peliculas.excepciones.LecturaDatosEx;


/**
 * 
 * @author andres.sossa
 * @version 1
 * 
 * Contiene la implementaci�n de las operaciones
 * necesarias de la aplicaci�n CatalogoPeliculas
 * 
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
	
	private final AccesoDatos datos;
	
	/**
	 * Constructor vacio
	 */
	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
	};
	
	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		 Pelicula pelicula = new Pelicula(nombrePelicula);
	        boolean anexar = false;
	        try {
	            anexar = datos.existe(nombreArchivo);
	            datos.escribir(pelicula, nombreArchivo, anexar);
	        } catch (AccesoDatosEx ex) {
	            System.out.println("Error de acceso a datos");
	            ex.printStackTrace();
	        }
		
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
		
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		 String resultado = null;
	        try {
	            resultado = datos.buscar(buscar, nombreArchivo);
	        } catch (LecturaDatosEx ex) {
	            System.out.println("Error al buscar la pelicula");
	            ex.printStackTrace();
	        }
	        System.out.println("Resultado busqueda:" + resultado);
		
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
		
	}

}
