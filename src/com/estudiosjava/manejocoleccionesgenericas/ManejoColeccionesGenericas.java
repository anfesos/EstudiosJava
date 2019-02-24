package com.estudiosjava.manejocoleccionesgenericas;
import java.util.*;

public class ManejoColeccionesGenericas {

	public static void main(String[] args) {
		
		List<String> miLista = new ArrayList<>();
		miLista.add("Andres");
		miLista.add("Juan");
		miLista.add("Juan");
		
		imprimir(miLista);
		
		Set<String> miSet = new HashSet<>();
		miSet.add("Pedro");
		miSet.add("Raul");
		miSet.add("Carlos");
		
		miSet.add("Raul");
		
		imprimir(miSet);
		
		Map<String,String> miMapa = new HashMap<>();
		
		miMapa.put("1", "Andres");
		miMapa.put("2", "Catalina");
		miMapa.put("3", "Amor");
		
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
		
	}
	
	static void imprimir(Collection<String> col) {
		for(String elemento : col) {
			System.out.print(elemento + " ");
		}
		
		System.out.println("");
	}

}
