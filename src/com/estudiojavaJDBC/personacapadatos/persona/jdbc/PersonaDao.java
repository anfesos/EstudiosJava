package com.estudiojavaJDBC.personacapadatos.persona.jdbc;

import java.util.*;
import java.sql.*;
import com.estudiojavaJDBC.personacapadatos.persona.dto.PersonaDTO;;;


/**
 * 
 * @author andres.sossa
 * Esta interface contiene los métodos abstractos con las
 * operaciones básicas sobre la tabla de persona
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * código asociado a cada método
 * @version 1
 * 
 */

public interface PersonaDao {
	
	
	public int insert(PersonaDTO persona) throws SQLException;
	
	public int update(PersonaDTO persona) throws SQLException;
	
	public int delete(PersonaDTO persona) throws SQLException;
	
	public List<PersonaDTO> select() throws SQLException;
	
}
