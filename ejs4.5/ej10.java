import java.util.*;
public class ej10 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String horoscopo ="";
				
		System.out.println("Introduce el mes");
		int mes = S.nextInt();
		System.out.println("Introduce el dia");
		int dia = S.nextInt();
		
		switch(mes) {
		case 1:
			if (dia < 21) {
				horoscopo = "capricornio";
			} else {
				horoscopo = "acuario";
			}
		break;
		case 2:
			if (dia < 20) {
				horoscopo = "acuario";
			} else {
				horoscopo = "piscis";
			}
		break;
		case 3:
			if (dia < 21) {
				horoscopo = "piscis";
			} else {
				horoscopo = "aries";
			}
		break;
		case 4:
			if (dia < 21) {
				horoscopo = "aries";
			} else {
				horoscopo = "tauro";
			}
		break;
		case 5:
			if (dia < 20) {
				horoscopo = "tauro";
			} else {
				horoscopo = "g�minis";
			}
		break;
		case 6:
			if (dia < 22) {
				horoscopo = "g�minis";
			} else {
				horoscopo = "c�ncer";
			}
		break;
			case 7:
				if (dia < 22) {
					horoscopo = "c�ncer";
				} else {
					horoscopo = "Leo";
				}
		break;
		case 8:
			if (dia < 24) {
				horoscopo = "leo";
			} else {
				horoscopo = "virgo";
			}
		break;
		case 9:
			if (dia < 23) {
				horoscopo = "virgo";
			} else {
				horoscopo = "libra";
			}
		break;
		case 10:
			if (dia < 23) {
				horoscopo = "libra";
		} else{
			horoscopo = "escorpio";
		}
		break;
		case 11:
			if (dia < 23) {
				horoscopo = "escorpio";
		} else {
				horoscopo = "sagitario";
		}
		break;
		case 12:
			if (dia < 21) {
				horoscopo = "sagitario";
		} else {
			horoscopo = "capricornio";
		}
		break;
		default:
		}
		
		
	}

}
