package ej3;

public class Pinguino extends Ave{
	private String tipoPlumas;
	public Pinguino(String s, String t, String tp) {
		super(s, t);
		this.tipoPlumas= tp;
	}
	
	public void sonidoPinguino() {
		System.out.println("ppppppp");
	}

	public String getTipoPlumas() {
		return tipoPlumas;
	}

	public void setTipoPlumas(String tipoPlumas) {
		this.tipoPlumas = tipoPlumas;
	}

	public String toString() {
		return "sexo: "+getSexo()+" tipo plumas: "+tipoPlumas;
	}
	

}
