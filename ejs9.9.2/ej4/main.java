package ej4;

public class main {

	public static void main(String[] args) {
		Fraccion fraccion1 = new Fraccion(4, 2);
		Fraccion fraccion2 = new Fraccion(3, 6);
		Fraccion fraccion4 = new Fraccion(2, 2);
		Fraccion fraccion5 = new Fraccion(4, 4);
		Fraccion fraccion6 = new Fraccion(4,2);
		System.out.println(fraccion1);
		System.out.println(fraccion2);
		fraccion1.invierte();
		fraccion2.invierte();
		System.out.println("Invertido");
		System.out.println(fraccion1);
		System.out.println(fraccion2);
		System.out.println("Multiplicado");
		Fraccion fraccion3 = fraccion1.multiplica2(fraccion2);

		System.out.println(fraccion3);
		System.out.println("simplificacion");
		
		System.out.println(fraccion6);
		System.out.println(Fraccion.simplifica(fraccion6));
		/************/

		System.out.println(Fraccion.multiplicacion(fraccion4, fraccion5));

	}

}
