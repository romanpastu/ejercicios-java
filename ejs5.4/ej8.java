import java.util.*;
public class ej8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce un numero por teclado, y te mostrare su tabla de multiplicar");
		int numero = S.nextInt();
		System.out.println("Introduce hasta donde quieres que llegue la tabla de multiplicar");
		int stop = S.nextInt();
		for (int i = 0 ; i <=stop;i++) {
			int resultado = numero*i;
			System.out.println(numero+"*"+i+"="+resultado);
		}
	}

}
