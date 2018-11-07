
public class ej4 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for( int i = 0 ; i<numero.length;i++){
			numero[i]= (int)(Math.random()*10+1);
		}
		
		for ( int i = 0 ; i<cuadrado.length;i++){
			cuadrado[i] = numero[i]*numero[i];
		}
		
		for (int i = 0; i<cubo.length; i++){
			cubo[i] = cuadrado[i]*numero[i];
		}
		System.out.println("NUM|CUADRADO|CUBO");
		System.out.println("------------------");
		for(int i = 0; i<numero.length;i++){
			System.out.printf("%2d | %6d | %4d",numero[i],cuadrado[i],cubo[i]);
			System.out.println();
		}
		
		
	}

}
