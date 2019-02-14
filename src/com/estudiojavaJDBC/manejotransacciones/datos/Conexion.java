package com.estudiojavaJDBC.manejotransacciones.datos;
import java.sql.*;

public class Conexion {
	
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false"; //SSL es apra evitar warning
	private static String JDBC_USER = "root";
	private static String JDBC_PASS = "admin";
	private static Driver driver = null;
	
	//Metodo que hace que sólo un hilo pueda trabajar al tiempo
	public static synchronized Connection getConnection() throws SQLException{
		
		if(driver == null) {
			
			try {
				//Carga en memoria la clase del driver de Mysql
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver) jdbcDriverClass.newInstance();
				DriverManager.registerDriver(driver);
			}catch(Exception e) {
				System.out.println("Falló en cargar el driver JDBC");
				e.printStackTrace();
			}
		}
		
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}
	
	/**
	 * Cierra los objetos ResultSet
	 * @param ResultSet : Objeto a cerrar de tipo ResultSet
	 */
	public static void close(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Cierra los objetos PreparedStatement
	 * @param stmt
	 */
	public static void close(PreparedStatement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			
		}
	}
	
	/**
	 * Cierra la conexión
	 * @param conn
	 */
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
