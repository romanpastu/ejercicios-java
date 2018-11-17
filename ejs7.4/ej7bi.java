
//Este programa se basa en "Busca el tesoro", hay 6 intentos para acertar la posicion del tesoro. Y se realizará la pregunta del tamaño del tablero que queremos tener.
import java.util.*;

public class ej7bi {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce la altura y la anchura del tablero");
		int altura = S.nextInt(); // Altura
		int anchura = S.nextInt(); // Anchura
		// tablero
		int[][] tablero = new int[altura][anchura];

		// Posicion del tesoro
		int tesoroI = (int) (Math.random() * (anchura));
		int tesoroJ = (int) (Math.random() * (altura));

		System.out.println("Posicion 'oculta' del tesoro [" + tesoroI + "," + tesoroJ + "] Bomba(1) Hueco(2) Tesoro(3)");
		// Ahora rellenamos el mapa de bombas y huecos
		// Bombas == 1
		// Huecos == 2
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < anchura; j++) {
				tablero[i][j] = (int) (Math.random() * 2) + 1;
			}
		}
		// Esto es para asignar la posicion del tesoro dentro del mapa ya relleno por
		// bombas y huecos, en este caso se sobreescribe una posicion aleatoria generada
		// anteriormente
		// 3 == tesoro
		tablero[tesoroI][tesoroJ] = 3;
		// Vamos a imprimir el tablero
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < anchura; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		// Posiciones que van a ser introducidas por el jugador
		System.out.println();
		int posI;
		int posJ;
		for (int x = 0; x < 6; x++) {
			System.out.println("Intento numero " + x + " Te quedan " + (6 - x) + " intentos");
			System.out.println("Introduce una fila");
			posI = S.nextInt();
			System.out.println("Introduce una columna");
			posJ = S.nextInt();
			// En caso de encontrar el tesoro
			if (tablero[posI][posJ] == 3) {
				System.out.println("Enhorabuena has encontrado el tesoro");
				x = 7;
			}
			// En caso de pisar una bomba
			else if (tablero[posI][posJ] == 1) {
				System.out.println("Has pisado una bomba");
				x = 7;
			} else {
				// Aqui va el codigo para saber si alguna de las casillas cercanas (a 1 hueco de
				// proximidad) tiene una bomba
				int comprobarBomba = 0;
				// En el caso de no tener esquinas/cortes
				if (posI != 0 && posI != altura - 1 && posJ != 0 && posJ != anchura - 1) {
					for (int i = posI - 1; i <= posI + 1; i++) {
						if (tablero[i][posJ - 1] == 1) {
							comprobarBomba++;
						}
					}
					for (int i = posI - 1; i <= posI + 1; i++) {
						if (tablero[i][posJ + 1] == 1) {
							comprobarBomba++;
						}
					}
					if (tablero[posI + 1][posJ] == 1 || tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (comprobarBomba > 0) {
						System.out.println("Cuidado! Hay una mina cerca");
					}

				}
				// En el caso de estar en esquinas
				comprobarBomba = 0;
				// Esquina superior izq
				if (posI == 0 && posJ == 0) {
					if (tablero[posI + 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
				}
				// Esquina superior derecha
				if (posI == 0 && posJ == anchura - 1) {
					if (tablero[posI + 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
				}
				// Esquina inferior izquiera
				if (posI == altura - 1 && posJ == 0) {
					if (tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
				}
				// Esquina inferior derecha
				if (posI == altura - 1 && posJ == anchura - 1) {
					if (tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
				}
				// Impresion para casos de esquinas
				if (comprobarBomba > 0) {
					System.out.println("Cuidado! Hay una mina cerca");
				}

				comprobarBomba = 0;
				// En el caso de estar en bordes, excluyendo esquinas
				
				// Borde superior
				if (posI == 0 && posJ != 0 && posJ != anchura - 1) {
					if (tablero[posI][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
				}
				// Borde inferior
				if (posI == altura - 1 && posJ != 0 && posJ != anchura - 1) {
					if (tablero[posI][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
				}
				// Borde lateral izquierdo
				if (posJ == 0 && posI != 0 && posI != altura - 1) {
					if (tablero[posI + 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ + 1] == 1) {
						comprobarBomba++;
					}
				}
				// Borde lateral derecho
				if (posJ == anchura - 1 && posI != 0 && posI != altura - 1) {
					if (tablero[posI + 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI - 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
					if (tablero[posI + 1][posJ - 1] == 1) {
						comprobarBomba++;
					}
				}

				// Impresion caso bordes
				if (comprobarBomba > 0) {
					System.out.println("Cuidado! Hay una mina cerca");
				}
			}

		}
		S.close();
	}

}
