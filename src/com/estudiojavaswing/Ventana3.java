package com.estudiojavaswing;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

//Presenta como organizar de mejor forma la estructura de la creación de la ventana

public class Ventana3 extends JFrame{
	
	public Ventana3() {
		setVentana();
		iniciarComponentes();
	}
	
	private void setVentana() {
		
		this.setTitle("Mi primera ventana");
		this.setSize(400,400);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(600,600));
		this.getContentPane().setBackground(Color.CYAN);
		//this.setResizable(false); //Permite o no modificaciones del tamaño de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	private void colocarPaneles() {
		JPanel panel = new JPanel();
		panel.setSize(200,200);
		panel.setBackground(Color.RED);
		panel.setBounds(0,0,200,200);
		this.getContentPane().add(panel);
	}
	
	private void iniciarComponentes() {
		colocarPaneles();
	}
	
	public static void main(String[] args) {
		Ventana3 v3 = new Ventana3();
		v3.setVisible(true);

	}

}
