import java.util.*;

public class ej2bi {

	public static void main(String[] args) 
		throws InterruptedException {
		Scanner S = new Scanner(System.in);

		int[][] numeros = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				numeros[i][j] = S.nextInt();
			}
		}
		S.close();
		int sumatorioFila = 0;
		int sumatorioColumna = 0;
		int sumatorioTotal = 0;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.printf(" %3d ", numeros[i][j]);
				sumatorioFila += numeros[i][j];
				
			}
			sumatorioTotal += sumatorioFila;
			Thread.sleep(500);
			System.out.printf("|%3d", sumatorioFila);
			sumatorioFila = 0;
			System.out.println();
			
		}
		for (int x = 0; x<26; x++){
			System.out.print("-");
		}
		System.out.println();
		for ( int j = 0; j< 5; j++){
			for ( int i = 0; i<4;i++){
				sumatorioColumna+= numeros[i][j];
			}
			sumatorioTotal += sumatorioColumna;
			Thread.sleep(500);
			System.out.printf(" %3d ", sumatorioColumna);
			sumatorioColumna = 0;
		}
		Thread.sleep(500);
		System.out.print(" "+sumatorioTotal);
	}
	}

