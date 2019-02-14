package com.estudiojavaswing.tresenraya;

import java.awt.*;

import javax.swing.*;

import com.estudiojavaswing.tresenraya.Ficha.Turno;

/**
 * 
 * @author andres.sossa
 * @version 1
 */
public class Tablero extends JPanel {

	// Atributos de la clase
	private Ficha fichas[][] = new Ficha[3][3];

	private Ficha.Turno turno = Ficha.Turno.SIN_ASINGAR;

	// La ventana será de 600 X 600
	private int size_x = 600, size_y = 600;

	// Cada cuadrado mide 200 Pixeles
	private int pixelesCuadrado = 200;

	/**
	 * Constructor del tablero Iniciarlizar el array de fichas a sin asignar
	 */

	public Tablero() {

		for (int i = 0; i < fichas.length; i++) {
			for (int j = 0; j < fichas[i].length; j++) {

				fichas[i][j] = new Ficha(i, j);
			}
		}

	}

	/**
	 * Herramienta que pinta el tablero El tablero consiste en un fondo blanco con 4
	 * líneas negras, dos líneas son horizontales y dos líneas verticales
	 * 
	 * @param
	 */

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		// Pintar fondo Blanco, para que un fondo se vea recordar borrar el fondo
		g2d.setBackground(Color.WHITE);
		g2d.clearRect(0, 0, size_x, size_y);

		g2d.setColor(Color.BLACK);
		// Lineas horizontales

		g2d.drawLine(0, 200, 600, 200);
		g2d.drawLine(0, 400, 600, 400);

		// Líneas verticales
		g2d.drawLine(200, 0, 200, 600);
		g2d.drawLine(400, 0, 400, 600);

		pintarFichas(g2d);

	}

	private void pintarFichas(Graphics2D g2d) {
		for (int i = 0; i < fichas.length; i++) {
			for (int j = 0; j < fichas[i].length; j++) {

				fichas[i][j].paintComponent(g2d);
			}
		}
	}

	public boolean comprobarSiHayGanador(Ficha.Turno turno) {
		boolean hayGanador = false;
		
		
		//Caso 1: Fila 0 -> ((0,0)(0,1)(0,2))
		//Caso 2: Fila 1 -> ((1,0)(1,1)(1,2))
		//Caso 3: Fila 2 -> ((2,0)(2,1)(2,2))
		//Caso 4: Columna 0 -> ((0,0)(1,0)(2,0))
		//Caso 5: Columna 1 -> ((0,1)(1,1)(2,1))
		//Caso 6: Columna 2 -> ((0,2)(1,2)(2,2))
		//Caso 7: Diagonal 0 -> ((0,0)(1,1)(2,2))
		//Caso 8: Diagonal 0 -> ((0,2)(1,1)(2,0))
		
		//Caso 1: Fila 0 -> ((0,0)(0,1)(0,2))
		if (fichas[0][0].getTurno() == turno && fichas[0][1].getTurno() == turno && fichas[0][2].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 2: Fila 1 -> ((1,0)(1,1)(1,2))
		else if(fichas[1][0].getTurno() == turno && fichas[1][1].getTurno() == turno && fichas[1][2].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 3: Fila 2 -> ((2,0)(2,1)(2,2))
		else if(fichas[2][0].getTurno() == turno && fichas[2][1].getTurno() == turno && fichas[2][2].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 4: Columna 0 -> ((0,0)(1,0)(2,0))
		else if(fichas[0][0].getTurno() == turno && fichas[1][0].getTurno() == turno && fichas[2][0].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 5: Columna 1 -> ((0,1)(1,1)(2,1))
		else if(fichas[0][1].getTurno() == turno && fichas[1][1].getTurno() == turno && fichas[2][1].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 6: Columna 2 -> ((0,2)(1,2)(2,2))
		else if(fichas[0][2].getTurno() == turno && fichas[1][2].getTurno() == turno && fichas[2][2].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 7: Diagonal 0 -> ((0,0)(1,1)(2,2))
		else if(fichas[0][0].getTurno() == turno && fichas[1][1].getTurno() == turno && fichas[2][2].getTurno()== turno) {
			hayGanador = true;
		}
		//Caso 8: Diagonal 0 -> ((0,2)(1,1)(2,0))
		else if(fichas[0][2].getTurno() == turno && fichas[1][1].getTurno() == turno && fichas[2][0].getTurno()== turno) {
			hayGanador = true;
		}	
		else {
			
		}
		
		return hayGanador;
	}

	public Ficha.Turno getTurno() {
		return turno;
	}

	public void setTurno(Ficha.Turno turno) {
		this.turno = turno;
	}

	/**
	 * Establecer una ficha, sólo si se puede
	 */
	public boolean setFicha(int x, int y, Ficha.Turno turno) {

		boolean fichaColocada = false;

		if (fichas[x][y].getTurno() == Ficha.Turno.SIN_ASINGAR) {
			// Podemos asignar la casilla
			fichas[x][y].setTurno(turno);

			fichaColocada = true;
		} else {
			JOptionPane.showMessageDialog(null, "Esta casilla no esta disponible", "Esto no es ajedrez",
					JOptionPane.INFORMATION_MESSAGE);
		}

		return fichaColocada;

	}

	/**
	 * Colocar ficha de la IA
	 */

	public void colocarFichaIA() {
		boolean colocada = false;

		int i = 0;

		while (i < fichas.length && !colocada) {
			int j = 0;

			while (j < fichas[i].length && !colocada) {

				if (fichas[i][j].getTurno() == Ficha.Turno.SIN_ASINGAR) {
					fichas[i][j].setTurno(Ficha.Turno.IA);
					colocada = true;
				}
				j++;
			}

			i++;
		}
	}

	public boolean quedanCasillasLibres() {
		boolean quedanCasillas = false;
		int i = 0;

		while (i < fichas.length && !quedanCasillas) {
			int j = 0;

			while (j < fichas[i].length && !quedanCasillas) {

				if (fichas[i][j].getTurno() == Ficha.Turno.SIN_ASINGAR) {

					quedanCasillas = true;
				}
				j++;
			}

			i++;
		}

		return quedanCasillas;
	}

	public void reiniciarJuego() {
		for (int i = 0; i < fichas.length; i++) {

			for (int j = 0; j < fichas[i].length; j++) {
				fichas[i][j].setTurno(Ficha.Turno.SIN_ASINGAR);
			}

		}

		repaint();
	}

}
