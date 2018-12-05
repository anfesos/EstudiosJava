package herencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Juan", 25000);
		System.out.println("Imprimimos el objeto empleado1");
		System.out.println(e1);
		
		Empleado e2 = new Empleado("Pedro", 15000);
		e2.setEdad(28);
		e2.setGenero('M');
		e2.setDireccion("Bogota, Colombia");
		System.out.println("\nImprimimos el objeto Empleado2");
		System.out.println(e2);
		
		//Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
		Cliente c1 = new Cliente(new java.util.Date(),false);
		System.out.println("\nImprimimos el objeto cliente1");
		System.out.println(c1);
		//Completamos el objeto persona asociado a este objeto Cliente
		c1.setNombre("Cata");
		c1.setEdad(20);
		c1.setGenero('F');
		c1.setDireccion("Mexico, DF");
		System.out.println("\nVolvemos a imprimir el objeto Cliente1");
		System.out.println(c1);

	}

}
