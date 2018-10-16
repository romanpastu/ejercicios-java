import java.util.*;
public class ej28 {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce un numero y te sacare el factorial");
		int numero = S.nextInt();
		int multiplicatorio = 0;
		for (int i = 1; i<=numero;i++){
			if(i == 1){
				multiplicatorio = 1;
			}else{
				multiplicatorio = multiplicatorio*i;
			}
		}
		System.out.println(multiplicatorio);
	}

}
