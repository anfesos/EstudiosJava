package com.estudiojavaswing.tresenraya;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * @author andres.sossa
 * @version
 */
public class Ficha {
	
	//Atributos de la clase
	private Turno turno;
	private int x;
	private int y;
	
	
	/*
	 * turnos disponibles durante el juego
	 */
	public enum Turno{
		
		USUARIO, IA, SIN_ASINGAR;
	}
	
	/**
	 * Constructor de una Ficha sin asingar
	 * @param x: posición sobre el eje X del tablero 
	 * @param y: posición sobre el eje Y del tablero
	 * 
	 * X e Y se miden en cuadrados, no en pixeles
	 */
	public Ficha(int x, int y) {
		this.turno = Turno.SIN_ASINGAR;
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics2D g2d) {
		switch (this.turno) {
			
		case IA:
			pintarX_O(this.x,this.y,g2d,imagenC);
			break;
		case USUARIO:
			pintarX_O(this.x,this.y,g2d,imagenX);
			break;
		default:
			//La casilla: es sin asingar no hay que pintar nada
			break;
		}
	}
	
	// La ventana será de 600 X 600
	private int size_x = 600, size_y = 600;

	// Cada cuadrado mide 200 Pixeles
	private int pixelesCuadrado = 200;
	
	//String directorio imagen x
	String imagenX = "images/tresEnRaya/equix.png";
	
	//String directorio imagen o
	String imagenC  = "images/tresEnRaya/circulo.png";
	
	/**
	 * Pintar una X o una O en una posición indicada
	 * @param x : Cuadrado sobre el eje X
	 * @param y : Cuadrado sobre el eje Y
	 * @param g2d 
	 * @param imagen : Directorio donde se encuentra la imagen
	 * 
	 */
	private void pintarX_O(int x, int y, Graphics2D g2d, String imagen) {
				
		ImageIcon iconEquix = new ImageIcon(imagen);
		Image imagenEquix = iconEquix.getImage();
		
		g2d.drawImage(imagenEquix, x * pixelesCuadrado, y * pixelesCuadrado, pixelesCuadrado, pixelesCuadrado, null);
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	
}
