package com.estudiosjava.ejemploEnumeracion;

public enum Continentes {
	
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	//Atributo de cada elemento de la enumeración
	private final int paises;
	
	//Cosntructor de cada elemento de la enumeración
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}
}
