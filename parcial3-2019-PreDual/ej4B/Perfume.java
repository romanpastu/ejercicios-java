//Román Pastushenko
package ej4B;

public class Perfume extends Regalo {
	private String aroma;
	private int anioCreacion;
	
	public Perfume(String codigo, String denominacion, int precioVenta, String aroma, int anioCreacion) {
		super(codigo, denominacion, precioVenta);
		this.aroma = aroma;
		this.anioCreacion = anioCreacion;
	}
	
	public String getAroma() {
		return aroma;
	}
	
	@Override
	public String toString() {
		String texto = super.toString();
		
		texto += " aroma: "+aroma;
		texto += " anioCreacion: "+anioCreacion;
		return texto;
	}

	
}
