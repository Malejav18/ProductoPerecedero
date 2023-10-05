package TiendaP;

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
	
	@Override
	public int calcularPrecioVenta (int cantidad) {
		int valorPagar=0;
		int aumento;
		switch (clasificacion) {
		case "Super alta calidad":
			aumento=this.precio*3/100;
			valorPagar = this.precio+aumento;
			break;
		case "Alta calidad":
			aumento=this.precio*2/100;
			valorPagar = this.precio+aumento;
			break;
		case "Media calidad":
			aumento=this.precio*1/100;
			valorPagar = this.precio+aumento;
			break;
		}
		return valorPagar;
	}

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param clasificacion
	 */
	public noPerecedero(int codigo, String descripcion, int precio, int c) {
		super(codigo, descripcion, precio);
		this.clasificacion = comprobarTipo(c);
	}
	
	
	

}