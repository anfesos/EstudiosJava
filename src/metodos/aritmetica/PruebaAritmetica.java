package metodos.aritmetica;

public class PruebaAritmetica {

	public static void main(String[] args) {
		//Creamos un objeto de la clase Aritmetica con el constructor vacio
		Aritmetica obj1 = new Aritmetica(); 
		
		//Llamamos al metodo sumar y resivimos el valor devuelto
		int resultado = obj1.sumar(4, -2);
		
		System.out.println("Resultado suma directa obj1 = " + resultado);
		
		//Si llamamos directamente el metodo sumar sin argumentos
		//el valor es cero, ya que los atributos del objeto nunca se inicializaron
		//ya que no se uso el constructor con argumentos, sino el constructor vacio
		System.out.println("Resultado suma atributos obj1: " + obj1.sumar() );
		
		//ahora creamos un objeto con el constructor con 2 argumentos
		Aritmetica obj2 = new Aritmetica(2,1);
		
		//Imprimimos directamente el resultado
		//Al llamar directamente el metodo suma, nos regresa el valor de la suma
		System.out.println("\nResultado suma atributos obj2: "+ obj2.sumar());
	}

	
}
