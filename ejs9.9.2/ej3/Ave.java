package ej3;

public class Ave extends Animal {
	private String tipo;

	public Ave(String s, String t) {
		super(s);
		this.tipo = t;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
