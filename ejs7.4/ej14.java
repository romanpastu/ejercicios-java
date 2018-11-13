import java.util.*;

public class ej14 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce 8 palabras y las almacenare en un array");
		
		String[] palabras = new String[8];
		String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String[] coloresGuardados = new String[8];
		
		
		// Introducimos las palabras en el array
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = S.nextLine().toLowerCase();
		}
		S.close();
		// Imprimimos el array
		System.out.println("Array original");
		for (String auxiliar : palabras) {
			System.out.print(auxiliar + " ");
		}
		System.out.println();
		System.out.println();

		// Seleccionamos todos los colores y los guardamos al principio del array
		// coloresGuardados
		int j = 0;
		for (int i = 0; i < palabras.length; i++) {
			if (Arrays.asList(colores).contains(palabras[i])) {
				coloresGuardados[j] = palabras[i];
				j++;
			}
		}

		// Despues de rellenar el array coloresGuardados con colores, ahora lo
		// rellenamos con lo que ha sobrado
		for (int i = 0; i < palabras.length; i++) {
			if (!Arrays.asList(colores).contains(palabras[i])) {
				coloresGuardados[j] = palabras[i];
				j++;
			}
		}
		
		// Mostramos el array rellenado
		System.out.println("Array ordenado");
		for (String auxiliar : coloresGuardados) {
			System.out.print(auxiliar + " ");
		}

	}

}