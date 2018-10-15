import java.util.*;
public class ej27 {

	public static void main(String[] args) {
		
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int contador = 0;
		int sumatorio = 0;
		for (int i = 0; i<=n; i+=3) {
			if(i%3 == 0 && i != 0) {
				System.out.println(i);
				contador++;
				sumatorio += i;
			}
		}
		System.out.println("Cantidad de numeros que hay: "+contador);
		System.out.println("sumatorio: "+sumatorio);
	}

}
