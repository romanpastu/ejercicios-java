import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		System.out.println("Mete 10 numeros y te dire el maximo y el minimo");
		Scanner S = new Scanner(System.in);
		int[] numeros = new int[10];
		for(int i = 0; i<10; i++){
			numeros[i] = S.nextInt();
		}
		S.close();
		Arrays.sort(numeros);
		
		System.out.println("Menor "+numeros[0]+" Mayor "+numeros[numeros.length-1]);

		

	}

}
