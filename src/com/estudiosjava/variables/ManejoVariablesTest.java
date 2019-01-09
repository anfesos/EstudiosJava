package com.estudiosjava.variables;

import java.util.Scanner;

public class ManejoVariablesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables boolean, declaracion
        boolean bool1;
        //inicializacion
        bool1 = true;
        //Declaracion e inicializacion
        boolean bool2 = false;
        System.out.println("Valor bool1:" + bool1);
        System.out.println("Valor bool2:" + bool2);
        System.out.println("");
    
        //Variables byte
        byte b1 = 10;
        //Literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor byte1:" + b1);
        System.out.println("Valor byte2:" + b2);
        System.out.println("");
        
        //Tamaños
        System.out.println("Valores que maneja el tipo Byte");
        System.out.println("Bits Tipo Byte " + Byte.SIZE);
        System.out.println("Bytes Tupo Byte " + Byte.BYTES);
        System.out.println("Valor mínimo tipo bytes " + Byte.MIN_VALUE);
        System.out.println("Valor maximo tipo byte " + Byte.MAX_VALUE);
        
        
        //Variables short
        short s1 = 2;
        System.out.println("Valor char1:" + s1);
        System.out.println("");
        
      
        
        //Tamaños
        System.out.println("Valores que maneja el tipo Short");
        System.out.println("Bits Tipo Short " + Short.SIZE);
        System.out.println("Bytes Tupo Short " + Short.BYTES);
        System.out.println("Valor mínimo tipo Short " + Short.MIN_VALUE);
        System.out.println("Valor maximo tipo Short " + Short.MAX_VALUE);
        
        //Tamaños INT -> Clase Integer
        System.out.println("Valores que maneja el tipo int");
        System.out.println("Bits Tipo int " + Integer.SIZE);
        System.out.println("Bytes Tupo int " + Integer.BYTES);
        System.out.println("Valor mínimo tipo int " + Integer.MIN_VALUE);
        System.out.println("Valor maximo tipo int " + Integer.MAX_VALUE);
        
        
        //Variable char, declaracion e inicializacion en una sola linea
        //La primera declaración es en UNICODE
        //http://www.icursos.net/referencias/TablaUnicode.html
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor char1:" + ch1);
        System.out.println("Valor char2:" + ch2);
        char admiracion = '\u0021';
        System.out.println(admiracion);
        System.out.println("");
        
        //Variable enteras
        int decimal = 100;
        int octal = 0144;//Valor octal inicia con 0
        int hexa = 0x64;//Valor hexadecimal onicia con 0x
        System.out.println("Valor int decimal:" + decimal);
        System.out.println("Valor int octal:" + octal);
        System.out.println("Valor int hexadecimal:" + hexa);
        System.out.println();
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println();
        //Tamaños INT -> Clase Long
        System.out.println("Valores que maneja el tipo Long");
        System.out.println("Bits Tipo Long " + Long.SIZE);
        System.out.println("Bytes Tupo Long " + Long.BYTES);
        System.out.println("Valor mínimo tipo Long " + Long.MIN_VALUE);
        System.out.println("Valor maximo tipo Long " + Long.MAX_VALUE);
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor float1:" + f1);
        System.out.println("Valor float2:" + f2);
        System.out.println();
        
        //Los literales flotantes por lo general son double por ello se debe hacer cast
        //Tamaños INT -> Clase Long
        System.out.println("Valores que maneja el tipo Float");
        System.out.println("Bits Tipo Float " + Float.SIZE);
        System.out.println("Bytes Tupo Float " + Float.BYTES);
        System.out.println("Valor mínimo tipo Float " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo Float " + Float.MAX_VALUE);

        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor double1:" + d1);
        System.out.println("Valor double2:" + d2);
        System.out.println();
        System.out.println("Valores que maneja el tipo Double");
        System.out.println("Bits Tipo Double " + Double.SIZE);
        System.out.println("Bytes Tupo Double " + Double.BYTES);
        System.out.println("Valor mínimo tipo Double " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo Double " + Double.MAX_VALUE);
        
        //Ejemplo de manejo de variables casting y conversión
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        double precio = Double.parseDouble(scanner.nextLine());
        char simbolo = scanner.nextLine().charAt(0);
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(nombre + " #" + id + "\n" + "Precio: " + simbolo + precio + "\n" + "Envio Gratuito: " + envioGratuito);
        
        //Ejemplo Rectangulo
        int alto = Integer.parseInt(scanner.nextLine());
        int ancho = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Area: " + (alto*ancho));
        System.out.println("Perimetro: " + ((alto+ancho)*2));
        
        
        //Operador Ternario
        int numero1 = Integer.parseInt(scanner.nextLine());
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println((numero1>numero2)? numero1:numero2);
        
        
	}

}
