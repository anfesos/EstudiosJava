package com.estudiosjava.ejemploSobreEscritura;

public class Gerente extends Empleado{
	
	private String departamento;
	
	public Gerente(String nombre, double sueldo, String departamento) {
		super(nombre,sueldo);
		this.departamento = departamento;
	}
	
	//Sobreescribimos el metodo padre heredado
	public String obtenerDetalles() {
		//Observar como accedemos directamente al atributo heredado
		//debido a que se declaro como protected en la clase padre
		//y por tanto la clase hija lo hereda y accede directamente
		return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", departamento: " + departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento() {
		this.departamento = departamento;
	}

}