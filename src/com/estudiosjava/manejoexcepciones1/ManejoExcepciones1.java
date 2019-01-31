package com.estudiosjava.manejoexcepciones1;
import com.estudiosjava.manejoexcepciones1.domain.*;

public class ManejoExcepciones1 {

	public static void main(String[] args) {
		
		try {
			Division division = new Division(10,0);
			division.visualizarOperacion();
		}
		catch(OperationException oe)
		{
			System.out.println("Ocurrio un error!!!");
			oe.printStackTrace(); //Pila de errores que se va acumulando desde la primera clase que genero el error hasta la última que lo proceso
		}

	}

}
