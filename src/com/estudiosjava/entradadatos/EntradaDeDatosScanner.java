package com.estudiosjava.entradadatos;
import java.util.*;

public class EntradaDeDatosScanner {

	public static void main(String[] args) {
		String captura = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un dato");
		captura = scan.nextLine();
		
		while(captura != null) {
			System.out.println("Dato introducido: " + captura);
			captura = scan.nextLine();
		}

	}

}