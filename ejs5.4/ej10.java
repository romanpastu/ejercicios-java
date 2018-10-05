import java.util.*;
public class ej10 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double numero = 0;
		double contador = 0;
		double input;
		double media;
		
		System.out.println("Introduce numeros positivos, y te dare la media. Cuando desees terminar introduce un numero negativo");
		
		do {
			input = S.nextDouble();
			if(input >= 0) {
			numero += input;
			contador++;
			}
		}while(input >= 0);
		
		media = numero/contador;
		
		System.out.println("La media es de"+media);
	}

}
