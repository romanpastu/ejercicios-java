import java.util.*;

public class ej7 {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		Scanner S = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 21);
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("Introduce dos valores, y te cambiare el segundo valor por el primero en el listado que has introducido");
		int replacer = S.nextInt();
		int toReplace = S.nextInt();
		S.close();
		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == toReplace) {
				System.out.print("'" + replacer + "' ");
			} else {
				System.out.print(numeros[i] + " ");
			}
		}

	}

}
