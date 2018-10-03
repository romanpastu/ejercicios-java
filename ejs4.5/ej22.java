import java.util.*;
public class ej22 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int minutosTranscurridos = 0;
		int diaNumerico = 0;
		String diaString = "";
		int hora;
		int minutosHastaViernes = 6660;
		int minutosRestantes;
		System.out.println("Introduce un dia y hora de la semana, y te dire cuantos minutos quedan para el fin de semana");
		
		System.out.printf("Dia: ");
		diaString += S.nextLine().toLowerCase();
		
		switch(diaString) {
		case "lunes":
			diaNumerico += 0;
			break;
		case "martes":
			diaNumerico += 1;
			break;
		case "miercoles":
			diaNumerico += 2;
			break;
		case "jueves":
			diaNumerico += 3;
			break;
		case "viernes":
			diaNumerico += 4;
			break;
		}
		
		System.out.printf("\nHora (formato 24 horas):");
		hora = S.nextInt();
		System.out.print("\n");
		minutosTranscurridos = (diaNumerico*24*60)+(hora*60);
		minutosRestantes = minutosHastaViernes - minutosTranscurridos;
		System.out.println("Minutos restantes hasta el viernes "+minutosRestantes+"min");
		
	}
}
