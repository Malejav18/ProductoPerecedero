package TiendaP;

import java.util.ArrayList;

public class Tienda {
	
	static ArrayList<Producto> listaProductos =new ArrayList<>();
	
	static Producto[] listaP =new Producto[6];
	
	public static void main(String[] args) {
		agregarProducto();
		mostrar();
		venta();
	// TODO Auto-generated method stub	
	
	}
	
	public static void agregarProducto() {
		
			Producto producto1 = new Perecedero(12, "carne", 20000, 2);
			Producto producto2 =new Perecedero(13, "manzana", 2000, 1);
			Producto producto3 =new Perecedero(14, "leche", 15000, 3);
			
			Producto producto4 =new noPerecedero(21, "pasta", 25000,1);
			Producto producto5 =new noPerecedero(22, "arroz", 10000, 2);
			Producto producto6 =new noPerecedero(23, "frijol", 5000, 3);
			
			
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		listaProductos.add(producto4);
		listaProductos.add(producto5);
		listaProductos.add(producto6);
		
		
		listaP[0] = producto1;
		listaP[1] = producto2;
		
	    
	}
	
	
			
	public static void mostrar () {
		for (Producto arreglo : listaProductos) {
	        System.out.println(arreglo);
		}
	}
	
	
	
	public static void venta () {
		int cantidad=3;
		for (Producto producto : listaProductos) {
			if(producto.codigo == 14)
				System.out.println("Valor a pagar " + producto.calcularPrecioVenta(cantidad));
			
		}
		
		for(int i=0; i < listaP.length;i++) {
			if(listaP[i].codigo == 14)
				System.out.println("Valor a pagar " + listaP[i].calcularPrecioVenta(cantidad));
			
			
		}
		
		

	}

}