import java.util.*;
public class ej23 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double baseImponible;
		int IVA;
		String tipoIva = "";
		String codPro = "";
		double ivaAplicado = 0;
		double total = 0;
		double precioConIva;
		double ivaDeducido;
		double promocion = 0;
		System.out.println("Introduce la base imponible");
		baseImponible = Double.parseDouble(S.nextLine());
		
		System.out.println("Introduce el tipo de IVA(general, reducido o superreducido)");
		tipoIva += S.nextLine();
		
		System.out.println("Introduce el codigo promocional (nopro, mitad, meno5 o 5porc)");
		codPro += S.nextLine();
		
		if (tipoIva.equals("general")) {
			ivaAplicado = 21;
		}else if (tipoIva.equals("reducido")) {
			ivaAplicado = 10;
		}else if(tipoIva.equals("superreducido")) {
			ivaAplicado = 4;
		}
		
		ivaDeducido = baseImponible*(ivaAplicado/100);
		precioConIva = baseImponible + ivaDeducido;
		
		
		if (codPro.equals("nopro")) {
			System.out.println("No se aplica promocion");
			total = precioConIva;
		}else if(codPro.equals("mitad")) {
			total = precioConIva/2;
			promocion = precioConIva/2;
		}else if(codPro.equals("meno5")) {
			total = precioConIva-5;
			promocion = 5;
		}else if(codPro.equals("5porc")) {
			total = precioConIva-(precioConIva*(5/100));
			promocion = precioConIva*(5/100);
		}
		
		
		
		System.out.println("Base imponible: "+baseImponible);
		System.out.println("IvaAplicado: ("+ivaAplicado+") "+ivaDeducido);
		System.out.println("Precio con IVA "+precioConIva);
		System.out.println("Cod Promo ("+codPro+") -"+promocion);
		System.out.println("TOTAL: "+total);
		
	}

}
