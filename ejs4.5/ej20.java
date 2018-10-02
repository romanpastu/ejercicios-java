import java.util.*;
public class ej20{
  public static void main(String[] args){
    System.out.println("Introduce un numero (max 5 digitos) y te dire si es capicua");
    
    String numero = System.console().readLine();
    char[] charArray = numero.toCharArray();
    
    if (numero.length()> 5){
      System.out.println("Tiene que tener maximo 5 digitos");
    }else{
     if(numero.length() == 5){
        if ( (charArray[0] == charArray[4]) && (charArray[1] == charArray[3])){
          System.out.println("El numero es capicua");
        }else{
          System.out.println("No es capicua");
        }
      }else if(numero.length() == 4){
        if ( (charArray[0] == charArray[3]) && (charArray[1] == charArray[2])){
          System.out.println("EL numero es capicua");
        }else{
          System.out.println("No es capicua");
        }
      }else if(numero.length() == 3){
        if (charArray[0] == charArray[2]){
          System.out.println("El numero es capicua");
        }else{
          System.out.println("No es capicua");
        }
      }else if(numero.length() == 2){
        if (charArray[0] == charArray[1]){
          System.out.println("El numero es capicua");
        }else{
          System.out.println("No es capicua");
        }
      }
     
    }
    
  }
}
