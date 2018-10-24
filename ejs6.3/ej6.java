import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int valor = ((int)(Math.random()*100));
		
		System.out.println("Tienes que acertar el valor aleatorio, tienes 5 oportunidades");
		System.out.println("//El cual es "+valor);
		int contador = 0;
		do{
			int valorIntroducido = S.nextInt();
			if(valorIntroducido == valor){
				contador = 4;
			}
			int oportunidadadesRestantes = 5-(contador+1);
			
			if (valorIntroducido == valor){
				System.out.println("Enhorabuena, has acertado!!");
			}else{
			System.out.println("Te quedan "+oportunidadadesRestantes+" oportunidades");
			}
			contador++;
		}while(contador <5);
	}

}
