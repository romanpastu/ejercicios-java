//Román Pastushenko
package ej2B;

import java.util.*;

public class Diccionario {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int opcion;
		boolean proceso = true;
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("coche", "Es un vehiculo");
		diccionario.put("frigorifico", "Es un electrodomestico");
		diccionario.put("raton", "Es un animal");
		diccionario.put("antena", "Es un elemento de comunicacion");

		while (proceso == true) {
			mostrarOpciones();
			opcion = S.nextInt();
			if (opcion == 4) {
				proceso = false;
			} else if (opcion == 1) {
				System.out.println("Introduce una palabra, y te mostrare su frase correspondiente");
				String palabra = S.next();
				if (diccionario.get(palabra) != null) {
					System.out.println(diccionario.get(palabra));
				} else {
					anyadir(diccionario, palabra);
				}
			} else if (opcion == 2) {
				borrar(diccionario);
			} else if (opcion == 3) {
				mostrar(diccionario);
			}
		}

	}

	public static void anyadir(HashMap<String, String> diccionario, String palabra) {
		Scanner S = new Scanner(System.in);
		System.out.println("La palabra no existe , para darla de alta añade una descripcion");
		String descripcion = S.nextLine();
		diccionario.put(palabra, descripcion);
	}

	public static void mostrar(HashMap<String, String> diccionario) {
		System.out.println("---");
		for (Map.Entry pareja : diccionario.entrySet()) {
			System.out.print(pareja.getKey() + " -> ");
			System.out.println(pareja.getValue());
		}
		System.out.println("---");
	}

	public static void borrar(HashMap<String, String> diccionario) {
		Scanner S = new Scanner(System.in);
		System.out
				.println("Introduce la palabra que quieras borrar, y borraremos tanto la palabra como la descripcion");
		String palabra = S.next();
		diccionario.remove(palabra);
	}

	public static void mostrarOpciones() {
		System.out.println("1. Mostrar frase asociada a una palabra");
		System.out.println("2. Borrar palabra");
		System.out.println("3. Mostrar todo el diccionario");
		System.out.println("4. Salir");
	}

}
