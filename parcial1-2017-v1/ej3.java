/*Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a
los últimos acontecimientos que han tenido lugar en Cataluña, han recibido muchos pedidos del cartel
que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre los
números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior
de los cincos también es siempre igual. La parte inferior del 5 sí que varía en función de la altura. */
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduzca la atura");
		int altura = S.nextInt();
		System.out.println("Introduzca el numero de espacios entre los numeros (1 como minimo)");
		int espacios = S.nextInt();
		S.close();
		for (int i = 0; i<altura;i++) {
			System.out.print("*");
			
			for(int j = 0; j<espacios;j++) {
				System.out.print(" ");
			}
			
			if(i == 0 || i == 2 || i == altura-1) {
				System.out.print("****");
				for(int j = 0; j<espacios;j++) {
					System.out.print(" ");
				}
				System.out.print("****");
			}else if(i == 1) {
				System.out.print("*   ");
				for(int j = 0; j<espacios;j++) {
					System.out.print(" ");
				}
				System.out.print("*   ");
			}else if(i != 1 && i != 0 && i != 2 && i != altura-1) {
				System.out.print("   *");
				for(int j = 0; j<espacios;j++) {
					System.out.print(" ");
				}
				System.out.print("   *");
			}
			
			
			
			System.out.println();
		}
	}

}
