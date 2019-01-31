package com.estudiosjava.manejoexcepciones2.datos;
import com.estudiosjava.manejoexcepciones2.excepciones.AccesoDatosEx;

public interface AccesoDatos {
	
	public abstract void insertar() throws AccesoDatosEx;
	public abstract void listar() throws AccesoDatosEx;
	public abstract void simularError(boolean simularError);
			
}
