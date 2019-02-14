package com.estudiojavaJDBC.manejopersonas;


import com.estudiojavaJDBC.manejopersonas.datos.PersonasJDBC;
import com.estudiojavaJDBC.manejopersonas.domain.Persona;
import java.util.List;

public class ManejoPersonas {

	public static void main(String[] args) {
		PersonasJDBC personasJDBC = new PersonasJDBC();
		
		//Prueba del método insert
		//personasJDBC.insert("Luis", "Sossa");
		
		//Prueba del método update
		//personasJDBC.update(2, "Felipe", "Sánchez");
		
		//Prueba del método Delete
		//personasJDBC.delete(2);
		
		//Prueba del método Select
		//Uso del objeto persona para encapsular la información
		//de un registro de base de datos
		List<Persona> personas = personasJDBC.select();
		
		for(Persona persona : personas) {
			System.out.println(persona);
		}
		

	}

}
