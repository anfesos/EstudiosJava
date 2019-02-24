package com.estudiojavaJDBC.personacapadatos.persona.test;

import java.sql.SQLException;
import java.util.List;
import com.estudiojavaJDBC.personacapadatos.persona.dto.PersonaDTO;
import com.estudiojavaJDBC.personacapadatos.persona.jdbc.PersonaDao;
import com.estudiojavaJDBC.personacapadatos.persona.jdbc.PersonaDaoJDBC;

public class test {

	public static void main(String [] args) {
		
		//Utilizamos el tipo interface como referencia
		//a una clase concreta
		
		PersonaDao personaDao = new PersonaDaoJDBC();
		
		
		//Creamos un nuevo registro
		//hacemos uso de la clase persona DTO la cual se usa
		//Para transferir la información entre las capas
		//No es necesario especificar la llave primaria
		//ya que en este caso es de tipo autonumerico y la BD se encarga
		//de asignarle un nuevo valor 
		
		PersonaDTO persona = new PersonaDTO();
		persona.setNombre("Maria");
		persona.setApellido("Sánchez");
		//Utilizamos la capa DAO para persistir el objeto DTO
		
		try {
			
			//Insertamos persona
			personaDao.insert(persona);
			
			//Eliminamos un registro
			//personaDao.delete(new PersonaDTO(2));
			
			//Actualizamos un registro
			PersonaDTO personaTmp = new PersonaDTO();
			personaTmp.setId_persona(2); //Actualizamos el regsitro 2
			personaTmp.setNombre("Camilo");
			personaTmp.setApellido("Lara");
			personaDao.update(personaTmp);
			
			//Seleccionamos todos los registros
			List<PersonaDTO> personas = personaDao.select();
			
			for(PersonaDTO personaDTO : personas) {
				System.out.print(personaDTO);
				System.out.println();
			}
		}catch(SQLException e) {
			System.out.println("Excepción en la capa de pruebas");
			e.printStackTrace();
		}
		
	}
}
