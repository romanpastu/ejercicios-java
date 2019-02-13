//Román Pastushenko
package ej4B;

public class MainRegalos {

	public static void main(String[] args) {
		Regalo ramo1 = new Ramo("ABC", "RamoPrimero", 15);
		System.out.println(ramo1);
		ramo1.fijarPrecio(12);
		System.out.println(ramo1);
		System.out.println(((Ramo)ramo1).getNumeroFlores());
		System.out.println(((Ramo)ramo1).precio());
		
		Regalo perfume1 = new Perfume("DEF", "perfumePrimero", 120, "Naturaleza", 1997);
		System.out.println(perfume1);
		perfume1.fijarPrecio(140);
		System.out.println(perfume1);
		System.out.println(((Perfume)perfume1).getAroma());
		System.out.println(((Perfume)perfume1).precio());
		

	}

}
