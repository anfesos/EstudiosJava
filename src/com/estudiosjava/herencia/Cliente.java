package com.estudiosjava.herencia;

import java.util.Date;

public class Cliente extends Persona{
	
	private int idCliente;
	private java.util.Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes;
	
	public Cliente(Date fechaRegistro, boolean vip) {
		this.idCliente = ++contadorClientes;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public Date getFechaRegistro() {
		
		return this.fechaRegistro;
	}
	
	public boolean isVip() {
		return this.vip;
	}
	
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	@Override
	public String toString() {
		//Primero mandamos a llamar el m�todo toString de la clase Persona
		//para que podamos observar los valores de la clase Padre,
		//y despues imprimimos los valores de la clase hija
		return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro="+
		fechaRegistro + ", vip=" + vip + '}';
	}

}
