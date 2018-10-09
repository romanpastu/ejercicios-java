import java.util.*;
public class ej14 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce primero una base");
		double base = S.nextDouble();
		System.out.println("Introduce un exponente (positivo)");
		double exponente = S.nextDouble();
		double total = base;
		S.close();
	
		for ( double i = 0; i< exponente ; i++){
			if (i==0){
				System.out.println(base);
			}else{
			total = total*base;
			System.out.println(total);
			}
		}
		
		System.out.println("El resultado es: "+total);
	}

}
