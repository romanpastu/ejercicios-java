package ej7;
import java.util.*;

public class mainZona {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Zona zona = null;
		Zona zona0 = new Zona(100);
		Zona zona1 = new Zona(75);
		Zona zona2 = new Zona(32);
		
		System.out.println("Elige una zona [0,1,2]");
		int numeroZona = S.nextInt();
		
		if(numeroZona == 0) {
			zona = zona0;
		}else if(numeroZona == 1) {
			zona = zona1;
		}else if(numeroZona == 2){
			zona = zona2;
		}else {
			System.out.println("Esa zona no existe");
		}
		
		int n;
		do {
			System.out.println("Elige una opcion");
			System.out.println("1. Mostrar numero de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			n = S.nextInt();
			
			
			
			if(n == 1) {
				int entradasLibres = zona.getEntradasPorVender();
				System.out.println("Quedan "+entradasLibres+" entradas libres");
			}else if(n==2) {
				System.out.println("Introduce cuantas entradas quieres");
				int numeroEntradas = S.nextInt();
				zona.vender(numeroEntradas);
			}else {
				System.out.println("Has salido del programa");
			}
		}while(n != 3);
		
		
		
		
		
	}

}
