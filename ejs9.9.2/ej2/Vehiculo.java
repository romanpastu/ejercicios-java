package ej2;

public class Vehiculo {
	private int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	private static int kilometrosRecorridos;

	public Vehiculo() {
		this.kilometrosRecorridos = 0;
	}

	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}

	public static int getKilometrosTotales() {
		return Vehiculo.kilometrosTotales;
	}

	public static void recorre(int k) {
		kilometrosRecorridos += k;
		kilometrosTotales += k;
	}

}
