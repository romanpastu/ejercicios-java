package ej10;

public class Ameba {
	private int peso;

	public Ameba(int peso) {
		this.peso = peso;
	}

	public Ameba() {
		this.peso = 3;
	}

	public void come(Ameba a) {
		if (this.peso == 0) {
			this.peso = 3;
			System.out.println("La ameba se ha regenerado a su peso por defecto");
		} else {
			this.peso += a.peso - 1;
			a.peso = 0;
		}
	}

	public void come(int a) {
		this.peso += a;
		this.peso = this.peso - 1;
	}

	public String toString() {
		return "Soy una ameba y peso " + this.peso + " microgramos";

	}

}
