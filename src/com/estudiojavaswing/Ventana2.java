package com.estudiojavaswing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

//Esta clase ense�a a utilizar el closeoperation, bot�n X
//C�mo hacer limites y que no se mueva 
//C�mo ponerle un color de fondo al Frame

public class Ventana2 extends JFrame{
	
	public Ventana2 (){
		this.setTitle("Mi segunda Ventana");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setResizable(false); //Bloquea la modificaci�n del tama�o de la ventana
		setMaximumSize(new Dimension(500,500));
		this.setMinimumSize(new Dimension(200,200));
		this.getContentPane().setBackground(Color.CYAN);
		
	}
	
	public static void main(String[] args) {
		
		Ventana2 v2 = new Ventana2();
		v2.setVisible(true);

	}

}
