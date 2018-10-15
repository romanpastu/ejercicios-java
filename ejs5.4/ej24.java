import java.util.*;
public class ej24 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int altura = S.nextInt();
		int anchura = 0;
		int numero = 1;
		for(int j = 0; j<altura;j++) {
			for(int i = 0; i<(altura-anchura)-1;i++) {
				System.out.print(" ");
			}
			
			for(int i =0;i<anchura+1;i++) {
				System.out.print(numero++);
				
				
			}
			numero = numero-2;
			for (int i = 0; i<=anchura-1;i++) {
				System.out.print(numero--);
			}
			
			System.out.println();
			anchura++;
			numero = 1;
		}

	}

}
