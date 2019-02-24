package com.estudiojavaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EjemploDeEtiquetas extends JFrame{
	
	
	public JPanel panel;
	public JLabel etiqueta;
	public JLabel imagen;
	
	public EjemploDeEtiquetas() {
		
		setVentana();
		colocarPaneles();
		colocarEtiquetas();
	}
	
	private void setVentana() {
		this.setTitle("Ejemplo de Etiquetas");
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
	}
	
	private void colocarPaneles() {
		
		//this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 300, 200);
		panel.setLayout(null); //Se quita el layout para que haga caso donde poner la información
		this.getContentPane().add(panel);
		
		
	}
	
	
	private void colocarEtiquetas() {
		etiqueta = new JLabel("Esto es una etiqueta", SwingConstants.CENTER);
		//etiqueta.setText("Esto es una etiqueta");
		etiqueta.setBounds(10, 10, 200, 30);
		etiqueta.setForeground(Color.WHITE); //Cambia el color de la letra
		etiqueta.setOpaque(true); //Con false la etiqueta es transparente, con true la etiqueta no es transparente
		etiqueta.setBackground(Color.RED);
		//etiqueta.setFont(new Font("arial", Font.ITALIC, 20));
		
		File fuente = new File("fuente.ttf");
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, fuente);
			Font sizedFont = font.deriveFont(25f);
			etiqueta.setFont(sizedFont);
					
		}catch(FontFormatException ex) {
			System.out.println("Error en Font Format");
		}catch(IOException ex) {
			System.out.println("Error en entrada/salida");
		}
		panel.add(etiqueta);
		
		
		//Emoticon
		ImageIcon emoticon = new ImageIcon("emoticon.jpg");
		imagen = new JLabel();
		imagen.setBounds(40,80,100,100);
		imagen.setIcon(new ImageIcon(emoticon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(imagen);
	}
	
	public static void main(String[] args) {
		
		EjemploDeEtiquetas v = new EjemploDeEtiquetas();
		v.setVisible(true);
		
	}

}
