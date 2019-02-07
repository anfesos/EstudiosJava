package com.estudiojavaswing.paintcomponents;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class HerramientasEmojis extends JPanel {

	public Estado estado = Estado.CONTENTO;

	public enum Estado {

		MUYCONTENTO, CONTENTO, LLORA, ENFADADO, TRISTE;
	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		switch (estado) {
		case MUYCONTENTO:
			pintarMuyContento(g2d);
			break;
		case CONTENTO:
			pintarContento(g2d);
			break;
		case LLORA:
			pintarLlora(g2d);
			break;
		case ENFADADO:
			pintarEnfadado(g2d);
			break;
		case TRISTE:
			pintarTriste(g2d);
			break;
		default:
			System.out.println("Que hiciste");
		}
	}

	private Graphics2D pintarMuyContento(Graphics2D g2d) {
		// Se cambia el fondo a blanco
		g2d.setBackground(Color.CYAN);
		g2d.clearRect(0, 0, 600, 600);

		// Cara
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(100, 100, 400, 400);

		// Borde
		g2d.setColor(Color.BLACK);
		g2d.drawOval(100, 100, 400, 400);

		// Boca
		g2d.setColor(Color.WHITE);
		g2d.fillArc(200, 350, 200, 100, 180, 180);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(200, 400, 400, 400);
		g2d.drawArc(200, 350, 200, 100, 180, 180);
		
		

		// Ojos
		g2d.setColor(Color.WHITE);
		g2d.fillOval(140, 150, 150, 150);
		g2d.fillOval(310, 150, 150, 150);

		// Pupilas
		g2d.setColor(Color.BLACK);
		g2d.fillOval(178, 215, 75, 75);
		g2d.fillOval(347, 215, 75, 75);

		return g2d;
	}

	private Graphics2D pintarContento(Graphics2D g2d) {

		// Se cambia el fondo a blanco
		g2d.setBackground(Color.CYAN);
		g2d.clearRect(0, 0, 600, 600);

		// Cara
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(100, 100, 400, 400);

		// Borde
		g2d.setColor(Color.BLACK);
		g2d.drawOval(100, 100, 400, 400);

		// Boca
		g2d.drawArc(200, 350, 200, 100, 180, 180);

		// Ojos
		g2d.setColor(Color.WHITE);
		g2d.fillOval(140, 150, 150, 150);
		g2d.fillOval(310, 150, 150, 150);

		// Pupilas
		g2d.setColor(Color.BLACK);
		g2d.fillOval(178, 215, 75, 75);
		g2d.fillOval(347, 215, 75, 75);

		return g2d;
	}
	
	private Graphics2D pintarTriste(Graphics2D g2d) {

		// Se cambia el fondo a blanco
		g2d.setBackground(Color.CYAN);
		g2d.clearRect(0, 0, 600, 600);

		// Cara
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(100, 100, 400, 400);

		// Borde
		g2d.setColor(Color.BLACK);
		g2d.drawOval(100, 100, 400, 400);

		// Boca
		g2d.drawArc(200, 400, 200, 100, 0, 180);

		// Ojos
		g2d.setColor(Color.WHITE);
		g2d.fillOval(140, 150, 150, 150);
		g2d.fillOval(310, 150, 150, 150);

		// Pupilas
		g2d.setColor(Color.BLACK);
		g2d.fillOval(178, 215, 75, 75);
		g2d.fillOval(347, 215, 75, 75);

		return g2d;
	}
	
	private Graphics2D pintarEnfadado(Graphics2D g2d) {
		
		ImageIcon icono = new ImageIcon("images/emojis/enfadado.png");
		Image imagen = icono.getImage();
		g2d.drawImage(imagen, 0, 0, 600,600,Color.CYAN, null);
		
		return g2d;
	}
	
	private Graphics2D pintarLlora(Graphics2D g2d) {
		
		try {
			
			URL url = new URL("https://i2.wp.com/cdn.shopify.com/s/files/1/0185/5092/products/persons-0024_large.png");
			Image imagen = ImageIO.read(url);
			g2d.drawImage(imagen, 0, 0, 600,600,Color.CYAN, null);
		}catch(MalformedURLException ex) {
			
			JOptionPane.showMessageDialog(null, "Ha habido problemas con la URL", "Erro de URL", JOptionPane.ERROR_MESSAGE);
			
		}catch(IOException ex) {
			
			JOptionPane.showMessageDialog(null, "Ha habido problemas con la lectura del imagen", "Erro de IO", JOptionPane.ERROR_MESSAGE);
		}
		
		return g2d;
	}
}
