package com.estudiosjava.usoScanner;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		Scanner aLeer = new Scanner(System.in);
		
		System.out.println("Proporciona t� nombre");
		String usuario = aLeer.nextLine();
		
		String saludo = "Hola";
		
		System.out.println(saludo + " " + usuario);
		

	}

}
