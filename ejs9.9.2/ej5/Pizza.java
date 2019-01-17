package ej5;

public class Pizza {
	private String tamanio;
	private String tipo;
	private String estado = "Pedida";
	private static int contadorPedidas = 0;
	private static int contadorServidas = 0;

	public Pizza(String tipo, String tamanio) {
		this.tipo = tipo;
		this.tamanio = tamanio;
		contadorPedidas++;
	}

	public void sirve() {
		if (!this.estado.equals("Servido")) {
			this.estado = "Servido";
			contadorServidas++;
		}

	}

	public String getTamanio() {
		return tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	public static int getTotalPedidas() {
		return contadorPedidas;
	}

	public static int getTotalServidas() {
		return contadorServidas;
	}

	public String toString() {
		return "pizza " + tipo + " " + tamanio + ", " + estado;
	}

}
