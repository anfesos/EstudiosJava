package com.estudiosjava.PrecedenciaOperadores;

public class ManejoPresedenciaDeOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primer Ejemplo Procedencia Operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Ejemplo Evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));

        System.out.println("Otro Ejemplo Evaluacion");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));

        System.out.println("\nOtro ejemplo");
        //Si detecta una cadena, lo demas lo convierte en cadana
        System.out.println("1 + 2 = " + 1 + 2);
        //Los parentesis rompen esta regla, ya que tiene la mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));

        System.out.println("\nOtro ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc");//Detecta una operacion primero
        System.out.println("abc" + 1 + 2);//Detecta una cadena primero
        
        //Ejemplo 2 de precedencia de Operadores
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        //Se evalua: 6 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println(6 / 3); //Imprime 2
        //Se evalua: 2 * 4
        System.out.println(2 * 4 ); //imprime 8
        //Se evalua -3 + 8
        System.out.println(-3 + 8); //imprime 5
        //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println(5 - 3); //imprime 2
        //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println(2 + 2);//imprime 4,
        //System.out.println("res = " + res); //es el mismo valor que el valor final
 
 
        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        //System.out.println("res2 = " + res2);
	}

}
