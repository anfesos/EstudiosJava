package com.estudiosjava.manejointerfaces.datos;

public class ImplementacionOracle implements AccesoDatos{
	
	//La clase debe implementar todos los metodos abstractos de la insterface, sino se vuelve abstract la clase
	//Realmente es una implementación y no una sobreescritura
	@Override
	public void insertar() {
		System.out.println("Insertar desde oracle");
	}
	
	@Override
	public void listar() {
		System.out.println("Listar desde Oracle");
	}
}
