package com.estudiojavaJDBC.callablestatementcursores.cs;

import java.sql.*;
import com.estudiojavaJDBC.callablestatementcursores.datos.Conexion;
import oracle.jdbc.*;

public class TestCursores {

    public static void main(String[] args) {
        //Utilizamos una clase de oracle para poder procesar el
    	//cursor que regresa la función de oracle
    	OracleCallableStatement oraCallStmt = null;
    	OracleResultSet deptResultSet = null;
    	try {
    		Connection conn = Conexion.getConnection();
    		//Tiene dos parametros que posteriormente se definiran
    		oraCallStmt = (OracleCallableStatement) conn.prepareCall("{? = call ref_cursor_package.get_dept_ref_cursor(?)}");
    		oraCallStmt.registerOutParameter(1, OracleTypes.CURSOR); //Parametro 1
    		oraCallStmt.setInt(2, 200); //Establecemos departamento_id, parametro 2
    		oraCallStmt.execute();
    		
    		//Recuperamos el resultSet y lo convertimos a un tipo Oracle
    		deptResultSet = (OracleResultSet) oraCallStmt.getCursor(1);
    		while (deptResultSet.next()) {
    			System.out.print(" Id_departamento: " + deptResultSet.getInt(1));
    			System.out.print(", Nombre_departamento: " + deptResultSet.getString(2));
    			System.out.println(", Ubicacion_id: " + deptResultSet.getString(3));
    		}
    		oraCallStmt.close();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

}
