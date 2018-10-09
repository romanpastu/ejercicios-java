import java.util.*;
public class ej16 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero y te dire si es primo o no");
		Scanner S = new Scanner(System.in);
		int numero = S.nextInt();
		S.close();
		int entreSiMismo = 0;
		int unidad = 0;
		int distinto = 0;
		
	    for ( int i = 1; i<=numero; i++){
	    if ( i == 1){
	    	if (numero%1 == 0){
	    		unidad++;
	    	}
	    }
	    if ( i == numero){
	    	if(numero%numero == 0){
	    		entreSiMismo++;
	    	}
	    }
	    if ( (i != 1) && (i != numero)){
	    	if(numero%i == 0){
	    		distinto++;
	    	}
	    }  	
	    }
	    
	    if(entreSiMismo == 1 && unidad == 1 && distinto == 0 && numero != 1){
	    	System.out.println("Es primo");
	    }else if(distinto > 0 || numero == 1){
	    	System.out.println("No es primo");
	    }
	    
	    
	}

}
