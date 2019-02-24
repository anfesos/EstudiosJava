package com.estudiosjava.castingObjetos;

public class Escritor extends Empleado{
	
	//Utilizamos una enumeración para las opciones de tipo escritura
	final TipoEscritura tipoEscritura;
	
	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
		super(nombre,sueldo);
		this.tipoEscritura = tipoEscritura;
	}
	
	public String obtenerDetalles() {
		//Observamos que para no repetir código, podemos utilizar
		//el metodo del padre y sólo agregar a este metodo lo de la clase hija
		//esto es invocar un metodo sobreescrito
		return super.obtenerDetalles() + ", TipoEscritura: " + tipoEscritura.getDescripcion();
	}
	
	public TipoEscritura getTipoEscritura() {
		return this.tipoEscritura;
	}
	
	public String getTipoDeEscrituraEnTexto() {
		return tipoEscritura.getDescripcion();
	}

}
