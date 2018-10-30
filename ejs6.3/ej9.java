
public class ej9 {

	public static void main(String[] args) {

		int numero;
		int contador = 0;
		do{
			numero = ((int)(Math.random()*101));
			System.out.println(numero);
			contador++;
		}while(numero != 24);
		System.out.println("cantidad de numeros generados "+contador);
	}

}
