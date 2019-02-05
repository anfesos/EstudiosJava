package com.estudiojavaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploBorderLayout extends JFrame{

	public EjemploBorderLayout() {
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
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.RED);
//		this.getContentPane().add(panel,BorderLayout.AFTER_LINE_ENDS);
		
		JPanel pCentro = new JPanel();
		pCentro.setBackground(Color.BLACK);
		this.getContentPane().add(pCentro,BorderLayout.CENTER);
		
		JPanel pNorte = new JPanel();
		pNorte.setBackground(Color.BLUE);
		this.getContentPane().add(pNorte, BorderLayout.NORTH);
		
		JPanel pSur = new JPanel();
		pSur.setBackground(Color.GREEN);
		this.getContentPane().add(pSur, BorderLayout.SOUTH);
		
		JPanel pEste = new JPanel();
		pEste.setBackground(Color.cyan);
		this.getContentPane().add(pEste, BorderLayout.EAST);
		
		JPanel pOeste = new JPanel();
		pOeste.setBackground(Color.ORANGE);
		this.getContentPane().add(pOeste, BorderLayout.WEST);
		
	}
	
	private void iniciarComponentes() {
		colocarPaneles();
	}
	
	public static void main(String[] args) {
		EjemploBorderLayout v3 = new EjemploBorderLayout();
		v3.setVisible(true);

	}


}
