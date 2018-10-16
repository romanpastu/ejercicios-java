import java.util.*;
public class ej30 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		String primeraHora = "";
		String primerDia = "";
		
		String segundaHora = "";
		String segundoDia = "";
		
		int diaNumerico1 = 0;
		int diaNumerico2 = 0;
		
		System.out.println("Por favor, introduzca la primera hora");
		System.out.print("Dia: ");
		primerDia = S.nextLine().toString().toLowerCase();
		System.out.print("Hora: ");
		primeraHora = S.nextLine().toString().toLowerCase();
		
		System.out.println("Por favor, introduzca la segunda hora");
		System.out.print("Dia: ");
		segundoDia = S.nextLine().toString().toLowerCase();
		System.out.print("Hora: ");
		segundaHora = S.nextLine().toString().toLowerCase();
		System.out.println("El primer dia es "+primerDia);
		
		int primeraHoraInt = Integer.parseInt(primeraHora);
		int segundaHoraInt = Integer.parseInt(segundaHora);
		
		switch(primerDia){
		case "1":
		case "lunes":{
			diaNumerico1 = 1;
		}
		break;
		case "2":
		case "martes":{
			diaNumerico1 = 2;
		}
		break;
		case "3":
		case "miercoles": {
			diaNumerico1 = 3;
		}
		break;
		case "4":
		case "jueves":{
			diaNumerico1 = 4;
		}
		break;
		case "5":
		case "viernes":{
			diaNumerico1 = 5;
		}
		break;
		case "6":
		case "sabado":{
			diaNumerico1 = 6;
		}
		break;
		case "7":
		case "domingo":{
			diaNumerico1 = 7;
		}
		break;
		
		}
		
		switch(segundoDia){
		case "1":
		case "lunes":{
			diaNumerico2 = 1;
		}
		break;
		case "2":
		case "martes":{
			diaNumerico2 = 2;
		}
		break;
		case "3":
		case "miercoles": {
			diaNumerico2 = 3;
		}
		break;
		case "4":
		case "jueves":{
			diaNumerico2 = 4;
		}
		break;
		case "5":
		case "viernes":{
			diaNumerico2 = 5;
		}
		break;
		case "6":
		case "sabado":{
			diaNumerico2 = 6;
		}
		break;
		case "7":
		case "domingo":{
			diaNumerico2 = 7;
		}
		break;
		
		}
		System.out.println("el dia numerico1 es "+ diaNumerico1);
		System.out.println("la primera hora es " +primeraHoraInt);
		System.out.println("el dia numerico2 es "+diaNumerico2);
		System.out.println("la segunda hora es " + segundaHoraInt);
		
		int intervaloHorario = 0;
		intervaloHorario = ((diaNumerico2*24) + segundaHoraInt) - ((diaNumerico1*24)+primeraHoraInt);
		
		
		System.out.println("Entre las "+primeraHoraInt+":00h del "+primerDia+" y las "+segundaHoraInt+":00h del "+segundoDia+" hay "+intervaloHorario+" horas");
		
	}

}
