import java.util.*;
public class ej5{
  public static void main(String[] args){
    
   double a;
   double b;
   double x;
   
   Scanner S = new Scanner(System.in);
   System.out.println("Este progprama resuelve ecuacion de primer grado del tipo ax + b = 0");
   System.out.println("Por favor introduzca el valor de a");
   a = S.nextDouble();
   System.out.println("Por favor introduzca el valo de b");
   b = S.nextDouble();
   
   if (a != 0){
      x= (b*(-1))/a;
      System.out.println("x = "+x);
    }else if (a==0){
      System.out.println("Esa ecuacion no tiene solucion real");
    }
   
   
    
  }
}

