import java.util.*;
public class ej12 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce el numero N que desees, y te dare los n primeros numeros de la sucesion de fibonacci");
		int n = S.nextInt();
		S.close();
		int[] myArray = new int[n];
		System.out.println("La sucesion de fibonnaci para "+n+" numeros es:");
		myArray[0] = 0;
		myArray[1] = 1;
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		for ( int i = 2 ; i <n; i++){
			myArray[i] = myArray[i-2]+myArray[i-1];
			System.out.println(myArray[i]);
		}
	}

}
