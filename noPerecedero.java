package ProductoPerecedero;

public class noPerecedero extends Producto{
	private String clasificacion;
	
	private String comprobarTipo (int clasificacion) {
		String tipo;
		switch (clasificacion) {
			case 1:
				tipo = "Super alta calidad";
				break;
			case 2:
				tipo = "Alta calidad";
				break;
			case 3:
				tipo = "Media calidad";
				break;
			default:
				tipo = "Super alta calidad";
				break;
		}
			return tipo;
	}
	
	public void calcularPrecio (int tipo) {
		int precio = 0;
		int aumento;
		switch (tipo) {
		case 1:
			aumento=this.precio*3/100;
			precio = this.precio+aumento;
			break;
		case 2:
			aumento=this.precio*2/100;
			precio = this.precio+aumento;
			break;
		case 3:
			aumento=this.precio*1/100;
			precio = this.precio+aumento;
			break;
		}
		this.precio = precio;
	}

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param clasificacion
	 */
	public noPerecedero(int codigo, String descripcion, int precio, String clasificacion) {
		super(codigo, descripcion, precio);
		this.clasificacion = clasificacion;
	}
	

}
