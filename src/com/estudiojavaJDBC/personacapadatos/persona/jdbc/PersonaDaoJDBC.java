package com.estudiojavaJDBC.personacapadatos.persona.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.estudiojavaJDBC.personacapadatos.persona.dto.PersonaDTO;

/**
 * 
 * Esta clase implementa la clase PersonaDao es una implementación con la
 * tecnología JDBC podría haber otro tipo de implmentaciones con tecnologias
 * Cómo hibernate, iBatis, SprintJDBC, etc
 * 
 * @author andres.sossa
 * @version 1
 * 
 */

public class PersonaDaoJDBC implements PersonaDao{
	
	private Connection userConn;
	
	private final String SQL_INSERT = "INSERT INTO persona (nombre,apellido) VALUES (?,?)";
	
	private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
	
	private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
	
	private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona";
	
	public PersonaDaoJDBC() {
		
	}
	
	public PersonaDaoJDBC(Connection Conn) {
		this.userConn = Conn;
	}
	
	/**
	 * El metodo insert recibe como argumento
	 * un objeto DTO el cual viene de otra capa,
	 * y se extraen sus valores para crear un nuevo registro
	 */
	
	@Override
	public int insert(PersonaDTO persona) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		int rows = 0;
		
		try {
			conn = (this.userConn != null)? this.userConn:Conexion.getConnection();
			
			ps = conn.prepareStatement(SQL_INSERT);
			int index = 1;
			ps.setString(index++, persona.getNombre());
			ps.setString(index, persona.getApellido());
			System.out.println("Ejecutando query:" + SQL_INSERT);
			rows = ps.executeUpdate();
			System.out.println("Registros Afectados: " + rows);
		} finally {
			Conexion.close(ps);
			if (this.userConn == null) {
				Conexion.close(conn);
			}
		}
		
		return rows;
	}

	@Override
	public int update(PersonaDTO persona) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		int rows = 0;
		
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			ps = conn.prepareStatement(SQL_UPDATE);
			int index = 1;
			ps.setString(index++, persona.getNombre());
			ps.setString(index++, persona.getApellido());
			ps.setInt(index, persona.getId_persona());
			System.out.println("Ejecutando Update: " + SQL_UPDATE);
			rows = ps.executeUpdate();
			System.out.println("Número de registros actualizados: " + rows);
		}finally {
			Conexion.close(ps);
			if(this.userConn == null) {
				Conexion.close(conn);
			}
		}
		
		return rows;
	}

	@Override
	public int delete(PersonaDTO persona) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		int rows = 0;
		
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			ps = conn.prepareStatement(SQL_DELETE);
			System.out.println("Ejecutando query: " + SQL_DELETE);
			int index = 1;
			ps.setInt(index, persona.getId_persona());
			rows = ps.executeUpdate();
			System.out.println("Número de registros eliminados: " + rows);
			
		}finally {
			Conexion.close(ps);
			if(this.userConn == null) {
				Conexion.close(conn);
			}
		}
		
		return rows;
	}

	@Override
	public List<PersonaDTO> select() throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<PersonaDTO> personasDTO = new ArrayList<PersonaDTO>();
		PersonaDTO personaDTO = null;
		
		try {
			
			conn = (this.userConn != null)?this.userConn:Conexion.getConnection();
			ps = conn.prepareStatement(SQL_SELECT);
			System.out.println("Ejecutando query: " + SQL_SELECT);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				personaDTO = new PersonaDTO();
				personaDTO.setId_persona(rs.getInt(1));
				personaDTO.setNombre(rs.getString(2));
				personaDTO.setApellido(rs.getString(3));
				personasDTO.add(personaDTO);
			}
			
		}finally {
			Conexion.close(ps);
			if(this.userConn == null) {
				Conexion.close(conn);
			}
		}
		
		return personasDTO;
	}
	
	
	
}
