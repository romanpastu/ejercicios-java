/*Los números “donut” son los que tienen un 0 justo en la posición central, en caso de que el número de
cifras sea impar; o bien, los que tienen dos ceros en las posiciones centrales, en caso de que el
número de dígitos sea par. El resto de dígitos pueden ser ceros o no, no se tienen en cuenta. Por
ejemplo, los números 23037, 1008, 9060044, 0 y 8000 son “números donut”. Sin embargo 6758, 8903,
4200, 1234 y 7 no lo son. Realiza un programa que diga si un número introducido por teclado es un
“número donut” o no.*/
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		Scanner S  = new Scanner(System.in);
		
		int numero = S.nextInt();
		int contador = 0;
		int divisor = 1;
		int par = 0;
		int impar = 0;
		//Contamos el numero de digitos
		do{
			contador++;
			divisor= divisor*10;
		}while(numero/divisor != 0);
		
		int numeroDigitos = contador;
		
		//Averigüamos si son digitos pares o impares
		if (numeroDigitos%2==0) {
			par++;
			System.out.println("es par en digitos");
		}else {
			impar++;
			System.out.println("es impar en digitos");
		}
		//IMPARES
		//obtenemos sobre cuanto se tiene que dividir para aislar la ultima cifra del medio
		
		if (impar == 1 && par == 0) {
			int indice = numeroDigitos / 2;
			int multiplicando = 1;
			for (int i =1;i<=indice;i++) {
				multiplicando=multiplicando*10;
			}
			System.out.println(multiplicando);
			
			//aislamos la ultima cifra dividiendo el numero, entre el divisor que hemos averiguado
			int imparBusqueda = numero/multiplicando;
			System.out.println(imparBusqueda);
			//averigüamos si en el caso impar es donut o no
			if(imparBusqueda%10==0) {
				System.out.println("El numero: "+numero+" de digitos impares es donut");
			}else {
				System.out.println("El numero: "+numero+" de digitos impares no es donut");
			}
		}
		//PARES
		//obtenemos sobre cuanto se tiene que dividir para aislar las 2 ultimas cifras del medio
		if(impar == 0 && par == 1) {
			int indice = numeroDigitos / 2;
			int multiplicando = 1;
			for (int i =1;i<=indice;i++) {
				multiplicando=multiplicando*10;
			}
			//Tanto multiplicando como multiplicando2 aislan las dos ultimas cifras, ya que al ser par consideraremos dos
			multiplicando = multiplicando/10;
			System.out.println(multiplicando);
			int multiplicando2=multiplicando*10;
			System.out.println(multiplicando2);
			//finalmente con imparbusqueda obtenemos la cifra aislada
			int imparBusqueda = numero/multiplicando;
			int imparBusqueda2 = numero/multiplicando2;
			//averigüamos si en el caso par es donut o no
			 if(imparBusqueda%10 == 0 && imparBusqueda2%10 == 0) {
				 System.out.println("El numero: "+numero+" de digitos pares es donut");
			 }else {
					System.out.println("El numero: "+numero+" de digitos pares no es donut");
			}
			
		}
		
		
	}
		
	
	

}
