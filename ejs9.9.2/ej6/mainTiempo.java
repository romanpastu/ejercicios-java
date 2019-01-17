package ej6;

public class mainTiempo {

	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(20,30,50);
		Tiempo t2 = new Tiempo (10,25,10);
		System.out.println(t1);
		
		t2.suma(t1);
		System.out.println(t2);

	}

}
