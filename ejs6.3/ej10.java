
public class ej10 {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++){
			
			int caracter = ((int)(Math.random()*6));
			String print="";
			switch(caracter){
			case 0:
				print = "*";
				break;
			case 1:
				print = "-";
				break;
			case 2:
				print = "=";
				break;
			case 3:
				print = ".";
				break;
			case 4:
				print = "|";
				break;
			case 5:
				print = "@";
				break;
			}
			
			int anchura = ((int)(Math.random()*40)+1);
			for (int j = 0 ; j<anchura; j++){
				System.out.print(print);
			}
			System.out.println();
		}

	}

}
