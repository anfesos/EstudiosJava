package com.estudiojavaswing.paintcomponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Emoji extends JFrame{
	
	private int size_x = 600 , size_y = 620;
	private JMenuItem emojis[];
	private JMenuItem salir;
	private JMenu opciones, estados;
	private HerramientasEmojis herramienta;
	
	public Emoji() {
		this.setTitle("Configuración de Emojis");
		this.setSize(size_x, size_y);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		crearBarraDeMenu();
		
		herramienta = new HerramientasEmojis();
		herramienta.setBounds(0, 0, size_x, size_y - 20);
		this.add(herramienta);
	}
	
	private void crearBarraDeMenu() {
		
		//Barra de Menús
		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb); //La barra de menús se establece, no se añade
		
		//Menús de la Barra de Menús
		opciones = new JMenu("Opciones");
		estados = new JMenu("Estados");
		
		jmb.add(opciones);
		jmb.add(estados);
		
		//Item del menú de opciones
		salir = new JMenuItem("Salir");
		opciones.add(salir);
		
		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
			
		});
		
		//items del menù estado
		emojis = new JMenuItem[5];
		for (int i=0; i<emojis.length;i++) {
			emojis[i] = new JMenuItem(HerramientasEmojis.Estado.values()[i].toString()); //Se convierte el enumerado a String
			estados.add(emojis[i]);
		}
		//Orden de Emmojis : MUYCONTENTO, CONTENTO, LLORA, ENFADADO, TRISTE;
		
		accionesEmojis();
		
		
	}
	
	private void accionesEmojis() {
		
				
		for (int i=0; i<emojis.length;i++) {
			String s = emojis[i].getText();
			emojis[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
						herramienta.estado = HerramientasEmojis.Estado.valueOf(s);
						//JOptionPane.showMessageDialog(null, " "+ herramienta.estado, "Estado Actual", 0);
						repaint();
				}
				
			});
		}
	}
	public static void main(String[] args) {
		
		Emoji ventana = new Emoji();
		ventana.setVisible(true);

	}

}
