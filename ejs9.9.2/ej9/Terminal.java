package ej9;

public class Terminal {
	protected String numero;
	protected int segundos;
	
	public Terminal(String n) {
		this.numero = n;
		this.segundos = 0;
	}
	public void llama(Terminal t, int segundos) {
		t.segundos += segundos;
		this.segundos += segundos;
		
	}
	
	public int getSegundos() {
		return this.segundos;
	}
	
	public String toString() {
		return "Nº "+numero+" -"+this.segundos+"s de conversacion";
	}
	
}
