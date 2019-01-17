package ej8;

public class mainTerminal {

	public static void main(String[] args) {
		Terminal t1 = new Terminal("678 11 22 33");
		Terminal t2 = new Terminal("644 74 44 69");
		Terminal t3 = new Terminal("622 32 89 09");
		Terminal t4 = new Terminal("664 73 98 18");
		System.out.println(t1);
		System.out.println(t2);
		t1.llama(t2, 320);
		t1.llama(t3, 200);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		/*
		Nº 678 11 22 33 - 0s de conversación
		Nº 644 74 44 69 - 0s de conversación
		Nº 678 11 22 33 - 520s de conversación
		Nº 644 74 44 69 - 320s de conversación
		Nº 622 32 89 09 - 200s de conversación
		Nº 664 73 98 18 - 0s de conversación
		*/

	}

}
