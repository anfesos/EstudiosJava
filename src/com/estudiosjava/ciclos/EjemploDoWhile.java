package com.estudiosjava.ciclos;

public class EjemploDoWhile {

	public static void main(String[] args) {
		int contador = 0;
        int limite = 10;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }
        while (contador < limite);

	}

}
