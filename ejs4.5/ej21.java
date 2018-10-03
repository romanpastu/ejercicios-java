import java.util.*;
public class ej21 {

	public static void main(String[] args) {
		System.out.println("Introduce las dos notas que has sacado");
		Scanner S = new Scanner(System.in);
		double nota1,nota2;
		nota1 = Double.parseDouble(S.nextLine());
		nota2 = Double.parseDouble(S.nextLine());
		String resultado = "";
		double media;
		
		media = (nota1+nota2)/2;
		double mediaFinal;
		if (media >=5){
			System.out.println("Aprobado con un: "+media);
		}else if ( media < 5 ){
			System.out.println("Cual ha sido el resultado de la recuperacion (apto/no apto)");
			resultado = S.nextLine();
			resultado.toLowerCase();

			
			if(resultado.equals("apto")){
				mediaFinal = 5;
				System.out.println("Tu nota de programacion es "+mediaFinal);
			}else if(resultado.equals("no apto")){
				mediaFinal = media;
				System.out.println("Tu nota de programacion es "+mediaFinal);
			}
			
		}
		
	}

}
