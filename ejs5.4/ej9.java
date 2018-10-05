import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce un numero y te dire su longitud");
		int numero = S.nextInt();
		int contador = 0;
		
		for (int i = numero ;i > 0 ;i = i/10) {
			
			contador++;
			
		}
		System.out.println("La longitud del numero "+numero+" es de "+contador);
	}

}
