package com.estudiosjava.modificadoresAcceso.paquete1;

public class Clase2 {

	public Clase2() {
		// Prueba constructores
		System.out.println("");
		// Constructor publico
		new Clase1(1);
		// Constructor protegido
		new Clase1(1, 2);
		// Constructor default o package
		new Clase1(1, 2, 3);
		// Constructor private
		// new Clase1(1,2,3,4);
		System.out.println("Constructor private: Acceso negado");
	}

	public void pruebaDesdeClase2() {
		// Acceso a Clase1 desde clase 2
		Clase1 c1 = new Clase1();
		System.out.println("");
		System.out.println("Atributo publico:" + c1.atrPublico);
		System.out.println("Atributo protegido:" + c1.atrProtegido);
		System.out.println("atributo package:" + c1.atrPaquete);
		System.out.println("atributo private: Acceso denegado");

		System.out.println("");
		System.out.println("Metodo público:" + c1.metodoPublico());
		System.out.println("Metodo protegido:" + c1.metodoProtegido());
		System.out.println("Metodo package:" + c1.metodoPaquete());
		System.out.println("Metodo private: Acceso denegado");
	}
}
