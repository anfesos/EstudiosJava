package com.estudiosjava.proyectoReturn;

public class palabraReturn {

	public static void main(String[] args) {
		
		int resultado = sumar(3,6);
		System.out.println("Resultado : " + resultado);
		
		resultado = sumar2(4,2);
		System.out.println("Resultado : " + resultado);
	}
	
	//int es la firma del m�todo
	public static int sumar(int a, int b) {
		return a+b;
	}
	
	//Return condicionado ; es la �nica forma en que pueden haber varios return dentro de un c�digo
	//se puede poner solamente solo la palabra return esto har� que se devuelva el control al m�todo que llam� 
	public static int sumar2(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Puede proporcionar valores distintos a cero");
			return 0;
		}
		
		return a + b;
	}

}
