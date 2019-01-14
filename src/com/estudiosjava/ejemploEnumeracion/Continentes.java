package com.estudiosjava.ejemploEnumeracion;

public enum Continentes {
	
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	//Atributo de cada elemento de la enumeraci�n
	private final int paises;
	
	//Cosntructor de cada elemento de la enumeraci�n
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}
}
