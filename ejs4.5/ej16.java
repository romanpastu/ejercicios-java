import java.util.*;
public class ej16 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int resultado = 0;
		String respuesta = "";
		
		System.out.println("En este programa te diremos si tu pareja te es infiel gracias a un cuestionario");
		System.out.println("Las respuestas deben ser del tipo SI / NO");
		
		System.out.println("1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("3. Ha perdido el inter�s que mostaba anteriormente por ti");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer)");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("5. No te deja que mires la agenda de su tel�fono m�vil");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando est�s t� delante");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("9. Has notado que �ltimamente se perfuma m�s");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("si")) {
			resultado += 3;
		}
		
		if(resultado >=0 && resultado <=10) {
			System.out.println("Enhorabuena, tu pareja parece ser totalmente fiel");
		}else if (resultado >=11 && resultado <= 22) {
			System.out.println("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia");
		}else if(resultado >= 22 && resultado <= 30) {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza");
		}
	}

}
