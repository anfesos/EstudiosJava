package com.estudiosjava.disenoClases;

public class Ventas {

	public static void main(String[] args) {
		// Creamos varios objetos de tipo Producto
		Producto producto1 = new Producto("Camisa", 50);
		Producto producto2 = new Producto("Pantalon",100);
		
		//Creamos un objeto de tipo orden
		Orden Orden1 = new Orden();
		
		//Agregamos los productos a la orden
		Orden1.agregarProducto(producto1);
		Orden1.agregarProducto(producto2);
		
		//Imprimimos la orden
		Orden1.mostrarOrden();
		

	}

}
