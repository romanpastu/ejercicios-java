import java.util.*;
public class ej17{
  public static void main(String[] args){
    System.out.println("Introduce un numero entero y te dire su ultima cifra");
    String numero = System.console().readLine();
    
    int longitud = numero.length();
    
    char[] charArray = numero.toCharArray();
    System.out.println("El ultimo numero es "+charArray[longitud-1]);
    
  }
}
