package com.estudiosjava.ejemploSobreEscritura;

public class EjemploSobreEscritura {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan",1000);
		System.out.println(empleado.obtenerDetalles());
		
		Gerente gerente = new Gerente("Andres", 10000, "TI");
		System.out.println(gerente.obtenerDetalles());

	}

}
