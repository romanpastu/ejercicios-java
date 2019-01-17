package ej3;

public class main {

	public static void main(String[] args) {
		Lagarto lagarto = new Lagarto("masculino", "brillantes");
		System.out.println(lagarto);
		lagarto.sonidoLargarto();
		
		System.out.println("------");
		
		Pinguino pinguino = new Pinguino("masculino", "grande", "plumas cortas");
		System.out.println(pinguino);
	}

}
