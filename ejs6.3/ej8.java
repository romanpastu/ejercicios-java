//*200 , 0-99 || *100+1 1-100
public class ej8 {
	public static void main(String[] args) {
		
		int numero1 = 1;
		int numero2 = 2;
		int numeroPartido = 1;
		for (int i = 0; i<14;i++){
			
			System.out.printf("Nº de partido %2d : Equipo %2d vs Equipo %2d ",numeroPartido,numero1,numero2);
			for(int j = 0; j<3;j++){
				String resultado = "";
				
				int valor = ((int)(Math.random()*6+1));
				switch (valor){
				case 1:
				case 2:
				case 3:
					resultado += "|1  |";
					break;
				case 4:
				case 5:
					resultado += "| X |";
					break;
				case 6:
					resultado += "|  2|";
					break;
				}	
			System.out.printf("%s",resultado);
			}
			
			System.out.println();
			numero1+=2;
			numero2+=2;
			numeroPartido++;
		}

	}

}