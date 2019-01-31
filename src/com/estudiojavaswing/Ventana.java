package com.estudiojavaswing;

import javax.swing.JFrame;


//ESta clase explica como crear una ventana incicial apartir del JFrame
//C�mo cambiar el tama�o y ponerla activa
//C�mo realizar el cierre definitivo del programa cuando se da en el bot�n cerrar
public class Ventana extends JFrame{
	
	//JFrame es una ventana en Java
	
	public Ventana() {
		this.setSize(400, 400);
		this.setTitle("Mi primera ventana");
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		addWindowListener(new java.awt.event.WindowAdapter() {
			
			@Override
			public void windowClosing(java.awt.event.WindowEvent evento) {
				System.exit(0);
			}
			
		});
	}
	
	public static void main(String[] args) {
		
		Ventana v = new Ventana();
		v.setVisible(true);

	}

}
