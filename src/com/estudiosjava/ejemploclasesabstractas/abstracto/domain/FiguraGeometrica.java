package com.estudiosjava.ejemploclasesabstractas.abstracto.domain;

public abstract class FiguraGeometrica {
	
protected String tipoFigura;
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	//La clase padre no define comportamiento
	public abstract void dibujar();
	
	public String getTipoFigura() {
		return this.tipoFigura;
	}
	
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	public String toString() {
		return "FiguraGeometrica{" + "tipoFigura:" + this.tipoFigura + '}';
	}
}
