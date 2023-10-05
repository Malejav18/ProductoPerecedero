package TiendaP;

public class Perecedero extends Producto{
	private int diasCaducar;
	
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

	@Override
	public int calcularPrecioVenta (int cantidad) {
		// TODO Auto-generated method stub
		int valorPagar=0;
		switch (diasCaducar) {
		case 1:
			 valorPagar = ((this.precio*4) * cantidad);
			break;
		case 2:
			valorPagar = this.precio*3*cantidad;
			break;
		case 3:
			valorPagar = this.precio/2*cantidad;
			break;
		}
		return valorPagar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasCaducar=" + diasCaducar + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}
	
	
	
	
}