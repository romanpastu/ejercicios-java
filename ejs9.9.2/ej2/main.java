package ej2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta(0);
		Coche coche = new Coche(0);
		
		
		System.out.println("1. Anda con la bicicleta\r\n" + 
				"2. Haz el caballito con la bicicleta\r\n" + 
				"3. Anda con el coche\r\n" + 
				"4. Quema rueda con el coche\r\n" + 
				"5. Ver kilometraje de la bicicleta\r\n" + 
				"6. Ver kilometraje del coche\r\n" + 
				"7. Ver kilometraje total\r\n" + 
				"8. Salir");
		Scanner S = new Scanner(System.in);
		int n;
		do {
		n = S.nextInt();
		switch(n) {
		case 1: 
			bicicleta.recorre(1);
			break;
		case 2:
			bicicleta.caballito();
			break;
		case 3:
			coche.recorre(2);
			break;
		case 4:
			coche.quemaRueda();
			break;
		case 5:
			System.out.println(bicicleta.getKilometrosRecorridos());
			break;
		case 6:
			System.out.println(coche.getKilometrosRecorridos());
			break;
		case 7:
			System.out.println(Vehiculo.getKilometrosTotales());
			break;
		case 8:
			System.out.println("has salido");
			break;
		}
			
		
		}while(n != 8);
		
	}

}
