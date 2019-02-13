//Román Pastushenko
package ej4B;

public abstract class Regalo implements Vendible{

	
	private String codigo;
	private String denominacion;
	private int precioVenta;
	
	public Regalo(String codigo, String denominacion, int precioVenta) {
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.precioVenta = precioVenta;
	}
	
	@Override
	public int precio() {
		return this.precioVenta;
	}

	@Override
	public void fijarPrecio(int precio) {
		this.precioVenta = precio;
	}
	
	public String toString() {
		return "codigo: "+codigo+" denominacion: "+denominacion+" precioVenta: "+precioVenta;
	}


}
