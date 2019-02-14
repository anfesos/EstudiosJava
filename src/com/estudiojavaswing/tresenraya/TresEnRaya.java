package com.estudiojavaswing.tresenraya;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 * 
 * @author andres.sossa
 * @version 1.0
 */

public class TresEnRaya extends JFrame {

	// La ventana será de 600 X 600
	private int size_x = 600, size_y = 600;

	// Cada cuadrado mide 200 Pixeles
	private int pixelesCuadrado = 200;

	// Tablero del juego
	Tablero tablero;

	/**
	 * Construnctor de la ventana del juego
	 */

	public TresEnRaya() {
		this.setTitle("Tres En Raya");
		this.setSize(size_x, size_y + 20);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		tablero = new Tablero();
		tablero.setBounds(0, 0, size_x, size_y);
		this.add(tablero);

		// Establecer un turno inicial
		// Dar el primer turno al usuario
		tablero.setTurno(Ficha.Turno.USUARIO);

		tablero.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				pulsarRaton(e);

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

		});
	}

	/**
	 * Colocar Ficha del usuario Cuando se pulsa el raton, si el turno es del
	 * usuario Y la casilla esta libre se pone la ficha
	 * 
	 * @param e :
	 */
	private void pulsarRaton(MouseEvent e) {
		// Es necesario que el turno sea del usuario

		boolean fichaColocada = false;
		if (tablero.getTurno() == Ficha.Turno.USUARIO) {

			// El usuario pone su ficha

			int x = (int) (e.getX() / pixelesCuadrado);
			int y = (int) (e.getY() / pixelesCuadrado);
			fichaColocada = tablero.setFicha(x, y, Ficha.Turno.USUARIO);
			tablero.repaint();

			if (fichaColocada && !tablero.comprobarSiHayGanador(Ficha.Turno.USUARIO)) {
				if (tablero.quedanCasillasLibres()) {
					// Será el turno de la IA
					tablero.setTurno(Ficha.Turno.IA);
					tablero.colocarFichaIA();
					tablero.setTurno(Ficha.Turno.USUARIO);
					tablero.repaint();
					
					if(tablero.comprobarSiHayGanador(Ficha.Turno.IA)) {
						finDelJuego(Ficha.Turno.IA);
					}else if(!tablero.quedanCasillasLibres()){
						finDelJuego(Ficha.Turno.SIN_ASINGAR);
					}else {
						//Se cambiaria al usuario, pero ya esta abajo
					}

					
				} else {
					finDelJuego(Ficha.Turno.SIN_ASINGAR);
				}
			}else if(tablero.comprobarSiHayGanador(Ficha.Turno.USUARIO)) {
					finDelJuego(Ficha.Turno.USUARIO);
			}else {
				
				//No pasa nada
			}

		}

	}

	/**
	 * Procedimiento que sigue cuando se ha acabo el juego. 1. Hay que avisar al
	 * usuario 2. Reiniciar el juego
	 * 
	 * Si el turno es del usuario, el usuario a Ganado Si el turno es de la IA, la
	 * IA a ganado Si el turno es Sin Asigna, nadie a ganado, es que se han acabado
	 * las casillas
	 */
	private void finDelJuego(Ficha.Turno turno) {

		switch (turno) {
		case IA:
			JOptionPane.showMessageDialog(null, "El juego ha acabado y tú pierdes", "has perdido",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case USUARIO:
			JOptionPane.showMessageDialog(null, "El juego ha acabado y tú eres el ganador", "has ganado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			JOptionPane.showMessageDialog(null, "El juego ha acabado en empate", "No quedan casillas libres",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}

		tablero.reiniciarJuego();

	}

	public static void main(String[] args) {
		TresEnRaya juego = new TresEnRaya();
		juego.setVisible(true);

	}

}
