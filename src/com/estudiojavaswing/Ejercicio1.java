package com.estudiojavaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ejercicio1 extends JFrame{
	
	public Color fondo = Color.CYAN, cBoton = Color.LIGHT_GRAY , cLabel = Color.YELLOW;
	private JPanel panelSup, panelInf;
	private JButton boton;
	private JLabel label;
	private  static int contador;
	
	public Ejercicio1() {
		contador = 0;
		crearVentana();
		inicializarContenido();
	}
	
	private void crearVentana() {
		//this.getContentPane().setBackground(fondo);
		this.setSize(400, 300);
		this.setMinimumSize(new Dimension(200, 200));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Primer ejercicio");
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
	}
	
	private void inicializarContenido() {
		contenedor();
		crearLabel();
		crearBoton();
		interaccionBoton();
	}
	
	private void contenedor() {
		
		panelSup = new JPanel();
		panelSup.setBackground(fondo);
		this.getContentPane().add(panelSup);
		
		panelInf = new JPanel();
		panelInf.setBackground(Color.BLUE);
		this.getContentPane().add(panelInf);
	}
	
	private void crearLabel() {
		
		label = new JLabel();
		label.setBounds(50,30,300,50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		//label.setOpaque(true);
		//label.setBackground(Color.WHITE);
		panelSup.add(label);
	}
	
	private void crearBoton() {
		boton = new JButton("Botón");
		boton.setBounds(panelInf.getWidth()/2, panelInf.getHeight()/2, 80, 30);
		panelInf.add(boton);
		
	}
	
	private void interaccionBoton() {
		boton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				eventoMouseClicked(e);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	private void eventoMouseClicked(MouseEvent e) {
		
		//Código que se realiza al momento de dar clic al botón
		++contador;
		
		label.setText("El botón se ha pulsado \"" + contador + "\" veces");
		
	}
	
	public static void main(String[] args) {
		
		
		Ejercicio1 ventana = new Ejercicio1();
		ventana.setVisible(true);
		
	}

}
