package com.estudiosjava.ciclos;

import java.util.Scanner;

public class EjemploDoWhileV2 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese el valor maximo a ejecutar");
		
		int contador;
		int valorMaximo;
		
		Scanner valor = new Scanner(System.in);
		
		valorMaximo = valor.nextInt();
		
		contador = 0;
			
		do {
			
			System.out.println("contador = " + (contador));
			
			contador++;
		}while(contador < valorMaximo);
		
		
		valor.close();
		
	}

}
