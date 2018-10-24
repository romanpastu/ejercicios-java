//Román Pastushenko
//piramide hueca
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce un numero entre 3 y 30 , ambos inclusive y te hare una piramide hueca.");
		
		//Este segmento nos pedira la altura de la piramide hasta que esta se introduzca de forma correcta
		int correcto = 0;
		int altura;
		do{
			altura = S.nextInt();
			if(altura >= 3 && altura <= 30){
				correcto = 1;
			}
			if(correcto !=1){
				System.out.println("ERROR. La altura debe estar entre 3 y 30 (ambas cifras inclusive), introducela de nuevo de forma correcta.");
			}
		}while(correcto <1);
		S.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		int altura2 = altura+(altura-1);
		int auxiliar = 1;
		int auxiliar2= 1;
		int auxiliar3 = 1;
		for(int i = 0; i<altura2;i++){
			if(i <= altura2/2){
				if(i<2){
					for ( int j = 0; j<altura-(altura-auxiliar);j++){
						System.out.print("*");
					}
				}else{
					System.out.print("*");
						for(int j =0;j<i-1;j++){
							System.out.print(" ");
						}
					System.out.print("*");
				}
			}else{
				if(i==altura2 || i==altura2-1){
					for(int j = 0; j<altura-auxiliar2;j++){
						System.out.print("*");
					}
				}else{
					System.out.print("*");
					for(int j = 0;j<((altura2-altura)-auxiliar3)-1;j++){
						System.out.print(" ");
					}
					auxiliar3++;
					System.out.print("*");
				}
				auxiliar2++;
			}
			System.out.println();
			auxiliar++;
		}
	}
}
