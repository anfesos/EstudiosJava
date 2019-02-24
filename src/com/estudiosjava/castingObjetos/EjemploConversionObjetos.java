package com.estudiosjava.castingObjetos;

public class EjemploConversionObjetos {
	
	public static void main(String[] args) {
		
		//1.Creamos un objeto con el tipo de más alta jerarquia 
		Empleado empleado;
		//Asignamos una referencia de una objeto de menor jerarquia
		//Esto es upcasting, no hay necesidad de una notación especial
		empleado = new Escritor("Roy", 15000,TipoEscritura.CLASICO);
		
		//Sin embargo si quisieramos acceder al detalle de la clase escritor
		//No es posible, ya que esas caracteristicas no estan en común
		//entre todas la clases de la jerarquia de clases
		//empleado.getTipoDeEscrituraEnTexto();
		
		//Imprimimos los detalles en un metodo generico
		imprimirDetalles(empleado);
		
		
		//2. Podemos hacer lo mismo con la clase gerente
		//Esto es upcasting, por lo que no requiere una sintaxis especial
		empleado = new Gerente("Laura", 10000,"Sistemas");
		
		//Pero si queremos acceder directo por la variable empleado
		//al detalle del objeto Gerente no es posible, si pierde el acceso
		//empleado.getDepartamento();
		
		//Utilizamos el mismo metodo para imprimir los detalles
		imprimirDetalles(empleado);
	}
	
	//Metodo generico para imprimir los detalles de la jerarquia empleado
	private static void imprimirDetalles(Empleado empleado) {
		
		String resultado = null;
		
		//Imrprimir detalles es general para todos ya que es por polimorfismo
		//no se necesita de ninguna conversión
		System.out.println("\nEmpleado: " + empleado.obtenerDetalles());
		
		//Pero los detalles de cada clase debemos hacer un downcasting
		if (empleado instanceof Escritor) {
			//Convertimos el objeto al tipo inferior deseado
			//Convierte objeto - Downcasting
			Escritor escritor = (Escritor) empleado;
			//Finalmente podemos acceder a los metodos de la clase Escritor
			resultado = escritor.getTipoDeEscrituraEnTexto();
			
			//Otra forma es hacer la conversión en la misma línea de código
			//Esto es muy común encontrarlo en Java
			//Para evitar la creación de variables innecesarias
			resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
			
			System.out.println("Resultado tipoEscritura:" + resultado);
			
		}else if(empleado instanceof Gerente){
			//Hacemos el downcasting en la misma línea de código
			//nos ahorramos una variable
			resultado = ((Gerente)empleado).getDepartamento();
			
			System.out.println("Resutlado departamento: " + resultado);
		}
	}

}
