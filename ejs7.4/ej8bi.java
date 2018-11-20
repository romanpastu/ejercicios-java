import java.util.*;

public class ej8bi {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[][] tablero = new int[8][8];

		System.out.println("Introduce la posicion del alfil");
		String posicion = S.next();
		char columna = posicion.charAt(0);
		char fila = posicion.charAt(1);

		System.out.println("columna: " + columna + " fila: " + fila);

		int filaP = Character.getNumericValue(fila);
		int filaPos = 0;
		switch (filaP) {
		case 8:
			filaPos = 0;
			break;
		case 7:
			filaPos = 1;
			break;
		case 6:
			filaPos = 2;
			break;
		case 5:
			filaPos = 3;
			break;
		case 4:
			filaPos = 4;
			break;
		case 3:
			filaPos = 5;
			break;
		case 2:
			filaPos = 6;
			break;
		case 1:
			filaPos = 7;
			break;

		}
		int columnaP = 0;
		switch (columna) {
		case 'a':
			columnaP = 0;
			break;
		case 'b':
			columnaP = 1;
			break;
		case 'c':
			columnaP = 2;
			break;
		case 'd':
			columnaP = 3;
			break;
		case 'e':
			columnaP = 4;
			break;
		case 'f':
			columnaP = 5;
			break;
		case 'g':
			columnaP = 6;
			break;
		case 'h':
			columnaP = 7;
			break;

		}
		System.out.println("filaP: " + filaPos + " columnaP: " + columnaP);
		String[] arrayPosiciones = new String[64];
		int contadorArray = 0;
		// Abajo a la derecha
		int i = columnaP;
		int j = columnaP;

		String posicionArray = "";

		System.out.println("abajo a la derecha");
		while (j <= 7 && i <= 7 && i >= 0 && j >= 0) {

			posicionArray += i;
			posicionArray += j;
			arrayPosiciones[contadorArray] = posicionArray;
			System.out.print("[" + i + "][" + j + "] ");
			i++;
			j++;
			contadorArray++;
			posicionArray = "";
		}
		System.out.println();
		// Abajo a la izquierda
		i = columnaP;
		j = columnaP;
		System.out.println("abajo a la izquierda");
		while (j <= 7 && i <= 7 && i >= 0 && j >= 0) {
			System.out.print("[" + i + "][" + j + "] ");
			posicionArray += i;
			posicionArray += j;
			arrayPosiciones[contadorArray] = posicionArray;
			i--;
			j++;
			contadorArray++;
			posicionArray = "";
		}
		System.out.println();
		// Arriba a la derecha
		i = columnaP;
		j = columnaP;
		System.out.println("arriba  a la derecha");
		while (j <= 7 && i <= 7 && i >= 0 && j >= 0) {
			System.out.print("[" + i + "][" + j + "] ");
			posicionArray += i;
			posicionArray += j;
			arrayPosiciones[contadorArray] = posicionArray;
			i++;
			j--;
			contadorArray++;
			posicionArray = "";
		}
		System.out.println();
		// Arriba a la izquierda
		i = columnaP;
		j = columnaP;
		System.out.println("arriba  a la izquierda");
		while (j <= 7 && i <= 7 && i >= 0 && j >= 0) {
			System.out.print("[" + i + "][" + j + "] ");
			posicionArray += i;
			posicionArray += j;
			arrayPosiciones[contadorArray] = posicionArray;
			i--;
			j--;
			contadorArray++;
			posicionArray = "";
		}
		System.out.println();
		// Imprimir el array completo de strings
		System.out.println("auxiliar");
		int contadorAuxiliar = 0;
		for (String auxiliar : arrayPosiciones) {
			if (auxiliar != null) {
				contadorAuxiliar++;
			}
		}
		System.out.println();
		arrayPosiciones = Arrays.copyOf(arrayPosiciones, contadorAuxiliar);
		/*for (String auxiliar : arrayPosiciones) {
			System.out.print(auxiliar + " ");
		}*/
		System.out.println();

		for (int s = 0; s < arrayPosiciones.length - 1; s++) {
			for (int m = s + 1; m < arrayPosiciones.length; m++) {
				if (arrayPosiciones[s] != null && arrayPosiciones[s].equals(arrayPosiciones[m])) {
					arrayPosiciones[m] = null;
				}
			}
		}
		/*System.out.println();
		for (String auxiliar : arrayPosiciones) {
			System.out.print(auxiliar + " ");
		}*/

		// Aqui tenemos que recorrer el array de posiciones, y en el con switch
		// convertir el charcode en 0 y 1 de cada elemento e imprimirlo
		System.out.println();
		for (int x = 0; x < arrayPosiciones.length; x++) {
			if (arrayPosiciones[x] != null) {
				char posicion0 = arrayPosiciones[x].charAt(0);
				char posicion1 = arrayPosiciones[x].charAt(1);

				String imprimir0 = "";
				String imprimir1 = "";

				switch (posicion0) {
				case '0':
					imprimir0 += "a";
					break;
				case '1':
					imprimir0 += "b";
					break;
				case '2':
					imprimir0 += "c";
					break;
				case '3':
					imprimir0 += "d";
					break;
				case '4':
					imprimir0 += "e";
					break;
				case '5':
					imprimir0 += "f";
					break;
				case '6':
					imprimir0 += "g";
					break;
				case '7':
					imprimir0 += "h";
					break;
				}

				switch (posicion1) {
				case '0':
					imprimir1 += "8";
					break;
				case '1':
					imprimir1 += "7";
					break;
				case '2':
					imprimir1 += "6";
					break;
				case '3':
					imprimir1 += "5";
					break;
				case '4':
					imprimir1 += "4";
					break;
				case '5':
					imprimir1 += "3";
					break;
				case '6':
					imprimir1 += "2";
					break;
				case '7':
					imprimir1 += "1";
					break;

				}
				System.out.print(imprimir0 + "" + imprimir1 + " ");
				imprimir0 = "";
				imprimir1 = "";
			}
		}

	}

}
