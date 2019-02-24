package com.estudiojavaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploFlowLayout extends JFrame{
	
	public EjemploFlowLayout() {
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
		
		this.setLayout(new FlowLayout());
		
		JPanel pCentro = new JPanel();
		pCentro.setBackground(Color.BLACK);
		this.getContentPane().add(pCentro,BorderLayout.CENTER);
		
		JPanel pNorte = new JPanel();
		pNorte.setBackground(Color.BLUE);
		this.getContentPane().add(pNorte);
		
		JPanel pSur = new JPanel();
		pSur.setBackground(Color.GREEN);
		this.getContentPane().add(pSur);
		
		JPanel pEste = new JPanel();
		pEste.setBackground(Color.GRAY);
		this.getContentPane().add(pEste);
		
		JPanel pOeste = new JPanel();
		pOeste.setBackground(Color.ORANGE);
		this.getContentPane().add(pOeste);
		
		
	}
	
	private void iniciarComponentes() {
		colocarPaneles();
	}
	
	public static void main(String[] args) {
		EjemploFlowLayout v3 = new EjemploFlowLayout();
		v3.setVisible(true);

	}
}
