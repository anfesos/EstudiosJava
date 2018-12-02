package Clases.Personas;

public class Persona {
	
	//Atributos de una clase
    //No es necesario asignar valores
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;

    //Metodos de la clase
    //Los usaran los objetos de esta clase
    public void desplegarNombre() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido Paterno : " + apellidoPaterno);
        System.out.println("Apellido Materno : " + apellidoMaterno);
    }
    
    public void cambiarNombre(String nom) {
    	nombre = nom;
    }

	public String obtenerNombre() {
		
		return nombre;
	}
}
