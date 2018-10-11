import java.util.*;
public class ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce el relleno de la piramide");
		String simbolo = S.nextLine();
		System.out.println("Introduce la altura de la piramide");
		int altura = S.nextInt();
		int anchura = 0;
		
		for ( int j = 0; j<altura;j++){
			for(int i= 0; i<(altura-anchura)-1;i++){
				System.out.print(" ");
			}
			System.out.print(simbolo);
			for ( int i = 0; i<anchura;i++){
				
				if (j == altura-1){
					System.out.print(simbolo);
				}else{
					System.out.print(" ");
				}
			}
			
			for ( int i = 0;i<=anchura-2;i++){
				if (j == altura-1){
					System.out.print(simbolo);
				}
				else{
					System.out.print(" ");
				}
				
			}
			if(j>0){
				System.out.print(simbolo);
			}
			System.out.println();
			anchura++;
			}	
	}

}
