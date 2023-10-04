package ProductoPerecedero;

public abstract class Producto {
	protected int codigo;
	protected String descripcion;
	protected int precio;
	
	public abstract void calcularPrecio();
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

	public void calcularPrecio(int diasCaducar) {
		// TODO Auto-generated method stub
		
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}