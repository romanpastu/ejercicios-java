package ej1;
import java.util.*;

public class MainEj1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		Gato gato[] = new Gato[4];
		for (int i = 0 ; i<4; i++) {
			System.out.println("Introduce la edad del gato");
			int edad = S.nextInt();
			System.out.println("Introdocue el sexo del gato");
			String sexo = S.next();
			System.out.println("Introduce el tipo de pelo que tiene el gato");
			String tipoPelo = S.next();
			
			gato[i] = new Gato(sexo,edad,tipoPelo);
		}
		
		for(Gato auxiliar : gato) {
			System.out.println(auxiliar);
		}

	}

}
