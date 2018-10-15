import java.util.*;
public class ej21 {

	public static void main(String[] args) {
		System.out.println("Introduce numeros. Para parar introduce uno negativo");
		Scanner S = new Scanner(System.in);
		int valor = 0;
		int contadorNumeros = 0;
		int sumatorioImpares = 0;
		int contadorImpares = 0;
		int parMayor = 0;
		do {
			valor = S.nextInt();
			
			if(valor >=0) {
			contadorNumeros++;
				
				if(valor % 2 != 0) {
					contadorImpares++;
					sumatorioImpares += valor;
				}
				if(valor % 2 == 0 && valor > parMayor) {
					parMayor = valor;
				}
			
			}
			
		}while(valor>=0);
		double mediaImpares = sumatorioImpares / contadorImpares;
		
		System.out.println("Has introducido "+contadorNumeros+" numeros");
		System.out.println("La media de los impares es "+mediaImpares);
		
		if(parMayor > 0) {
		System.out.println("El mayor de los pares es "+parMayor);
		}else {
			System.out.println("No hay par mayor");
		}
	}

}
