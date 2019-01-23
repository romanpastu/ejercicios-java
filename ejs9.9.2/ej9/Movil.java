package ej9;

public class Movil extends Terminal {
	private String tarifa;
	private double euros;

	public Movil(String s, String t) {
		super(s);
		this.tarifa = t;
		this.euros = 0;
	}

	public void llama(Movil m, int segundos) {
		m.segundos += segundos;
		this.segundos += segundos;

		if (this.getTarifa().equals("rata")) {

			this.euros += (segundos / 60.00) * 0.06;

		} else if (this.getTarifa().equals("mono")) {

			this.euros += (segundos / 60.00) * 0.12;

		} else if (this.getTarifa().equals("bisonte")) {

			this.euros += (segundos / 60.00) * 0.30;

		}

	}

	public String getTarifa() {
		return tarifa;
	}
	public double getEuros() {
		return euros;
	}

	public String toString() {
		return "Nº " + this.numero + " -" + this.getSegundos() + "s de conversacion - tarificados " + this.getEuros()
				+ " euros. Tarifa: " + getTarifa();
	}


}
