package com.estudiosjava.manejoarchivos;
import static com.estudiosjava.manejoarchivos.utileria.Archivos.*;

public class ManejoArchivos {
	//Nota: Ya debe estar creada la carpeta sobre la que se va a trabajar
	//Y en caso necesario se deben asignar permisos de escritura a la carpeta
	private static final String NOMBRE_ARCHIVO = "C:\\Users\\andres.sossa\\eclipse-workspace\\pruebaJava\\pruebaJava.txt";
	
	public static void main(String[] args) {
		
		//Crear un archivo
		crearArchivo(NOMBRE_ARCHIVO);
		
		//Escribir a un archivo
		escribirArchivo(NOMBRE_ARCHIVO);
		
		//Leer de un archivo
		leerArchivo(NOMBRE_ARCHIVO);
		
		//Anexar información a un archivo
		anexarArchivo(NOMBRE_ARCHIVO);
		
		//Leer de un archivo
		leerArchivo(NOMBRE_ARCHIVO);
	}

}
