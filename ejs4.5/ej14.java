import java.util.*;
public class ej14{
  public static void main (String[] args){
    System.out.println("Introduce un numero y te dire si es par y/o divisible entre 5");
    Scanner S = new Scanner(System.in);
    int numero = S.nextInt();
    
    if (numero%2 == 0){
      System.out.println("Es par");
    }else {
      System.out.println("Es impar");
    }
    
    if(numero%5 == 0){
      System.out.println("Es divisible entre 5");
    }
}
}
