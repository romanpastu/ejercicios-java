import java.util.*;

public class ej12 {

	public static void main(String[] args) {
		// inicializamos y pedimos datos
		int[] numeros = new int[10];
		int[] numeros2 = new int[10];
		Scanner S = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			numeros[i] = S.nextInt();
		}

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

		System.out.println("Introduce un valor 'final' y otro 'inicial'");
		int fin = 0;
		do {
			fin = S.nextInt();
			if (fin < 0 || fin > 9) {
				System.out.println("El final debe ser entre 0 y 9");
			}
		} while (fin < 0 || fin > 9);

		int inicio = 0;
		do {
			inicio = S.nextInt();
			if (inicio < 0 || inicio > 9 || inicio >= fin) {
				System.out.println("El inicial debe ser entre 0 y 9 y menor que el final");
			}
		} while (inicio < 0 || inicio > 9 || inicio >= fin);

		S.close();
		// Ahora vamos a meter los numeros a numeros2
		for (int i = 1; fin + i < numeros2.length; i++) {
			numeros2[fin + i] = numeros[fin + i - 1];
		}

		numeros2[fin] = numeros[inicio];
		numeros2[0] = numeros[numeros.length - 1];

		for (int i = 1; i <= inicio; i++) {
			numeros2[i] = numeros[i - 1];
		}

		for (int i = 0; i < numeros.length; i++) {
			if (i > inicio && i < fin) {
				numeros2[i] = numeros[i];
			}
		}

		// Imprimimos el indice y el array
		System.out.print("Indice");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %3d ", i);
		}
		System.out.println();
		System.out.print("Valor ");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %3d ", numeros2[i]);
		}
		System.out.println();
		System.out.println("Array final");

	}

}
