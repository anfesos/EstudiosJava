package com.estudiosjava.pasoPorValor;

public class PasoPorValor {
	
	public static void main(String[] args)
	{
		int x = 10;
		imprimir(x);
		cambiarValor(x);
		imprimir(x);
	}

	private static void cambiarValor(int i) {
		// TODO Auto-generated method stub
		i = 200;
	}

	private static void imprimir(int arg) {
		// TODO Auto-generated method stub
		System.out.println("Valor recibido" + arg);
	}
	

}
