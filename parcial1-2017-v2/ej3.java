/*Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5*/
import java.util.*;
public class ej3 {
	public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	System.out.println("Introduce la longitud por lado");
	int longitud = S.nextInt();
	
	for(int i = 0; i<longitud;i++) {
		
		if (i == 0 || i == 1 || i == longitud-1 || i == longitud-2) {
			for (int j = 0; j<longitud;j++) {
				System.out.print("* ");
			}
		}else {
			System.out.print("* * ");
			for(int j = 0; j<longitud-4;j++) {
				System.out.print("  ");
			}
			System.out.print("* *");
		}
		
		
		
		System.out.println();
	}
	
	}
}
