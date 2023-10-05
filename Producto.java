package TiendaP;

public abstract class Producto {
	protected int codigo;
	protected String descripcion;
	protected int precio;

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 */
	public Producto(int codigo, String descripcion, int precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	/**
	 * @return the precio
	 */

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract int calcularPrecioVenta(int cantidad);
		// TODO Auto-generated method stub}
}