
public class ej5bi {

	public static void main(String[] args) {
		int[][] numeros = new int[6][10];
		int maximo = 0;
		int minimo = 0;
		int maximoI = 0;
		int maximoJ = 0;
		int minimoI = 0;
		int minimoJ = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				numeros[i][j] = (int) (Math.random() * 1001);
				if (i == 0 && j == 0) {
					maximo = numeros[i][j];
					minimo = numeros[i][j];

				} else {
					if (numeros[i][j] > maximo) {
						maximo = numeros[i][j];
						maximoI = i;
						maximoJ = j;
					}
					if (numeros[i][j] < minimo) {
						minimo = numeros[i][j];
						minimoI = i;
						minimoJ = j;
					}
				}

			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("posicion[" + i + "][" + j + "] = " + numeros[i][j]);
				System.out.println();
			}
		}

		System.out.println("El maximo esta en: [" + maximoI + "] [" + maximoJ + "] = " + numeros[maximoI][maximoJ]);
		System.out.println("El minimo esta en: [" + minimoI + "] [" + minimoJ + "] = " + numeros[minimoI][minimoJ]);

	}

}
