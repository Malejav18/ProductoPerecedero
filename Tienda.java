package ProductoPerecedero;

import java.util.ArrayList;

public class Tienda {
	public static void main(String[] args) {
	// TODO Auto-generated method stub	
	}
	
	public void agregarProducto() {
		ArrayList<Producto> ListaProductos = null;
			Producto producto1 = new Producto(12, "carne", 20000, 2);
			Producto producto2 =new Producto(13, "manzana", 2000, 1);
			Producto producto3 =new Producto(14, "leche", 15000, 3);
			Producto producto4 =new Producto(21, "pasta", 25000, 1);
			Producto producto5 =new Producto(22, "arroz", 10000, 2);
			Producto producto6 =new Producto(23, "frijol", 5000, 3);
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		listaProductos.add(producto4);
		listaProductos.add(producto5);
		listaProductos.add(producto6);
	    }
	}
			
	public void mostrar (Producto[] listaProductos) {
		for (Producto arreglo : listaProductos) {
	        System.out.println(arreglo.getPrecio());
		}
	}
	
	public void venta () {
				
	}

}
