import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero en binario y te lo convertire a decimal");
		Scanner S = new Scanner(System.in);
		int numero = S.nextInt();
		S.close();
		int total = 0;
		int j = 0;

		for (int i = funciones1a14.digitos(numero) - 1; i >= 0; i--) {

			if (funciones1a14.digitoN(numero, i) == 1) {
				total += funciones1a14.potencia(2, j);
			}
			j++;

		}

		System.out.println("El numero binario: " + numero + " equivale a: " + total + " en decimal");
	}

}
