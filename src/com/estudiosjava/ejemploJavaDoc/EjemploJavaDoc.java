/**
 * Derechos reservados ANFESOS
 */
package com.estudiosjava.ejemploJavaDoc;

/**
 * Clase para probar el concepto de JavaDoc
 * @author andres.sossa
 * @version 1.0
 */

public class EjemploJavaDoc {
	/**
	 * Metodo que ejecuta la prueba de la clase Aritmetica
	 * @param args argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		int resultado = new Aritmetica(3,2).sumar();
		
		System.out.println("resultado " + resultado);

	}

}
