/*La tienda online BanderaDeEspa�a.es vende banderas personalizadas de la m�xima calidad y nos
ha pedido hacer un configurador que calcule el precio seg�n el alto y el ancho. El precio base de una
bandera es de un c�ntimo de euro el cent�metro cuadrado. Si la queremos con un escudo bordado, el
precio se incrementa en 2.50 � independientemente del tama�o. Los gastos de env�o son 3.25 �. El
IVA ya est� incluido en todas las tarifas.
*/
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		//1 cent por cm2
		//escudo borado +2.5�
		//3.25� envio
		//Iva incluido
		Scanner S= new Scanner(System.in);
		double anadidoEscudo;
		double gastosEnvio = 3.5;
		
		System.out.printf("Introduzco la altura de la bandera en cm: ");
		int altura = S.nextInt();
		
		System.out.printf("\nIntroduzca la anchura: ");
		int anchura = S.nextInt();
		
		System.out.printf("\n�Quiere escudo bordado? (s/n)");
		String escudo = S.next();
		
		int superficie = altura*anchura;
		double precioBandera = superficie*0.01;
				
		System.out.printf("\nGracias. Aqu� tiene el desglose de su compra.");
		System.out.printf("\nBandera de %d cm2: %10.2f �",superficie,precioBandera);
		
		if (escudo.equals("n")) {
			anadidoEscudo = 0;
			System.out.printf("\nSin escudo: %18.2f �",anadidoEscudo);
		}else {
			anadidoEscudo = 2.5;
			System.out.printf("\nCon escudo: %18.2f �",anadidoEscudo);
		}
		
		System.out.printf("\nGastos de env�o: %13.2f �", gastosEnvio);
		double total = precioBandera+anadidoEscudo+gastosEnvio;
		System.out.printf("\nTotal: %23.2f �", total);
		
		
		
	}

}
