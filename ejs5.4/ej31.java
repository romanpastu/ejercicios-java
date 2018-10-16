import java.util.*;
public class ej31 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura = S.nextInt();
		int anchura = (altura/2)+1;
		for(int i=0; i<altura;i++){
			if(i < altura-1){
				System.out.println("*");
			}
			if(i == altura-1){
				for (int j = 0; j<anchura;j++){
					System.out.print("*");
				}
			}
		}

	}

}
