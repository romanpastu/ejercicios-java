import java.util.*;
public class ej19{
  public static void main(String[] args){
    String numero = System.console().readLine();
    
    double numeroConvertido = Integer.parseInt(numero);
    char[] charArray = numero.toCharArray();
    int longitud = charArray.length;
  
    
   
   if((numeroConvertido <0) && (longitud>6 )){
      System.out.println("El numero tiene que ser de maximo 5 digitos");
      
    }else if ((numeroConvertido >0) && (longitud>5 ) ){
      System.out.println("El numero tiene que ser de maximo 5 digitos");
      
    }else{
      if (numeroConvertido < 0 ){
      System.out.println(charArray.length-1);
    }else{
      System.out.println(charArray.length);
    }
    }
    
    
    
    
    
    
    
    
    
    
     
  }
}
