import java.util.*;

public class ej20 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce la capacidad de la cuba");
		int capacidad = S.nextInt();
		S.close();
		int litrosAgua = (int) ((Math.random() * (capacidad + 1)));

		capacidad += 2;

		for (int i = 0; i < capacidad; i++) {
			if (i == capacidad - 1) {
				for (int j = 0; j < capacidad; j++) {
					System.out.print("*");
				}
			} else if (i != 0) {
				System.out.print("*");

				if (i >= (capacidad - litrosAgua) - 1) {
					for (int j = 0; j < capacidad - 2; j++) {
						System.out.print("=");
					}
				} else {
					for (int j = 0; j < capacidad - 2; j++) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}

			System.out.println();
		}
		capacidad -= 2;
		System.out.println("La cuba tiene una capacidad de: " + capacidad + " y contiene " + litrosAgua + " de agua");
	}

}
