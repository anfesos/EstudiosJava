package com.estudiojavaJDBC.manejopersonas;


import com.estudiojavaJDBC.manejopersonas.datos.PersonasJDBC;
import com.estudiojavaJDBC.manejopersonas.domain.Persona;
import java.util.List;

public class ManejoPersonas {

	public static void main(String[] args) {
		PersonasJDBC personasJDBC = new PersonasJDBC();
		
		//Prueba del m�todo insert
		//personasJDBC.insert("Luis", "Sossa");
		
		//Prueba del m�todo update
		//personasJDBC.update(2, "Felipe", "S�nchez");
		
		//Prueba del m�todo Delete
		//personasJDBC.delete(2);
		
		//Prueba del m�todo Select
		//Uso del objeto persona para encapsular la informaci�n
		//de un registro de base de datos
		List<Persona> personas = personasJDBC.select();
		
		for(Persona persona : personas) {
			System.out.println(persona);
		}
		

	}

}
