import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int []numero = new int[15];
		System.out.println(".length "+numero.length);
		for (int i = 0 ; i<15; i++){
			numero[i] = S.nextInt();
		}
		S.close();
		System.out.println("Array original");
		for(int i = 0; i< 15; i++){
			System.out.print(numero[i]+" ");
		}
		System.out.println();
		
		int auxiliar = numero[numero.length-1];
		
		for ( int i = 13 ; i>=0;i--){
			numero[i+1] = numero[i];
		}
		numero[0] = auxiliar;
		
		for(int i = 0 ; i<numero.length;i++){
			System.out.print(numero[i]+" ");
		}

	}

}
