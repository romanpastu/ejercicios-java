package ej4;

public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int n, int d) {
		this.numerador = n;
		this.denominador = d;
	}

	public void invierte() {
		int a = this.numerador;
		int b = this.denominador;

		this.numerador = b;
		this.denominador = a;
	}

	public Fraccion multiplica2(Fraccion a) {
		return new Fraccion(this.numerador * a.getNumerador(), this.denominador * a.getDenominador());
	}

	public static Fraccion simplifica(Fraccion a) {
		int n1 = a.getNumerador();
		int n2 = a.getDenominador();
		int temp1 = n1;
		int temp2 = n2;
		while (n1 != n2) {
			if (n1 > n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}
		int n3 = temp1 / n1;
		int n4 = temp2 / n1;
		a.setNumerador(n3);
		a.setDenominador(n4);
		return a;

	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setNumerador(int n1) {
		this.numerador = n1;
	}

	public void setDenominador(int n1) {
		this.denominador = n1;
	}

	public static Fraccion multiplicacion(Fraccion a, Fraccion b) {
		return new Fraccion(a.getNumerador() * b.getNumerador(), a.getDenominador() * b.getDenominador());
	}

	public String toString() {
		return numerador + "/" + denominador;

	}

}
