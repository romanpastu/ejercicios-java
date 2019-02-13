//Román Pastushenko
package ej3A;
import java.util.*;

public class Supermercado {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ArrayList<Persona> cola = new ArrayList<Persona>();
		boolean valido = true;
		
		
		while(valido) {
			System.out.println("1. Hacer que llegue una persona");
			System.out.println("2. Hacer que salga la primera de la cola");
			System.out.println("3. Presentar la cola por pantalla");
			System.out.println("4. Salir del programa");
			
			int opcion = S.nextInt();
			if(opcion == 4) {
				System.out.println("Has salido");
				valido = false;
			}else if(opcion == 1) {
				String dni;
				String nombre;
				System.out.println("Introduce su DNI");
				dni = S.next();
				System.out.println("Introduce su nombre");
				nombre = S.next();
				cola.add(new Persona(dni, nombre));
			}else if(opcion == 3) {
				mostrarCola(cola);
			}else if(opcion == 2) {
				Atencion(cola);
			}
		}

	}
	public static void mostrarCola(ArrayList<Persona> cola) {
		for(Persona aux : cola) {
			System.out.println(aux);
		}
	}
	public static void Atencion(ArrayList<Persona> cola) {
		if(cola.size() != 0) {
			cola.remove(0);
			}else {
				System.out.println("La cola esta vacia no sale nadie");
			}
	}



}
