
public class ej10 {

	public static void main(String[] args) {
		int[] num = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101);
		}

		// Contador de pares
		int contadorPares = 0;
		int contadorImpares = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				pares[contadorPares] = num[i];
				contadorPares++;
			} else if (num[i] % 2 != 0) {
				impares[contadorImpares] = num[i];
				contadorImpares++;
			}
		}
		contadorPares = 0;
		contadorImpares = 0;

		// Imprime todos los numeros
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// Imprime los pares
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + " ");
			if (pares[i] != 0) {
				contadorPares++;
			}
		}
		System.out.println();
		// Imprime los impares
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i] + " ");
			if (impares[i] != 0) {
				contadorImpares++;
			}
		}
		System.out.println();
		System.out.println("Numero de pares: " + contadorPares + " Numero de impares: " + contadorImpares);
		/////////////////////////
		int[] ordenado = new int[contadorPares + contadorImpares];
		for (int i = 0; i < contadorPares; i++) {
			ordenado[i] = pares[i];
		}
		int j = 0;
		for (int i = contadorPares; i < contadorPares + contadorImpares; i++) {
			ordenado[i] = impares[j];
			j++;

		}

		System.out.println("Imprime todos");
		// Imprime todos los numeros
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// Imprime el ordenado
		System.out.println("Imprime el ordenado");
		for (int i = 0; i < ordenado.length; i++) {
			System.out.print(ordenado[i] + " ");
		}

	}

}
