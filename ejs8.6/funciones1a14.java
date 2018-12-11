
public class funciones1a14 {

	public static void main(String[] args) {
		
	}

	public static int pegaPorDetras(int num1, int num2) {
		int numero = 0;
		if (num2 >= 0 || num2 <= 9) {
			numero = Integer.valueOf(String.valueOf(num1) + String.valueOf(num2));

		}
		return numero;
	}
	public static int pegaPorDelante(int num1, int num2) {
		int numero = 0;
		if (num2 >= 0 || num2 <= 9) {
			numero = Integer.valueOf(String.valueOf(num2)+String.valueOf(num1));
		}
		return numero;
		
	}

	public static int quitaPorDelante(int numero, int digitos) {
		char[] conjuntochar = String.valueOf(numero).toCharArray();
		int index = digitos - 1;
		int[] numeros = new int[conjuntochar.length - (index + 1)];
		System.out.println("index " + index);

		int j = 0;
		for (int i = index + 1; i < conjuntochar.length; i++) {
			numeros[j] = Character.getNumericValue(conjuntochar[i]);
			j++;
		}

		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado *= 10;
			resultado += numeros[i];
		}

		return resultado;

	}

	public static int quitaPorDetras(int numero, int digitos) {

		char[] conjuntochar = String.valueOf(numero).toCharArray();

		// System.out.println("longitud " + conjuntochar.length);

		int index = (conjuntochar.length - digitos) - 1;
		// System.out.println("index " + index);

		int[] numeros = new int[(index + 1)];
		int j = 0;

		for (int i = 0; i <= index; i++) {
			numeros[j] = Character.getNumericValue(conjuntochar[i]);
			j++;
		}

		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado *= 10;
			resultado += numeros[i];
		}

		return resultado;

	}

	public static boolean esCapicua(int numero) {
		if (numero == voltea(numero)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esPrimo(int numero) {
		int contador = 0;
		boolean primo = false;
		for (int i = 1; i <= numero; i++) {
			int resultado = numero % i;
			if (resultado == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			// System.out.println("Verdadero");
			primo = true;
		} else {
			// System.out.println("Falso");
		}
		return primo;
	}

	public static int siguientePrimo(int numero) {
		do {
			numero++;
		} while (esPrimo(numero) == false);
		return numero;
	}

	public static int digitos(int numero) {
		int digitos = 0;
		int divisor = 1;
		do {
			if (numero / divisor > 0) {
				divisor = divisor * 10;
				digitos++;
			}
		} while (numero / divisor > 0);
		return digitos;
	}

	public static int potencia(int base, int exponente) {
		int contador = 1;
		int baseanterior = base;
		do {
			base = baseanterior * base;
			contador++;
		} while (contador < exponente);
		return base;
	}

	public static int voltea(int numero) {
		int numeroDigitos = digitos(numero);
		int divisor = potencia(10, numeroDigitos - 1);
		int sumatorio = 0;
		char[] numeroString = String.valueOf(numero).toCharArray();
		for (int i = numeroDigitos - 1; i >= 0; i--) {
			sumatorio += Character.getNumericValue(numeroString[i]) * divisor;
			divisor = divisor / 10;
		}
		return sumatorio;
	}

	public static int digitoN(int numero, int N) {
		char[] numeroString = String.valueOf(numero).toCharArray();
		int digito = Character.getNumericValue(numeroString[N]);
		return digito;

	}

	public static int posicionDeDigito(int numero, int digito) {

		char[] numeroString = String.valueOf(numero).toCharArray();
		int comprobante = 0;
		int posicion = 0;
		for (int i = 0; i <= digitos(numero) - 1; i++) {

			if (Character.getNumericValue(numeroString[i]) == digito) {
				comprobante++;
				posicion = i;
				// System.out.println("La posicion devuelta comienza por 0");
			}
		}
		if (comprobante == 0) {
			return -1;
		} else {
			return posicion;
		}

	}

	public static int trozoDeNumero(int pos1, int pos2, int numero) {
		char[] conjuntochar = String.valueOf(numero).toCharArray();
		int[] conjunto = new int[pos2 + 1 - pos1];

		int j = 0;
		for (int i = pos1; i <= pos2; i++) {
			conjunto[j] = Character.getNumericValue(conjuntochar[i]);
			j++;
		}

		int resultado = 0;
		for (int i = 0; i < conjunto.length; i++) {
			resultado *= 10;
			resultado += conjunto[i];
		}

		return resultado;
	}

	public static int juntaNumeros(int num1, int num2) {

		int numero = Integer.valueOf(String.valueOf(num1) + String.valueOf(num2));
		return numero;
	}


}

