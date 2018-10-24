/*Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
media”.*/
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
	System.out.println("Introduce 10 numeros por teclado,  y te hare la media de la suma de los primos");
	Scanner S = new Scanner(System.in);
	int contador = 0;
	int contadorPrimo = 0;
	double sumaPrimos = 0;
	int cantidadPrimos = 0;
	do{
		contadorPrimo = 0;
		int numero = S.nextInt();
		contador++;
		for ( int i =1;i<=numero;i++){
			if (numero%i==0){
				contadorPrimo++;
			}
		}
		if(contadorPrimo == 2){
			sumaPrimos += numero;
			cantidadPrimos++;
		}
		
	}while(contador <10);
	
	double media = sumaPrimos/cantidadPrimos;
	if (cantidadPrimos == 0){
		System.out.println("No has introducido ningun primo, no se puede calcular la media" );
	}else{
	System.out.println("La media de primos es "+media);
	}
	}

}
