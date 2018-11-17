
public class ej6bi {

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
				int variable = (int) (Math.random() * 1001);
				int existe = 0;
				// Una vez obtenido el numero aleatorio, recorremos todo el array que ya tenemos
				// para comprobar si existe ese numero o no
				for (int x = 0; x < 6; x++) {
					for (int z = 0; z < 10; z++) {
						if (numeros[x][z] == variable) {
							existe++;
						}
					}
				}
				// Operacion que se hace en caso de que el numero no existiese
				if (existe == 0) {
					numeros[i][j] = variable;
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
					} // Operacion que se hace en caso de que el numero existiese, que en este caso,
						// es resetear la posicion del array, y volver a hacer todo el proceso
				} else {
					if (j == 0) {
						j = 9;
						i--;
					} else {
						j--;
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