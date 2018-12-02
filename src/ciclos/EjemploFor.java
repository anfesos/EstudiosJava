package ciclos;

import java.util.Scanner;


public class EjemploFor {

	public static void main(String[] args) {
		int limite = 7;
        for (int contador = 0; contador < limite; contador++) {
            System.out.println("contador = " + contador);
        }
        
        System.out.println("Ingrese un valor maximo a poner en lista");
        
        Scanner entrada = new Scanner(System.in);
        
        limite = entrada.nextInt();
        
        for (int contador = 0; contador < limite; contador++) {
            System.out.println("contador = " + contador);
        }
        
        entrada.close();

	}

}
