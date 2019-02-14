package com.estudiojavaJDBC.personacapadatos.persona.jdbc;
import java.sql.*;

public class Conexion {
	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "admin";
	private static Driver driver = null;
	
	public static synchronized Connection getConnection() throws SQLException {
		
		if(driver == null) {
			
			try {
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver) jdbcDriverClass.newInstance();
				
			}catch(Exception e) {
				System.out.println("Fall� en cargar el driver JDBC");
				e.printStackTrace();
			}
		}
		
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	//Cierre del PreparedStatement
	public static void close(PreparedStatement ps) {
		try {
			if(ps != null) {
				ps.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	//Cierre de la conexi�n
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
