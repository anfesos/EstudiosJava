package objetos;
import Clases.Personas.*;

public class PersonaPrueba {

	public static void main(String[] args) {
		
		System.out.println("Valores por defecto del objeto Persona");
		Persona p1 = new Persona();
		
		p1.desplegarNombre();
		
		System.out.println("\nValores modificados del objeto Persona");
		
		p1.nombre = "Andres";
		p1.apellidoPaterno = "Sossa";
		p1.apellidoMaterno = "Sánchez";
		
		p1.desplegarNombre();
		
		System.out.println("\nValores de nuevo objeto Persona");
		
		Persona p2 = new Persona();
		
		p2.nombre = "Juan";
		p2.apellidoPaterno = "Tobon";
		p2.apellidoMaterno = "De los Ricos";
		
		p2.desplegarNombre();
		
		System.out.println("\nDe nuevo los valores del primer objeto");
		p1.desplegarNombre();
		
	}

}
