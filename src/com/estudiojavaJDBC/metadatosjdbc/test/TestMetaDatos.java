package com.estudiojavaJDBC.metadatosjdbc.test;

import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;
import com.estudiojavaJDBC.metadatosjdbc.datos.Conexion;
public class TestMetaDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees");
			
			//Obtenemos un objeto de metadatos de Oracle
			OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) rs.getMetaData();
			
			if(rsOracle == null) {
				System.out.println("Metadatos no disponibles");
			}else {
				//Preguntamos cuantas columns tiene tabla de empleados
				int columnCount = rsOracle.getColumnCount();
				
				//Desplegamos el no. de columnas
				System.out.println("No. Columnas" + columnCount);
				
				for(int i=1; i <= columnCount; i++) {
					//Desplegamos el nombre de la columna
					System.out.print("Nombre Columna: " + rsOracle.getColumnName(i));
					//Desplegamos el tipo de la columna
					System.out.print(" , Tipo Columna: " + rsOracle.getColumnTypeName(i));
					
					//Desplegamos si la columna puede almacenar valores Nulos
					switch (rsOracle.isNullable(i)) {
					case OracleResultSetMetaData.columnNoNulls:
						System.out.print(", No acepta Nulos");
						break;
					case OracleResultSetMetaData.columnNullable:
						System.out.print(", Si acepta Nulos");
						break;
					case OracleResultSetMetaData.columnNullableUnknown:
						System.out.print(", VAlor nulo desconocido");
					}
					System.out.println("");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			Conexion.close(rs);
			Conexion.close(conn);
		}
	}

}
