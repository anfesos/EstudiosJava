package com.estudiojavaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

//Página con tipos de Bordes que hay: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
//Página con tipos de listeners: https://tutorialspoint.com/awt/awt_event_listeners.htm
//Página con tipos de uso de listeners: Buscar por Java Listeners Types : https://docs.oracle.com/javase/tutorial/uiswing/events/eventsandcomponents.html

public class EjemploBotones extends JFrame{
	
	public JPanel panel;
	public JLabel etiqueta;
	public JLabel imagen;
	public JButton boton;
	Color original = Color.GREEN , click = Color.BLUE, pulsado = Color.PINK, soltado = Color.RED, dentro = Color.LIGHT_GRAY, fuera = Color.DARK_GRAY;
	Color drag = Color.WHITE, move = Color.CYAN, wheel = Color.GRAY;
	Color keyTyped = Color.BLUE , keyPressed = Color.WHITE , keyReleased = Color.RED;
	
	public EjemploBotones() {
		setVentana();
		iniciarComponentes();
	}
	
	
	private void iniciarComponentes() {
		
		colocarPaneles();
		//colocarEtiquetas();
		colocarBotones();
		
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
	
	private void colocarBotones() {
		boton = new JButton("Botón");
		boton.setBounds(40, 120, 200, 80);
		//boton.setText("Botón");
		
		//Otra forma de pintar el fondo para utilizar el Background
		
		//boton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.CYAN, Color.BLUE));
		//boton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE, Color.YELLOW, Color.DARK_GRAY,Color.BLUE));
		boton.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5, false));
		
		//Página con tipos de Bordes que hay: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
		
		boton.setOpaque(true);
//		boton.setForeground(Color.BLUE);
		boton.setBackground(original);
		
		
		
		//Crear Funete de texto del botón
//		File fuente = new File("fuente.ttf");
//		try {
//			Font font = Font.createFont(Font.TRUETYPE_FONT, fuente);
//			Font sizedFont = font.deriveFont(25f);
//			boton.setFont(sizedFont);
//					
//		}catch(FontFormatException ex) {
//			System.out.println("Error en Font Format");
//		}catch(IOException ex) {
//			System.out.println("Error en entrada/salida");
//		}
//		
		
		//Asignar una fuente ya existente al botón
		//boton.setFont(new Font("arial",Font.ITALIC,14));
//		ImageIcon emoticon = new ImageIcon("emoticon.jpg");
//		boton.setIcon(new ImageIcon(emoticon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
//		
		
		
		//Imagen al botón
		
		
		panel.add(boton);
		
		//interaccionBoton();
		//interaccionBoton2();
		//interaccionBoton3();
		//interaccionBoton4();
		interaccionBoton5();
		
	}
	
	private void interaccionBoton() {
		
		boton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				//boton.setBackground(Color.BLUE);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				boton.setBackground(pulsado);				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				boton.setBackground(soltado);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				boton.setBackground(dentro);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				boton.setBackground(fuera);				
			}
			
		});
	}
	
	private void interaccionBoton2() {
		
		boton.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				boton.setBackground(drag);
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
				boton.setBackground(move);
				
			}
			
		});
		
	}
	
	//Rueda del botón
	private void interaccionBoton3() {
		boton.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				boton.setBackground(wheel);
				
			}
			
		});
	}
	
	//Acción generica
	private void interaccionBoton4() {
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				botonActionPerformed(e);
				
			}
			
		});
	}
	
	private void botonActionPerformed(ActionEvent e) {
		panel.setBackground(fuera);
	}
	
	private void interaccionBoton5() {
		boton.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				
				botonKeyTyped(e);
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				botonKeyPressed(e);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				botonKeyReleased(e);
				
			}
			
		});
	}
	
	private void botonKeyTyped(KeyEvent e) {
		
		if (e.getKeyChar() == '\n') {
			panel.setBackground(keyTyped);
		}
		
	}
	
	private void botonKeyPressed(KeyEvent e) {
		
		if(e.getKeyChar() == 'p') {
			panel.setBackground(keyPressed);
		}
		
	}
	
	private void botonKeyReleased(KeyEvent e) {
		if (e.getKeyChar() == 'o') {
			panel.setBackground(keyReleased);
		}
	}
	
	
	public static void main(String[] args) {
		
		EjemploBotones v = new EjemploBotones();
		v.setVisible(true);
		
	}
}
