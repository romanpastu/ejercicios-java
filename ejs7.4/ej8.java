import java.util.*;

public class ej8 {

	public static void main(String[] args) {
		int[] temperaturas = new int[12];
		System.out.println("Introduce una lista de temperaturas que han hecho durante el año (12)");
		Scanner S = new Scanner(System.in);

		for (int i = 0; i < 12; i++) {
			temperaturas[i] = S.nextInt();
		}
		S.close();
		for (int i = 0; i < 12; i++) {
			int meses = i;
			String mesTxt = "";

			switch (meses) {
			case 0:
				mesTxt = "enero";
				break;
			case 1:
				mesTxt = "febrero";
				break;
			case 2:
				mesTxt = "marzo";
				break;
			case 3:
				mesTxt = "abril";
				break;
			case 4:
				mesTxt = "mayo";
				break;
			case 5:
				mesTxt = "junio";
				break;
			case 6:
				mesTxt = "julio";
				break;
			case 7:
				mesTxt = "agosto";
				break;
			case 8:
				mesTxt = "septiembre";
				break;
			case 9:
				mesTxt = "octubre";
				break;
			case 10:
				mesTxt = "noviembre";
				break;
			case 11:
				mesTxt = "diciembre";
				break;
			}
			
			System.out.print(mesTxt+": "+temperaturas[i]+" grados ");
			for ( int j = 0; j<temperaturas[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
