import java.util.*;

public class ej9bi {

	public static void main(String[] args) {
		int[][] matriz = new int[12][12];
		System.out.println("Vamos a rotar esta matriz en sentido contrario a las aguajas del reloj");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = (int) (Math.random() * 101);
			}
		}
		System.out.println("Matriz original");
		System.out.println();
		imprimirArray(matriz);
		int contador = 0;
		for (int x = 0; x < 6; x++) {
			
			
			int auxiliar = matriz[0+contador][11-contador];
			int auxiliar2 = matriz[11-contador][0+contador];
			
			// Rotar columa izquierda abajo
			for (int i = 10-contador; i >= 0+contador; i--) {
				for (int j = 0+contador; j < 12-contador; j++) {
					if (j == 0+contador) {
						matriz[i + 1][j] = matriz[i][j];
					}
				}
			}
			
			// Rotar columna derecha arriba
			for (int i = 1+contador; i <= 11-contador; i++) {
				for (int j = 0+contador; j < 12-contador; j++) {
					if (j == 11-contador) {
						matriz[i - 1][j] = matriz[i][j];
					}
				}
			}

			matriz[0+contador][0+contador] = matriz[0+contador][1+contador];
			matriz[11-contador][11-contador] = matriz[11-contador][10-contador];

			// Rotar fila arriba
			for (int i = 0+contador; i < 12-contador; i++) {
				for (int j = 0+contador; j <= 11-contador; j++) {
					if (i == 0+contador && j != 0+contador && j != 1+contador) {
						matriz[i][j - 1] = matriz[i][j];
					}
				}
			}
			matriz[0+contador][10-contador] = auxiliar;

			// Rotar fila abajo
			for (int i = 0+contador; i < 12-contador; i++) {
				for (int j = 10-contador; j >= 0+contador; j--) {
					if (i == 11-contador && j != 11-contador && j != 10-contador) {
						matriz[i][j + 1] = matriz[i][j];
					}
				}
			}

			matriz[11-contador][1+contador] = auxiliar2;
			contador++;
		}
		
		imprimirArray(matriz);

	}

	public static void imprimirArray(int[][] arrayNum) {
		System.out.println();
		System.out.println("Matriz rotada en el sentido contrario a las agujas del reloj");
		System.out.println();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.printf("%4d", arrayNum[i][j]);
			}
			System.out.println();
		}
	}

}
