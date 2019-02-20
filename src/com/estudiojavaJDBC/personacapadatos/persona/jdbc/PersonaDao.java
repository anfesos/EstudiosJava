package com.estudiojavaJDBC.personacapadatos.persona.jdbc;

import java.util.*;
import java.sql.*;
import com.estudiojavaJDBC.personacapadatos.persona.dto.PersonaDTO;;;


/**
 * 
 * @author andres.sossa
 * Esta interface contiene los m�todos abstractos con las
 * operaciones b�sicas sobre la tabla de persona
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * c�digo asociado a cada m�todo
 * @version 1
 * 
 */

public interface PersonaDao {
	
	
	public int insert(PersonaDTO persona) throws SQLException;
	
	public int update(PersonaDTO persona) throws SQLException;
	
	public int delete(PersonaDTO persona) throws SQLException;
	
	public List<PersonaDTO> select() throws SQLException;
	
}
