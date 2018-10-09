import java.util.*;
public class ej13 {

	public static void main(String[] args) {
		System.out.println("Introduce 10 numeros, y te dire cuantos son negativos y cuantos son positivos");
		Scanner S = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		for ( int i = 0; i< 10;i++){
			double valor = S.nextInt();
			if (valor >=0){
				positivos++;
			}else if ( valor <= 0){
				negativos++;
			}
			
		}
		S.close();
		System.out.println("Positivos: "+positivos);
		System.out.println("Negativos: "+negativos);

	}

}
