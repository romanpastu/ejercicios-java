
public class ej5 {

	public static void main(String[] args) {
		int maximo = 0;
		int minimo = 100;
		int sumatorio = 0;
		int contador = 0;
		for ( int i = 0 ;i<50;i++){
			int numero = (int)(Math.random()*100+100);
			
			System.out.print(numero+" ");
			if(numero > maximo){
				maximo = numero;
			}
			if(contador == 0){
				minimo = numero;
			}
			if(numero< minimo){
				minimo = numero;
			}
			sumatorio+=numero;
			
			contador++;
			
		}
		System.out.println();
		System.out.println("minimo "+minimo);
		System.out.println("maximo "+maximo);
		System.out.println("media "+sumatorio/50);
	}

}
