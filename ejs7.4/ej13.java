import java.util.*;

public class ej13 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[] numero = new int[100];
		int minimo = 0;
		int maximo = 0;
		int opcion1 = 0;
		int opcion2 = 0;
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 501);
			if (i == 0) {
				minimo = numero[i];
				maximo = numero[i];
			} else if (i != 0) {
				if (numero[i] > maximo) {
					maximo = numero[i];
				}
				if (numero[i] < minimo) {
					minimo = numero[i];
				}
			}
		}

		System.out.println("¿Que quieres destacar( 1- minimo , 2- maximo)?");
		int opcion = S.nextInt();
		S.close();
		if (opcion == 1) {
			opcion1++;
		} else if (opcion == 2) {
			opcion2++;
		}

		if (opcion1 == 1) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] == minimo) {
					System.out.print("**" + numero[i] + "** ");

				} else {
					System.out.print(numero[i] + " ");
				}
			}
		} else if (opcion2 == 1) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] == maximo) {
					System.out.print("**" + numero[i] + "** ");
				} else {
					System.out.print(numero[i] + " ");
				}
			}
		}

		System.out.println();

	}

}
