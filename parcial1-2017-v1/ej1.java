/*Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).*/
import java.util.Scanner;


public class ej1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		//Un numero es primo, si SOLO es divisible entre 1 y si mismo. Osea si es divisible entre un numero
		//distinto de =! 1 y de !=si mismo . NO PRIMO
		int esPrimo = 0;
		int contadorNumeros = 0;
		double sumadorNumeros = 0;
		double maximo = 0;
		double minimo = 0;
		do{
			esPrimo = 0;
			
			double numero = S.nextInt();
			for (int i = 1; i<=numero;i++){
				if (numero%i == 0){
					esPrimo++;
				}
			}
			contadorNumeros++;
			if(esPrimo != 2){
				sumadorNumeros +=numero;
				if(numero > maximo){
					maximo = numero;
				}
				
				if(contadorNumeros == 1){
					minimo = numero;
				}
				if(contadorNumeros>1 && numero < minimo){
					minimo = numero;
				}
			}
		}while(esPrimo != 2);
		contadorNumeros = contadorNumeros-1;
		double media = sumadorNumeros/contadorNumeros;
		System.out.println("Ha introducido "+contadorNumeros+" numeros no primos");
		System.out.println("Media: "+media);
		System.out.println("Maximo: "+maximo);
		System.out.println("Minimo: "+minimo);

	}

}
