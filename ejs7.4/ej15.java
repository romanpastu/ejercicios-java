import java.util.*;

public class ej15 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		// Se hace el print del numero de mesas con ocupacion aleatoria
		int[] mesas = new int[10];
		System.out.print("Mesa     ");
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %3d ", i);
		}
		System.out.println();
		System.out.print("Ocupacion");
		for (int i = 0; i < 10; i++) {
			mesas[i] = (int) (Math.random() * 5);
			System.out.printf(" %3d ", mesas[i]);
		}
		System.out.println();

		// Se Introducen los clientes que hay
		System.out.println("¿Cuantos clientes sois?(-1 para salir)");

		int numeroClientes = 0;

		while (numeroClientes != -1) { // Por algun motivo es lo que hace que
										// prosiga el loop

			do {

				if (numeroClientes != -1) {
					numeroClientes = S.nextInt();
					if (numeroClientes > 4) {
						System.out.println("Lo siento no admitimos grupos de " + numeroClientes
								+ " haga grupos de 4 personas como maximo e intentelo de nuevo");
					}
				} else {
					System.out.println("Has salido del programa");
					break;
				}

			} while (numeroClientes <= 0 || numeroClientes > 4);

			// Esta es la situacion de si hay alguna mesa libre, con 0
			// comensales
			int mesasVacias = 0;
			if (numeroClientes != -1) {
				if (mesasVacias == 0) {
					for (int i = 0; i < mesas.length; i++) {

						if (mesas[i] == 0) {
							mesas[i] = numeroClientes;
							System.out.println("Porfavor sientese en la mesa " + (i + 1));
							i = mesas.length;
						}
						if (i == mesas.length - 1) {
							mesasVacias = 1;
						}

					}
				}
				// No quedan mesas vacias, hay que seguir aqui
				if (mesasVacias != 0) {
					System.out.println("No quedan mesas vacias");
					for (int i = 0; i < mesas.length; i++) {
						// Este es el caso en el que quepan en alguna mesa
						if (4 - mesas[i] >= numeroClientes) {
							mesas[i] += numeroClientes;
							System.out.println();
							System.out.println("Porfavor sientese en la mesa " + (i + 1) + " para compartir sitio");
							i = mesas.length;
						}

					}

				}
				// Esto se imprimira en cada pasada, los datos de las mesas
				System.out.print("Mesa     ");
				for (int i = 1; i <= 10; i++) {
					System.out.printf(" %3d ", i);
				}
				System.out.println();
				System.out.print("Ocupacion");
				for (int i = 0; i < 10; i++) {
					System.out.printf(" %3d ", mesas[i]);
				}
				System.out.println();
			}
		}

	}
}
