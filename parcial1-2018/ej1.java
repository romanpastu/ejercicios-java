//Román Pastushenko
//binarios
import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 9999 y te lo convertire a binario");
		//Este segmento sirve para controlar que los numeros introducidos sean correctos
		int correcto = 0;
		int numero;
		do{
			numero = S.nextInt();
			if(numero >= 0 && numero <= 9999){
				correcto = 1;
			}
		}while(correcto <1);
		S.close();
		/////////////////////////////////////////////////////////////////////////////////
		
		int cifraBinaria;
		int multiplicador = 1;
		int sumatorioCifras = 0;
		
		do{
			cifraBinaria = numero%2;
			numero = numero/2;
			
			if (cifraBinaria == 1){
				cifraBinaria = cifraBinaria * multiplicador;
				sumatorioCifras+=cifraBinaria;
				multiplicador = multiplicador*10;
			}else{
				multiplicador = multiplicador*10;
			}
		}while(numero/2 != 0);
		
		sumatorioCifras = sumatorioCifras + (1*multiplicador);
		
		System.out.println("El numero que has introducido pasado a binario es: "+sumatorioCifras);	
	}

}
