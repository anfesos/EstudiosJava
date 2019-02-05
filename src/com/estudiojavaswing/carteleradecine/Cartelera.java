package com.estudiojavaswing.carteleradecine;

import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Cartelera extends JFrame {
	
	//Panel para Scroll
	private JScrollPane scroll;

	// Panel principal que ocupa toda la ventana, es el panel de fondo
	private JPanel panelPrincipal;

	// Panel que contendra una pelicula entera
	private JPanel celda;

	// Panel que tiene que contener la imagen
	private JPanel panelImagen;

	// Panel que tiene que contener los textos
	private JPanel panelTextos;

	// Objeto de Peliculas tipo Array
	private Pelicula peliculas[];

	// Para poner la pelucula en la pantalla
	private JLabel imagen, titulo, genero;
	
	//Valores de la ventana
	private int size_x = 480, size_y= 640;
	private int celda_x = 460,celda_y = 260;
	private int imagen_x = 180, imagen_y = 260;

	public Cartelera() {
		this.setTitle("Cartelera de cine");
		this.setSize(size_x, size_y);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
	}

	private void iniciarComponentes() {

		// Panel de Fondo
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.RED);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		this.add(panelPrincipal);
		
		//Panel para el Scroll
		scroll = new JScrollPane(panelPrincipal);
		panelPrincipal.setAutoscrolls(true);
		this.add(scroll);
		
		//Creamos las peliculas
		crearPelicula();

		for (int i = 0; i < peliculas.length; i++) {
			crearPaneles();
			ponerInformacion(i);
		}

	}

	private void crearPelicula() {
		// Creamos la primera pelicula

		peliculas = new Pelicula[4];

		peliculas[0] = new Pelicula("Harry Potter: La piedra Filosofal", "Fantasia", "harryPotterFilosofal.jpg");
		peliculas[1] = new Pelicula("Harry Potter: La orden del Fenix", "Fantasia", "harryPotterOrdenDelFenix.jpg");
		peliculas[2] = new Pelicula("Iron Man 3", "Acción", "ironMan3.jpg");
		peliculas[3] = new Pelicula("Spiderman", "Acción", "spiderman.jpg");

	}

	private void crearPaneles() {
		// Panel de Celda
		celda = new JPanel();
		celda.setBackground(Color.WHITE);
		celda.setMinimumSize(new Dimension(celda_x,celda_y));
		celda.setLayout(new BorderLayout());
		panelPrincipal.add(celda);

		// Panel que contiene la imagen
		panelImagen = new JPanel();
		panelImagen.setBackground(Color.WHITE);
		panelImagen.setPreferredSize(new Dimension(imagen_x, imagen_y));
		panelImagen.setMaximumSize(new Dimension(imagen_x,imagen_y));
		celda.add(panelImagen,BorderLayout.WEST);

		// Panel que contiene los textos
		panelTextos = new JPanel();
		panelTextos.setBackground(Color.WHITE);
		panelTextos.setPreferredSize(new Dimension(celda_x - imagen_x-20, celda_y));
		// Layout para textos
		panelTextos.setLayout(new BoxLayout(panelTextos, BoxLayout.Y_AXIS));
		celda.add(panelTextos, BorderLayout.EAST);

	}

	private void ponerInformacion(int i) {

		// Imagen de la pelicula
		imagen = new JLabel();
		ImageIcon imageIcon = new ImageIcon(peliculas[i].getImagen());
		Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(imagen_x, imagen_y, Image.SCALE_DEFAULT));
		imagen.setIcon(icon);

		panelImagen.add(imagen);

		// etiqueta del titulo
		titulo = new JLabel(peliculas[i].getTitulo());
		panelTextos.add(titulo);

		// Etiqueta Genero
		genero = new JLabel(peliculas[i].getGenero());
		panelTextos.add(genero);

	}

	public static void main(String[] args) {
		Cartelera c = new Cartelera();
		c.setVisible(true);
	}

}
