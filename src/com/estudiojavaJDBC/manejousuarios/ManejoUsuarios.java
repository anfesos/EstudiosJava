package com.estudiojavaJDBC.manejousuarios;

import com.estudiojavaJDBC.manejousuarios.datos.UsuariosJDBC;
import com.estudiojavaJDBC.manejousuarios.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ManejoUsuarios {

	public static void main(String[] args) {
		
		UsuariosJDBC query = new UsuariosJDBC();
		
		//Ejecución de insert
		//query.insert("Cata", "Amor");
		
		//Ejecucion de update
		//query.update("Felipe", "Conjuro02", 1);
		
		//Ejecución de Delete
		query.delete(5);
		
		//Ejecución Select
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios = query.select();
		
		for(Usuario user : usuarios) {
			
			System.out.println(user);
		}
		
	}

}
