package com.estudiosjava.manejocolecciones;
import java.util.*;

public class ManejoColecciones {

	public static void main(String[] args) {
		
		List miLista = new ArrayList(); //No se pueden crear objetos de tipo interface
		//Es de tipo object al no haber dicho de que tipo de dato era
		
		miLista.add("1");
		miLista.add("2");
		miLista.add("3");
		miLista.add("4");
		
		//Elemento repetido
		miLista.add("4");
		imprimir(miLista);
		
		Set miSet = new HashSet(); //Implementa la interface Set
		miSet.add("100");
		miSet.add("200");
		miSet.add("300");
		//No permite elementos repetidos, lo ignora
		miSet.add("300");
		imprimir(miSet);
		
		Map miMapa = new HashMap(); //Implementa la interface Map key, valor
		miMapa.put("1", "Juan");
		miMapa.put("2", "Carlos");
		miMapa.put("3", "Rosario");
		miMapa.put("4", "Esperanza");
		
		//Se imprime todas las llaves
		imprimir(miMapa.keySet());
		
		//Se imprime todos los valores
		imprimir(miMapa.values());
	}
	
	//Colletion es la clase padre de las clases de Collection
	private static void imprimir(Collection coleccion) {
		
		for(Object elemento : coleccion) {
			System.out.print(elemento + " ");
		}
		System.out.println("");
	}

}
