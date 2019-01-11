package com.estudiosjava.disenoClases;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		productos = new Producto[MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		//Si los productos agregados no superan el maximo de productos
		//Agregamos el nuevo producto al arreglo
		if(contadorProductos < MAX_PRODUCTOS) {
			//Agregamos el nuevo producto al arreglo
			//E incrementamos el contador de productos
			productos[contadorProductos++] = producto;
		}
		else
		{
			System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0 ; i < contadorProductos; i++) {
			total += productos[i].getPrecio(); // total = total + productos[i].getPrecio
		}
		return total;
		
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: " + idOrden);
		System.out.println("Total de la orden: $" + calcularTotal());
		System.out.println("Productos en la orden:");
		for(int i= 0; i< contadorProductos; i++) {
			System.out.println(productos[i]);
		}
	}
	

}
