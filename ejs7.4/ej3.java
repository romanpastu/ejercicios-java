import java.util.*;

public class ej3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner S = new Scanner(System.in);

		System.out.println(num.length);

		for (int i = 0; i < num.length; i++) {
			num[i] = S.nextInt();
		}
		S.close();
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

}
