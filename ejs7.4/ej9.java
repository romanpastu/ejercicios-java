import java.util.*;

public class ej9 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[] numeros = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = S.nextInt();
		}
		
		for(int i = 0 ; i<numeros.length;i++){
			if( numeros[i]%2== 0){
				System.out.println(numeros[i]+" par");
			}else{
				System.out.println(numeros[i]+" impar");
			}
		}
	}

}
