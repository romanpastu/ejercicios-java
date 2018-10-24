//Román Pastushenko
//banco
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		double montanteInicial = 0;
		double rentabilidadMensual = 0;
		double dineroFinal = 0;
		
		//Se pide al usuario introducir los datos necesarios
		System.out.println("Introduce el montante inicial");
		montanteInicial = S.nextDouble();
		
		System.out.println("Introduce la rentabilidad porcentual (%) mensual deseada");
		rentabilidadMensual = S.nextDouble();
		rentabilidadMensual = rentabilidadMensual/100;
		
		System.out.println("Introduce el dinero que quieres alcanzar, y te dire cuanto vas a tardar (en meses)");
		dineroFinal = S.nextDouble();
		
		S.close();
		
		//Se procesan los datos y se obtiene el resultado
		double dineroAcumulado=montanteInicial;
		int contador = 0;
		do{
			dineroAcumulado = dineroAcumulado + (dineroAcumulado*rentabilidadMensual);
			contador++;
		}while(dineroAcumulado < dineroFinal);
		
		System.out.println("La cantidad deseada a alcanzar se alcanza en "+contador+" meses (Considerando que el interes es compuesto)");
		
	}

}
