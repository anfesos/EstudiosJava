package com.estudiosjava.ejemploclaseobject;

public class ClaseObject {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Juan", 10000);
		Empleado emp2 = new Empleado("Juan", 10000);
		
		compararObjetos(emp1,emp2);

	}
	
	public static void compararObjetos(Empleado emp1, Empleado emp2) {
		//Llamada metodo toString
		//Por default se manda llamar el método toString dentro de println
		System.out.println("Contenido objeto:" + emp1);
		
		//Revisión por referencia
		if (emp1 == emp2)
			System.out.println("Los objetos tiene la misma dirección de memoria");
		else
			System.out.println("Los objetos tiene distinta dirección de memoria");
		
		//Revisión por el método equals
		if(emp1.equals(emp2))
			System.out.println("Los objetos tienen el mismo contenido, son iguales");
		else
			System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
		
		
		//Revisamos el método Hashcode
		if(emp1.hashCode() == emp2.hashCode())
			System.out.println("Los objetos tiene el mismo código hash");
		else
			System.out.println("Los objetos NO tienen el mismo código hash");
		
	}

}
