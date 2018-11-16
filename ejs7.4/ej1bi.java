import java.util.*;

public class ej1bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int[3][6];

		numeros[0][0] = 0;
		numeros[0][1] = 30;
		numeros[0][2] = 2;
		numeros[0][5] = 5;
		numeros[1][0] = 75;
		numeros[1][4] = 0;
		numeros[2][2] = -2;
		numeros[2][3] = 9;
		numeros[2][5] = 11;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 6; j++) {
				System.out.printf("%3s", Integer.toString(numeros[i][j]));
			}
			System.out.println();
		}
	}

}
