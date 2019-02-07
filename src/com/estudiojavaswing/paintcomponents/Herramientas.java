package com.estudiojavaswing.paintcomponents;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Herramientas extends JPanel{
	

	private int x[] = {300,0,600, 300};
	private int y[] = {0,600,600, 0};
	private Line2D.Float linea1 = new Line2D.Float(0, 0, 600, 600);
	private Line2D.Float linea2 = new Line2D.Float(0, 600, 600, 0);
	private Ellipse2D.Float ellipse = new Ellipse2D.Float(0, 0, 400, 200);
	private Rectangle2D.Float rectangulo = new Rectangle2D.Float(20, 300, 300, 150);
	private Polygon triangulo = new Polygon(x,y,3);
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setBackground(Color.YELLOW);
		g2d.clearRect(0, 0, 600, 600);
		
		g2d.setColor(Color.BLUE); //Cambiar el color
		
		//g2d.drawPolygon(x, y, 3); // dibujar un poligono cerrado
		g2d.fillPolygon(triangulo);
		
		g2d.drawPolyline(x, y, 4); // Dibujar un poligono que se cierra, sólo si se pone el mismo punto inicial
		
//		g2d.setColor(Color.RED);
//		g2d.draw(linea1);
//		g2d.draw(linea2);
//		
//		g2d.drawLine(0, 300, 600, 300);
//		
//		//Circulo y elipse sin fondo
//		g2d.setColor(Color.BLUE);
//		g2d.drawOval(200, 200, 400, 400);
//		g2d.draw(ellipse);
//		
//		//Circulo y elipse con fondo y linea de otro color
//		g2d.fillOval(100, 200, 200, 300);//Se pinta del color por defecto
//		g2d.setColor(Color.GREEN);//Cambio el color
//		g2d.drawOval(100, 200, 200, 300);//Pinto sin fondo
//		
//		
//		//Cuadrado y rectandulo sin fondo
//		g2d.setColor(Color.GRAY);
//		g2d.drawRect(20, 20, 100, 100);
//		g2d.drawRect(50, 50, 300, 100);
//		
//		//Cuadrado y rectangulo con fondo, y borde de diferente color
//		g2d.fillRect(20, 300, 300, 150);
//		g2d.setColor(Color.MAGENTA);
//		g2d.draw(rectangulo);
		
	}

}
