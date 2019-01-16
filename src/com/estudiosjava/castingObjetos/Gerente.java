package com.estudiosjava.castingObjetos;

public class Gerente extends Empleado{
	
	private String departamento;
	
	public Gerente(String nombre,double sueldo, String departamento) {
		super(nombre,sueldo);
		this.departamento = departamento;
	}
	
	public String obtenerDetalles() {
		//return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", Departamento: " + departamento;
		//Para no repetir el código , podemos utilizar el metodo del padre y sólo agregar a este metodo la clase hija
		//Esto es invocar un metodo sobreescrito
		return super.obtenerDetalles() + ", Departamento: " + departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
