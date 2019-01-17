package ej8;

public class Terminal {
	private String numero;
	private int segundos = 0;
	
	
	public Terminal(String n) {
		this.numero = n;
	}
	public void llama(Terminal t, int segundos) {
		t.segundos += segundos;
		this.segundos += segundos;
	}
	
	public String toString() {
		return "Nº "+numero+" -"+segundos+"s de conversacion";
	}

	
}
