package com.estudiojavaJDBC;
import java.sql.*;

public class IntroduccionJDBC {
	
	
	public static void main(String[] args) {
		//cade de conexiòn de MySql, el parametro useSSL es opcional
		
		String url = "jdbc:mysql://localhost:3306/sga?useSSL=false"; //sga es el esquema de la base de datos
		//Cargamos el driver de MySql
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Creamos el objeto conexión
			Connection conexion = (Connection) DriverManager.getConnection(url, "root", "admin");
			//Creamos un objeto de tipo Statement
			Statement instruccion = conexion.createStatement();
			//Creamos el query
			String sql = "select id_persona, nombre, apellido from persona";
			ResultSet result = instruccion.executeQuery(sql);
			
			while(result.next()) {
				System.out.print("Id: " + result.getInt(1));
				System.out.print(", Nombre: " + result.getString(2));
				System.out.println(", Apellido: " + result.getString(3));
			}
			
			//Cerrar cada uno de los objetos utilizados
			result.close();
			instruccion.close();
			conexion.close();
		} catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
