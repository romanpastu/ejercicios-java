
public class funciones20a28 {

	public static void main(String[] args) {

		int arr2[] = { 5, 3, 6, 2, 2, 6 };

		System.out.println(funciones20a28.minimoArrayInt(arr2));
		System.out.println(funciones20a28.maxArrayInt(arr2));
		System.out.println(funciones20a28.mediaArrayInt(arr2));
		System.out.println(funciones20a28.estaEnArrayInt(arr2, 3));
		System.out.println(funciones20a28.posicionEnArray(arr2, 8));

		for (int auxiliar : funciones20a28.volteaArrayInt(arr2)) {
			System.out.print(auxiliar + " ");
		}

	}

	public static int[] generaArrayInt(int n, int minimo, int maximo) {
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * ((maximo + 1) - minimo)) + minimo;
		}

		return arr;
	}

	public static int minimoArrayInt(int arr[]) {

		int minimo = Integer.MAX_VALUE;

		for (int auxiliar : arr) {
			if (auxiliar < minimo) {
				minimo = auxiliar;
			}
		}

		return minimo;
	}

	public static int maxArrayInt(int arr[]) {

		int maximo = Integer.MIN_VALUE;

		for (int auxiliar : arr) {
			if (auxiliar > maximo) {
				maximo = auxiliar;
			}
		}

		return maximo;
	}

	public static int mediaArrayInt(int arr[]) {

		int sumatorio = 0;

		for (int auxiliar : arr) {
			sumatorio += auxiliar;
		}

		return sumatorio / arr.length;
	}

	public static boolean estaEnArrayInt(int arr[], int numero) {

		for (int auxiliar : arr) {
			if (auxiliar == numero) {
				return true;
			}
		}
		return false;

	}

	public static int posicionEnArray(int arr[], int numero) {

		for (int i = 0; i < arr.length; i++) {
			if (numero == arr[i]) {
				return i;
			}
		}
		System.out.println("No existe");
		return -1;

	}

	public static int[] volteaArrayInt(int arr[]) {
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
		}
		return arr2;

	}

}
