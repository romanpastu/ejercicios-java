import java.util.*;
public class ej15 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce una base");
		int base = S.nextInt();
		System.out.println("Introdue un exponente");
		int exponente = S.nextInt();
		S.close();
		for ( int i = 0; i<exponente ; i++){
			System.out.println(base+"^"+(i+1));
		}

	}

}
