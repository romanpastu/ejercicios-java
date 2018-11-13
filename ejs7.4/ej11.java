import java.util.*;

public class ej11 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Scanner S = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			numeros[i] = S.nextInt();
		}
		S.close();
		System.out.print("Indice");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %3d ", i);
		}
		System.out.println();
		System.out.print("Valor ");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %3d ", numeros[i]);
		}
		System.out.println();
		System.out.println("Array inicial");
		// Llenamos un array de primos
		int[] primos = new int[10];

		for (int i = 0; i < primos.length; i++) {
			int contador = 0;
			for (int j = 1; j <= numeros[i]; j++) {
				if (numeros[i] % j == 0) {
					contador++;
				}
			}

			if (contador == 2) {
				primos[i] = numeros[i];
			}
			contador = 0;
		}
		// Imprimir primos
		/*
		 * System.out.println(); for (int i = 0; i < primos.length; i++) {
		 * System.out.print(primos[i] + " "); }
		 */

		System.out.println();

		System.out.print("Indice");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %3d ", i);
		}
		System.out.println();
		System.out.print("Valor ");

		// Vamos a imprimir el array de primos primero
		for (int i = 0; i < 10; i++) {
			if (primos[i] != 0) {
				System.out.printf(" %3d ", primos[i]);
			}
		}
		// Ahora imprimimos todos los que faltan que no sean primos
		for (int i = 0; i < numeros.length; i++) {
			int contador = 0;
			for (int j = 0; j < primos.length; j++) {
				if (numeros[i] == primos[j]) {
					contador++;
				}

			}
			if (contador == 0 || numeros[i] == 0) {
				System.out.printf(" %3d ", numeros[i]);
			}
			contador = 0;
		}
		System.out.println();
		System.out.print("Array final");

	}

}
