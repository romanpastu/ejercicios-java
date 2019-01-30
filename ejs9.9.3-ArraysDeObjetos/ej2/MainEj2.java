package ej2;
import java.util.*;

public class MainEj2 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		Gato gato[] = new Gato[4];
		gato[0] = new Gato("macho",4,"largo");
		gato[1] = new Gato();
		gato[2] = new Gato();
		gato[3] = new Gato();
		
		gato[1].setPelo("largo");
		gato[1].setPatas(2);
		gato[1].setSexo("hembra");
		
		
		for(Gato auxiliar : gato) {
			System.out.println(auxiliar);
		}

	}

}
