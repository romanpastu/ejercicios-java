/*Una empresa de carteler�a nos ha encargado un programa para realizar uno de sus dise�os. Debido a
los �ltimos acontecimientos que han tenido lugar en Catalu�a, han recibido muchos pedidos del cartel
que muestra el n�mero 155. Realiza un programa que pinte el n�mero 155 mediante asteriscos. Al
usuario se le pedir�n dos datos, la altura del cartel y el n�mero de espacios que habr� entre los
n�meros. La altura m�nima es 5. La anchura de los n�meros siempre es la misma. La parte superior
de los cincos tambi�n es siempre igual. La parte inferior del 5 s� que var�a en funci�n de la altura. */
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
