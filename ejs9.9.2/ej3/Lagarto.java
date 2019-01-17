package ej3;

public class Lagarto extends Animal {
	private String tipoEscamas;
	
	public Lagarto(String s, String te) {
		super(s);
		this.tipoEscamas=te;
	}
	
	public void sonidoLargarto() {
		System.out.println("lllll");
	}

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}


	public String toString() {
		return "sexo: "+getSexo()+" tipo de escamas: "+tipoEscamas;
	}
	
	
}
