
public class ej2 {

	public static void main(String[] args) {
		int valor = ((int)(Math.random()*13+1));
		int palo = ((int)(Math.random()*4+1));
		
		String valorPalo = "";
		String valorValor ="";
		
		switch(palo){
		case 1: 
			valorPalo = "picas";
			break;
		case 2:
			valorPalo = "corazones";
			break;
		case 3:
			valorPalo = "diamantes";
			break;
		case 4:
			valorPalo = "treboles";
		}
		
		switch(String.valueOf(valor)){
			case "1":
				valorValor = "2";
				break;
			case "2":
				valorValor = "3";
				break;
			case "3":
				valorValor = "4";
				break;
			case "4":
				valorValor = "5";
				break;
			case "5":
				valorValor = "6";
				break;
			case "6":
				valorValor = "7";
				break;
			case "7":
				valorValor = "8";
				break;
			case "8":
				valorValor = "9";
				break;
			case "9":
				valorValor = "10";
				break;
			case "10":
				valorValor = "J";
				break;
			case "11":
				valorValor = "Q";
				break;
			case "12":
				valorValor = "K";
				break;
			case "13":
				valorValor = "A";
				break;
			
		}
		
		
		System.out.println("La carta es "+valorValor+" de "+valorPalo);
		
	}

}
