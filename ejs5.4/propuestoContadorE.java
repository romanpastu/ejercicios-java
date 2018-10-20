//Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"
import java.util.*;
public class propuestoContadorE {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i<=9;i++) {
			
			if (a==3) {
				System.out.print("E-");
			}else {
				System.out.print(a+"-");
			}
			
			if (b==3) {
				System.out.print("E-");
			}else {
				System.out.print(b+"-");
			}
			
			if (i == 3) {
				System.out.print("E");
			}else {
				System.out.print(i);
			}
			
			System.out.println();
			
			if ( i == 9) {
				i=-1;
				b++;
			}
			if (b== 10 ) {
				b=0;
				i=-1;
				a++;
			}
			if(a == 10) {
				i = 10;
			}			
			
		}
		
		

	}

}
