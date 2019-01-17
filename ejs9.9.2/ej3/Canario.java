package ej3;

public class Canario extends Ave {
	private String tipoPlumas;
	public Canario(String s, String t, String tipo) {
		super(s, t);
		this.tipoPlumas = tipo;
	}
	
	public void sonidoCanario() {
		System.out.println("cccccccccc");
	}

	public String getTipoPlumas() {
		return tipoPlumas;
	}

	public void setTipoPlumas(String tipoPlumas) {
		this.tipoPlumas = tipoPlumas;
	}

}
