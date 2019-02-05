package com.estudiojavaswing.carteleradecine;

public class Pelicula {
	
	//atributos
	private String titulo;
	private String genero; // "Acción - Aventura"
	private String imagen; // "harry_potter.jpg"
	
	public Pelicula(String titulo, String genero, String imagen) {
		this.titulo = titulo;
		this.genero = genero;
		this.imagen = imagen;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getImagen() {
		return this.imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
