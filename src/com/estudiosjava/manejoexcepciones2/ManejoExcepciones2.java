package com.estudiosjava.manejoexcepciones2;
import com.estudiosjava.manejoexcepciones2.datos.*;
import com.estudiosjava.manejoexcepciones2.excepciones.*;
public class ManejoExcepciones2 {

	public static void main(String[] args) {
		AccesoDatos datos = new ImplementacionMySql();
		
		//Cambiamos el estado a simularError = true
		datos.simularError(true);
		
		ejecutar(datos,"listar");
		
		//Cambiamos el estado a simularError = false
		
		ejecutar(datos,"insertar");
	}
	
	public static void ejecutar(AccesoDatos datos, String accion) {
		
		if("listar".equals(accion)) {
			try {
				datos.listar();
			}
			//Si se van a procesar varias excepciones de la misma jerarquia
			//siempre se debe procesar primero la excepciòn de menor jerarquia
			//y posteriormente la de mayor jerarquia
			catch(LecturaDatosEx ex) {
				System.out.println("Error lectura: Procesa la excepción más especifica de lectura de datos ");
			}
			catch(AccesoDatosEx ex) {
				System.out.println("Error Acceso datos: Procesa la excepción más generica de acceso a datos");
			}
			catch(Exception ex) {
				System.out.println("Error general");
			}
			finally {
				System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
			}
		}
		else if("insertar".equals(accion)) {
			try {
				datos.insertar();
			}
			catch(AccesoDatosEx ex) {
				System.out.println("Error acceso datos: Podemos procesar sólo la excepción más generica");
			}
			finally {
				System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
			}
		}
		else
		{
			System.out.println("No se proporciono ninguna acción conocida");
		}
	}

}
