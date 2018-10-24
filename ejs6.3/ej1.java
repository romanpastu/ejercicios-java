
public class ej1 {

	public static void main(String[] args) {
		int contador = 0;
		int sumatorio = 0;
		do{
			int valor = (int)(Math.random()*6+1);
			System.out.println(valor);
			sumatorio+=valor;
			contador++;
		}while(contador < 3);
		System.out.println("total: "+sumatorio);
	}

}
