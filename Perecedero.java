package ProductoPerecedero;

public class Perecedero extends Producto{
	private int diasCaducar;
	
	
	public void calcularPrecio (int diasCaducar) {
		int precio=0;
		switch (diasCaducar) {
		case 1:
			precio = this.precio/4;
			break;
		case 2:
			precio = this.precio/3;
			break;
		case 3:
			precio = this.precio/2;
			break;
		}
		this.precio = precio;
	}


	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param diasCaducar
	 */
	public Perecedero(int codigo, String descripcion, int precio, int diasCaducar) {
		super(codigo, descripcion, precio);
		this.diasCaducar = diasCaducar;
	}
	
	
}
