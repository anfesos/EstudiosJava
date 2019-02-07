package com.estudiojavaswing.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class Componentes extends JFrame{
	
	//Componentes para JTextFields
	private JTextField jtf;
	private JButton buttonJtf;
	private JLabel labelJtf;
	
	//Componentes Para JRadio Button
	private JRadioButton rButton1, rButton2;
	
	//Componentes para CheckBox
	private JCheckBox box1,box2,box3;
	private JLabel etiquetaBox;
	private JButton botonBox;
	
	//Componentes TextArea
	private JTextArea area;
	
	//Componentes ComboBox
	private JComboBox cBox;
	
	//Componentes JPasswordFields
	private JPasswordField password;
	
 	public Componentes() {
		this.setTitle("Componentes");
		this.setSize(480, 640);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		//textField();
		//radioButton();
		//checkBox();
		//textArea();
		//comboBox();
		passwordField();
	}
	
	private void textField() {
		
		//Colocación en pantalla
		jtf = new JTextField();
		jtf.setBounds(10,10, 440,50);
		this.add(jtf);
		
		buttonJtf = new JButton("Botón Jtf");
		buttonJtf.setBounds(10, 70, 150, 30);
		this.add(buttonJtf);
		
		labelJtf = new JLabel();
		labelJtf.setBounds(10, 110, 440, 50);
		labelJtf.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(labelJtf);
		
		//Disparar un evento
		buttonJtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				actionPerformedListener(e);
				
			}
			
		});
	}
	
	private void actionPerformedListener(ActionEvent e) {
		
		labelJtf.setText(jtf.getText());
		
	}
	
	private void radioButton() {
		rButton1 = new JRadioButton("Mujer",true);
		rButton1.setBounds(10, 10, 100, 50);
		this.add(rButton1);
		
		rButton2 = new JRadioButton("Hombre",false);
		rButton2.setBounds(10, 60, 100, 50);
		this.add(rButton2);
		
		//Acciones
		rButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rButton1.isSelected()) {
					rButton2.setSelected(false);
				}else {
					rButton1.setSelected(true);
					rButton2.setSelected(false);
				}
				
			}
			
		});
		
		rButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(rButton2.isSelected()) {
					rButton1.setSelected(false);
				}else {
					rButton2.setSelected(true);
					rButton1.setSelected(false);
				}
				
			}
			
		});
	}
	
	private void checkBox() {
		box1 = new JCheckBox("Patatas");
		box1.setBounds(10,10,150,50);
		this.add(box1);
		
		box2 = new JCheckBox("Coca Cola");
		box2.setBounds(10, 60, 150, 50);
		this.add(box2);
		
		box3 = new JCheckBox("Choclitos");
		box3.setBounds(10, 110, 150, 50);
		this.add(box3);
		
		etiquetaBox = new JLabel("Selecciona los elementos que desees de la lista");
		etiquetaBox.setBounds(20, 160, 440, 50);
		etiquetaBox.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(etiquetaBox);
		
		botonBox = new JButton("Ver elementos seleccionados");
		botonBox.setBounds(115, 210, 250, 50);
		this.add(botonBox);
		
		//Acciones
		botonBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String resultado = "";
				
				//Si hemos cogido patatas
				if(box1.isSelected()) {
					resultado += "Hemos cogido " + box1.getText() + ". ";
				}else {
					resultado += "No Hemos " + box1.getText() + ". ";
				}
				
				//Si hemos cogido Coca Cola
				
				if(box2.isSelected()) {
					resultado += "Hemos cogido " + box2.getText() + ". ";
				}else {
					resultado += "No Hemos cogido " + box2.getText() + ". ";
				}
				
				//Si hemos cogido Choclitos
				
				if(box3.isSelected()) {
					resultado += "Hemos cogido " + box3.getText() + ". ";
				}else {
					resultado += "No Hemos cogido " + box3.getText() + ". ";
				}
				
				etiquetaBox.setText(resultado);
				
			}
			
		});
		
		
	}
	
	private void textArea() {
		JTextArea area = new JTextArea("Esto es un JText Área");
		area.setEditable(true);
		area.setBounds(10, 10, 440, 200);
		this.add(area);
		
		JScrollPane scroll = new JScrollPane(area,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10, 10, 440, 200);
//		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll);
				
		
		JButton boton = new JButton("Coger información");
		boton.setBounds(125, 230, 250, 50);
		this.add(boton);
		
		//Acciones
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = "";
				s+=area.getText();
				System.out.println("Text AREA: " + s);
				
			}	
			
		});
		
	}
	
	private void comboBox() {

		
		String elementos[] = {"JComboBox", "JTextArea", "JTextField", "JRadioButton", "JCheckBox", "JPasswordField"};
		cBox = new JComboBox(elementos);
		cBox.setBounds(10, 10, 440, 50);
		this.add(cBox);
		
		JButton cBoton = new JButton("Ver contenido del JComboBox");
		cBoton.setBounds(125, 80, 250, 50);
		this.add(cBoton);
		
		//acciones
		cBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("La selección fue: " + cBox.getSelectedItem());
				
			}
			
		});
	}
	
	private void passwordField() {
		
		password = new JPasswordField();
		password.setBounds(10, 10, 250, 50);
		this.add(password);
		
		JButton boton = new JButton("Traer información de Password");
		boton.setBounds(115, 80, 250, 50);
		this.add(boton);
		
		//Acciones
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String s = "";
				for (int i=0; i<password.getPassword().length;i++ ) {
					s+=password.getPassword()[i];
				}
				
				System.out.println(s);
				
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		
		Componentes v = new Componentes();
		v.setVisible(true);

	}

}
