package com.estudiojavaswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class Ejercicio2 extends JFrame{
	
	private JLabel label;
	private JButton botonR, botonG, botonB;
	private JPanel panel;
	public int contadorR, contadorG, contadorB;
	
	public enum Pulsado{PULSADOR,PULSADOG,PULSADOB, NADA};
	
	Pulsado pulsado;
	
	public Ejercicio2() {
		this.setSize(600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		//iNICIALIZAR
		contadorR = 0;
		contadorG = 0;
		contadorB = 0;
		pulsado = Pulsado.NADA;
		
		
		//Configurar Panel
		panel = new JPanel();
		panel.setBounds(0, 0, 600, 400);
		panel.setLayout(null);
		this.add(panel);
		
		//etiqueta
		label = new JLabel("Color (R, G, B)");
		label.setBounds(100,50,400,50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		//Botones
		botonR = new JButton("R");
		botonR.setBounds(100, 200, 100, 100);
		panel.add(botonR);
		botonR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				pulsado = Pulsado.PULSADOR;
				
			}
			
		});
		
		
		botonG = new JButton("G");
		botonG.setBounds(250, 200, 100, 100);
		panel.add(botonG);
		botonG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				pulsado = Pulsado.PULSADOG;
				
			}
			
		});
		
		botonB = new JButton("B");
		botonB.setBounds(400, 200, 100, 100);
		panel.add(botonB);
		botonB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				pulsado = Pulsado.PULSADOB;
				
			}
			
		});
		
		
		
		//Wheel
		this.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				eventMouseWheelMoved(e);
			}
			
		});
	}
	
	private void eventMouseWheelMoved(MouseWheelEvent e) {
		
		if (pulsado != Pulsado.NADA) {
			
			if(pulsado == Pulsado.PULSADOR) {
				//Es aumentar o disminuir el valor de R
				
				contadorR += e.getWheelRotation();
				if(contadorR < 0 || contadorR >255) {
					contadorR -= e.getWheelRotation();
				}
				
			} else if(pulsado == Pulsado.PULSADOG) {
				//Es aumentar o disminuir el valor de G
				contadorG += e.getWheelRotation();
				
				if(contadorG < 0 || contadorG >255) {
					contadorG -= e.getWheelRotation();
				}
			}else {
				//Es aumentar o disminuir el valor de B
				contadorB+=e.getWheelRotation();
				if(contadorB < 0 || contadorB >255) {
					contadorB -= e.getWheelRotation();
				}
				
			}
			
			label.setText("Color (" + contadorR + ", " + contadorG + ", " + contadorB + ")");
			
			panel.setBackground(new Color(contadorR,contadorG,contadorB));
			
		}else {
			//No hacer nada
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Ejercicio2 ventana = new Ejercicio2();
		ventana.setVisible(true);

	}

}
