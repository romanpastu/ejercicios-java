import java.util.*;

public class ej17 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		System.out.println("Introduce el ancho de la pecera");
		int ancho = S.nextInt();
		System.out.println("Introduce el largo de la pecera");
		int largo = S.nextInt();

		S.close();

		int filaAleatoria = (int) (Math.random() * (largo - 2) + 1);
		int columnaAleatoria = (int) ((Math.random() * (ancho - 2)) + 1);

		for (int i = 0; i < largo; i++) {
			if (i == 0 || i == largo - 1) {
				for (int j = 0; j < ancho; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int j = 1; j < ancho - 1; j++) {
					if (j == columnaAleatoria && i == filaAleatoria) {
						System.out.print("&");
					} else {
						System.out.print(" ");
					}

				}
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
