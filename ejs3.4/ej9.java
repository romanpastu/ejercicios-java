import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
	
	//Escribe un programa que calcule el volumen de un cono según la fórmula 
    System.out.println("Vamos a calcular el volumen de un cono");
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce el radio");
		double radio = S.nextDouble();
		System.out.println("Introduce la altura");
		double altura = S.nextDouble();
		double volumen;
    System.out.println("Radio: "+radio+" Altura: "+altura); 
		volumen = (3.14*(radio*radio)*altura)/3;
		System.out.println("El volumen es de "+volumen);
		
	}

}

