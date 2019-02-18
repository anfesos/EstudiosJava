package com.estudiojavaJDBC.manejotransacciones;


import com.estudiojavaJDBC.manejopersonas.datos.Conexion;
import com.estudiojavaJDBC.manejotransacciones.datos.PersonasJDBC;
import com.estudiojavaJDBC.manejotransacciones.domain.Persona;
import java.util.List;
import java.sql.*;

public class ManejoPersonas {

	public static void main(String[] args) {
		PersonasJDBC personasJDBC = new PersonasJDBC();
		
		//Creamos un objeto conexión, se va a compartir
		//para todos los queries que ejecutemos
		
		Connection conn = null;
		
		try {
			
			conn = Conexion.getConnection();
			//REvisamos se la conexión esta en modo autocommit
			//por default es autocommit == true
			//Sino se cambia no se podría realizar el rollback en caso de error
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			
			//Creamos el objeto Personas JDBC
			//proporcionamos la conexión creada
			PersonasJDBC personas = new PersonasJDBC(conn);
			
			
			//Empezamos a ejecutar sentencias
			//recordar que una transaccion agrupa varias sentencias SQL
			//si algo falla no se realizan los cambios en la BD
			
			//Cambio correcto
			//personas.update(3, "Catalina", "Sossa");
			
			//Provocamos un error superando los 45 caracteres
			//personas.insert("Miguel", "Ayalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			personas.insert("Miguel", "Ayala");
			
			
			//guardamos los cambios
			conn.commit();
		}catch(SQLException e) {
			//Hacemos rollback en caso de error
			try {
				
				System.out.println("Entramos al Rollback");
				//Imprimimos la excepción en consola
				e.printStackTrace(System.out);
				
				//Hamos el rollback
				conn.rollback();
			}catch(SQLException e1) {
				e.printStackTrace(System.out);
			}
		}

	}

}
