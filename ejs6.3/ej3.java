
public class ej3 {

	public static void main(String[] args) {
		int valor = ( (int)(Math.random()*10+1));
		int palo = ((int)(Math.random()*4+1));
		
		String valorPalo = "";
		String valorValor ="";
		
		switch(String.valueOf(palo)){
		case "1": 
			valorPalo = "oros";
			break;
		case "2":
			valorPalo = "bastos";
			break;
		case "3":
			valorPalo = "espadas";
			break;
		case "4":
			valorPalo = "copas";
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
				valorValor = "sota";
				break;
			case "8":
				valorValor = "caballo";
				break;
			case "9":
				valorValor = "rey";
				break;
			case "10":
				valorValor = "as";
				break;
			
		}
		
		System.out.println("La carta es "+valorValor+" de "+valorPalo);
	}

}
