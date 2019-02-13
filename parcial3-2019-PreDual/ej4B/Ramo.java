//Román Pastushenko
package ej4B;

public class Ramo extends Regalo{
	private int numeroFlores;
	private String tipoFlor;
	public Ramo(String codigo, String denominacion, int precioVenta) {
		super(codigo, denominacion, precioVenta);
		this.numeroFlores = 6;
		this.tipoFlor = "Rosa";
	}
	
	public Ramo(String codigo, String denominacion, int precioVenta, int numeroFlores, String tipoFlor) {
		super(codigo, denominacion, precioVenta);
		this.numeroFlores = numeroFlores;
		this.tipoFlor = tipoFlor;
	}

	public int getNumeroFlores() {
		return numeroFlores;
	}

	public String getTipoFlor() {
		return tipoFlor;
	}

	@Override
	public String toString() {
		String texto = super.toString();
		
		texto += " numeroFlores: "+numeroFlores;
		texto += " tipoDeFlor: "+tipoFlor;
		return texto;
	}
	
	
}
