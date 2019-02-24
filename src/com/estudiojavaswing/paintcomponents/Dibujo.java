package com.estudiojavaswing.paintcomponents;

import javax.swing.*;

public class Dibujo extends JFrame{
	
	private Herramientas herramienta;
	private final int size_x=600, size_y=600+20; //20 son del marco del programa
	
	public Dibujo() {
		this.setSize(size_x,size_y);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		herramienta = new Herramientas();
		herramienta.setBounds(0, 0, size_x, size_y);
		this.add(herramienta);
		
	}
	
	public static void main(String[] args) {
		
		Dibujo dibujo = new Dibujo();
		dibujo.setVisible(true);

	}

}
