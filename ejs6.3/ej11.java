import java.util.*;
public class ej11 {

	public static void main(String[] args) {
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
		
		
		for ( int i = 0; i<20;i++){
			double decimal = 0;
			int nota = (int)(Math.random()*11);
			if ( nota != 10){
			decimal = Math.random();
			}
			double notaFinal = nota+decimal;
	
			
			if ( notaFinal >= 0 && notaFinal <5){
				System.out.printf("suspenso %.2f \n", notaFinal);
				suspenso++;
			}else if(notaFinal == 6){
				System.out.printf("bien %.2f \n", notaFinal);
				bien++;
			}else if(notaFinal >=5 && notaFinal <6){
				System.out.printf("suficiente %.2f \n", notaFinal);
				suficiente++;
			}else if(notaFinal >=7 && notaFinal < 9){
				System.out.printf("notable %.2f \n", notaFinal);
				notable++;
			}else{
				System.out.printf("sobresaliente %.2f \n", notaFinal);
				sobresaliente++;
			}
		}
		System.out.println("Hay "+suspenso+" suspensos, bien "+bien+", suficiente "+suficiente+", notable "+notable+ ", sobresaliente "+sobresaliente);
	}

}
