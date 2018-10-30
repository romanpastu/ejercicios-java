import java.util.*;

public class ej22 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce la longitud de la serpiente en caracteres contando la cabeza");
		int longitud = S.nextInt();
		S.close();

		int contador = 0;
		for (int i = 0; i < longitud; i++) {

			int variacion = (int) (Math.random() * 3) + 1;
			int desplazamiento = 0;
			if (contador == 1) {
				variacion = 2;
				contador = 0;
			}

			switch (variacion) {
			case 1:
				desplazamiento = -1;
				contador = 1;
				break;
			case 2:
				desplazamiento = 0;
				break;
			case 3:
				desplazamiento = 1;
				contador = 1;
				break;
			}

			if (i == 0) {
				for (int j = 0; j < 12; j++) {
					System.out.print(" ");
				}
				System.out.print("@");
			} else {
				for (int j = 0; j < 12 + desplazamiento; j++) {
					System.out.print(" ");
				}

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
