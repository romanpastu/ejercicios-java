import java.util.*;

public class ej7 {

	public static void main(String[] args) {

		int combinacion = 2882;
		int input;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce la combinacion");
		
		
		for(int i=0;i<4;i++){
			input = S.nextInt();
			if(input == combinacion){
				System.out.println("Enhorabuena has abierto la caja");
				i = 3;
			}else if(input != combinacion){
				int intento = i+1;
				System.out.println("intento "+intento);
				System.out.println("Lo siento esto no es la comb");
				
			}
		}
	}

}
