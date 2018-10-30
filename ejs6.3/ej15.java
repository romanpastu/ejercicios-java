import java.util.*;
public class ej15 {

	public static void main(String[] args) {
		int longitud ;
		int contador = 0;
	do{
		longitud = (int)(Math.random()*29);
		if(longitud >= 4 && longitud % 4 == 0){
			contador = 1;
		}
	}while(contador == 0);
		
	for (int i = 1; i<= longitud; i++){
		int nota = (int)(Math.random()*7);
		String print = "";
		switch(nota){
		case 0:
			print ="do";
			break;
		case 1:
			print= "re";
			break;
		case 2:
			print="mi";
			break;
		case 3:
			print="fa";
			break;
		case 4:
			print = "sol";
			break;
		case 5:
			print = "la";
			break;
		case 6:
			print = "si";
			break;			
		}
		
		System.out.print(print+" ");
		if(i%4 == 0){
			System.out.print("| ");
		}
	}
	System.out.print("|");

	}

}
