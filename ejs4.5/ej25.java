import java.util.*;
public class ej25 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		double altura;
		double anchura;
		String condBord = "";
		double area;
		double precioArea;
		double addEscudo = 0;
		double gastosDeEnvio = 3.25;
		double total;
		System.out.println("Introduzca la altura de la bandera en cm: ");
		altura = Double.parseDouble(S.nextLine());
		System.out.println("Ahora introduzca la anchura: ");
		anchura = Double.parseDouble(S.nextLine());
		System.out.println("¿Quiere escudo bordado? (s/n)");
		condBord += S.nextLine();
		
		area = altura*anchura;
		precioArea = 0.01*area; 
				
		System.out.println("Gracias. Aquí tiene el desgloce de su compra");
		
		System.out.println("Bandera de "+(int)area +" cm2: "+precioArea+"€");
		
		if (condBord.equals("s")) {
			addEscudo = 2.5;
			System.out.println("Con escudo "+addEscudo+"€");
		}else if(condBord.equals("n")) {
			addEscudo = 0;
			System.out.println("Sin escudo "+addEscudo+"€");
		}
		
		System.out.println("Gastos de envio: "+gastosDeEnvio+"€");
		
		total = precioArea+addEscudo+gastosDeEnvio;
		System.out.println("Total: "+total);
	}

}
