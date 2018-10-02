import java.util.*;
public class ej2{
  public static void main(String[] args){
    double hora;
    
    System.out.println("Introduce la hora");
    Scanner S = new Scanner(System.in);
    hora = S.nextInt();
    
    if(hora >= 6 && hora <=12){
      System.out.println("Buenos dias");
    }else if(hora >=13 && hora <=20){
      System.out.println("Buenas tardes");
    }else if(hora >24){
      System.out.println("El dia solo tiene 24 horas!!!");
    }else{
      System.out.println("Buenas noches");
    }
  }
}




