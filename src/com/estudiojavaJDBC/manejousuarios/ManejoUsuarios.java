package com.estudiojavaJDBC.manejousuarios;

import com.estudiojavaJDBC.manejousuarios.datos.UsuariosJDBC;
import com.estudiojavaJDBC.manejousuarios.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ManejoUsuarios {

	public static void main(String[] args) {
		
		UsuariosJDBC query = new UsuariosJDBC();
		
		//Ejecuci�n de insert
		//query.insert("Cata", "Amor");
		
		//Ejecucion de update
		//query.update("Felipe", "Conjuro02", 1);
		
		//Ejecuci�n de Delete
		query.delete(5);
		
		//Ejecuci�n Select
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios = query.select();
		
		for(Usuario user : usuarios) {
			
			System.out.println(user);
		}
		
	}

}
