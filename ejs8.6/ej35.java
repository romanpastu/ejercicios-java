
public class ej35 {

	public static void main(String[] args) {
		System.out.println(convierteEnPalotes(406201));

	}

	public static String convierteEnPalotes(int n) {
		String toReturn = "";
		int numero = n;
		int j = 0;
		// numero de digitos
		int digitos = funciones1a14.digitos(numero);

		String numeroString = Integer.toString(numero);

		char[] numeroChar = numeroString.toCharArray();

		int[] longitudes = new int[digitos];

		for (int i = 0; i < digitos; i++) {
			longitudes[j] = Character.getNumericValue(numeroChar[i]);
			j++;
		}

		for (int i = 0; i < longitudes.length; i++) {
			int longitud = longitudes[i];
			for (int x = 0; x < longitud; x++) {
				if (longitud != 0) {
					toReturn += "|";
				}

			}
			if (i != longitudes.length - 1 && longitud != 0) {
				toReturn += "-";
			}
			if (longitud == 0) {
				toReturn += "-";
			}
		}

		return toReturn;
	}

}
