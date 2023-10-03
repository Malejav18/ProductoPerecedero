package ProductoPerecedero;

public class Tienda {
	public static void main(String[] args) {
	// TODO Auto-generated method stub	
	}
	
	public void agregarProducto() {
		String[] listaProductos = new String[6];
		listaProductos[1] = Producto(12, "carne", 20000, 2);
		listaProductos[2] = Producto(13, "manzana", 2000, 1);
		listaProductos[3] = Producto(14, "leche", 15000, 3);
		listaProductos[4] = Producto(21, "pasta", 25000, 1);
		listaProductos[5] = Producto(22, "arroz", 10000, 2);
		listaProductos[6] = Producto(23, "frijol", 5000, 3);
	}
			
	public void mostrar (String listaProductos, int i) {
		System.out.println(listaProductos[i]);
	}
	
	public void venta () {
				
	}

}
