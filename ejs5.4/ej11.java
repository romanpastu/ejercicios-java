import java.util.*;
public class ej11 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero, y te mostrare los 5 primeros numeros");
		Scanner S = new Scanner(System.in);
		double numero = S.nextDouble();
		S.close();
		for (double i = numero; i<numero+5; i++) {
			double num1 = Math.pow(i, 2);
			double num2 = Math.pow(i, 3);
			
			System.out.printf("|Numero: %.2f |Cuadrado: %.2f |Cubo: %.2f|\n", i,num1,num2);
		}

	}

}
