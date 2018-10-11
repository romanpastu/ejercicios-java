import java.util.Scanner;
public class ej18 {

	public static void main(String[] args) {
		Scanner  S = new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int num1 = S.nextInt();
		int num2 = S.nextInt();
		
		if ( num1 == num2){
			do{
				System.out.println("Los numeros deben ser distintos, introduzcalos de nuevo");
				num1 = S.nextInt();
				num2 = S.nextInt();
			}while(num1 == num2);
		}
		
		System.out.println("Los numeros "+num1+" , "+num2+" son distintos.");
		
		int menor,mayor;
		
		if(num1 > num2){
			mayor = num1;
			menor = num2;
		}else{
			mayor = num2;
			menor = num1;
		}
		System.out.println("----------------");
		for (int i = menor; i<= mayor; i+=7){
			System.out.println(i);
		}
		
	}

}
