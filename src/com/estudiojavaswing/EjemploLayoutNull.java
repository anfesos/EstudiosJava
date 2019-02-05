package com.estudiojavaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploLayoutNull extends JFrame{
	
	//Página con infor4mación sobre los layouts
	//http://chuwiki.chuidiang.org/index.php?title=Uso_de_Layouts
			public EjemploLayoutNull() {
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
				this.setLayout(null); //Permite poner panel con el tamaño que se desea, ya que elimina el layout por defecto que posee cada Frame
				
				
			}
			
			private void colocarPaneles() {
				
				
								
				JPanel pCentro = new JPanel();
				pCentro.setBackground(Color.BLACK);
				pCentro.setBounds(0,0,100,100);
				this.getContentPane().add(pCentro,BorderLayout.CENTER);
				
				JPanel pNorte = new JPanel();
				pNorte.setBackground(Color.BLUE);
				pNorte.setBounds(100,100,100,100);
				this.getContentPane().add(pNorte);
				
				JPanel pSur = new JPanel();
				pSur.setBackground(Color.GREEN);
				pSur.setBounds(0,100,100,100);
				this.getContentPane().add(pSur);
				
				JPanel pEste = new JPanel();
				pEste.setBackground(Color.GRAY);
				pEste.setBounds(100,0,100,100);
				this.getContentPane().add(pEste);
				
				JPanel pOeste = new JPanel();
				pOeste.setBackground(Color.ORANGE);
				pOeste.setBounds(200,200,200,100);
				this.getContentPane().add(pOeste);
				
				
			}
			
			private void iniciarComponentes() {
				colocarPaneles();
			}
			
			public static void main(String[] args) {
				EjemploLayoutNull v3 = new EjemploLayoutNull();
				v3.setVisible(true);

			}

}
