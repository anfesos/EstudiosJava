package com.estudiosjava.modificadoresAcceso.paquete2;

import com.estudiosjava.modificadoresAcceso.paquete1.Clase1;

public class Clase3 extends Clase1{
	
	public Clase3(){
		//Cosntructor protegido, al ser una subclase puede acceder
		//aunque este en otro paquete
		super(1,3);
		//Acceso package, al estar duera de paquete esta restringido
		//super(1,2,3)
		//Acceso privado, restringido
		//super(1,2,3,4);
	}
	
	public void pruebaDesdeClase3() {
		//Acceso a Clase 1 desde Clase 2
		//Clase 3 Extiende de Clase1
		Clase1 c1 = new Clase1();
		System.out.println("");
		System.out.println("Atributo público:" + c1.atrPublico + " o heredado:" + atrPublico);
		System.out.println("Atributo protegido(Heredado):" + atrProtegido);
		System.out.println("Atributo default: No se puede acceder desde un paquete externo");
		System.out.println("Atributo private: Acceso Denegado");
		
		//Constructor Publico
		new Clase1();
		//Los demás constructores no se pueden probar así, sino desde el constructor de esta clase
		//Ya que esta es una subclase en otro paquete
		
		System.out.println("");
		System.out.println("Metodo público: " + c1.metodoPublico());
		System.out.println("Metodo protegido (Heredado)" + metodoProtegido());
		System.out.println("Metodo Default: No se puede acceder desde un paquete externo");
		System.out.println("Metodo private: Acceso denegado");
	}
}
