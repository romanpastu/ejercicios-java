import java.util.*;
public class ej3{
  public static void main(String[] args){
    double numero;
    
    Scanner S = new Scanner(System.in);
    numero = S.nextInt();
    
    if(numero == 1){
      System.out.println("Lunes");
    }else if(numero == 2){
      System.out.println("Martes");
    }else if(numero == 3){
      System.out.println("Miercoles");
    }else if(numero == 4){
      System.out.println("Jueves");
    }else if(numero == 5){
      System.out.println("Viernes");
    }else if(numero == 6){
      System.out.println("Sabado");
    }else if(numero == 7){
      System.out.println("Domingo");
    }
    
  }
}
