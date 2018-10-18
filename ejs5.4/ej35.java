import java.util.*;
public class ej35 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura = S.nextInt();
		int fila = altura;
		int filaAuxiliar = fila;
		int restadorAuxiliar = 4;
		int sumadorAuxiliar = 1;
		S.close();
		if (altura % 2 != 0 && altura >= 3){
			
		for (int i = 0; i< altura; i++){

			if(fila > filaAuxiliar/2){
			for(int j= 0; j< altura-fila; j++){
					System.out.print(" ");
			}
			
			}else{
				for(int j = 0; j< fila-1; j++){ //fila = 6 j=0 //fila ultima = 1 <---- esto es para 13
					if(fila>=1){
					System.out.print(" ");
					}
				}
				
			}
			
			System.out.print("*");
			
			if(fila > filaAuxiliar/2){
			
						
				if(fila == filaAuxiliar){
					
					for (int j = 0; j<filaAuxiliar-2; j++){
						System.out.print(" ");
					}
					System.out.print("*");
					
				}else{
					if(fila != (filaAuxiliar/2)+1){
					for ( int j = 0 ; j<filaAuxiliar-restadorAuxiliar;j++){
						System.out.print(" ");
						if(j == filaAuxiliar-restadorAuxiliar-1){
							restadorAuxiliar+=2;
						}
					}
					System.out.print("*");
					}
				}
				
			}
			
		if(fila <= filaAuxiliar/2){	
		if( fila == 1){
			
			for (int j = 0; j<filaAuxiliar-2; j++){
				System.out.print(" ");
			}
			System.out.print("*");	
		}else{
			for(int j = 0; j< sumadorAuxiliar; j++){
				System.out.print(" ");										//TODO 6 fila
				
			}
			System.out.print("*");
			sumadorAuxiliar+=2;
		}
		
	}
			
			
			
			System.out.println();
			fila--;
		}	
		
		
		}else{
			System.out.println("Error, la atura es incorrecta, debe ser impar, mayor o igual que 3");
		}
	}

}
