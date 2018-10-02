import java.util.*;
import java.lang.*;
public class ej9{
  public static void main(String[] args){
    System.out.println("Este programa resolvera una ecuacion de segundo grado");
    System.out.println("Deberas aportar los valores: a , b y c, para ax^2+bx+c=0");
    
    double a,b,c;
    double solucion1;
    double solucion2;
    
    Scanner S = new Scanner(System.in);
    a = S.nextDouble();
    b = S.nextDouble();
    c = S.nextDouble();
    double b_b= b*b;
    double a_c = a*c;
    double inside = (b_b)-(4*(a_c));
    double insideroot = Math.sqrt(inside);
   
   
    
    if(inside <0){
      System.out.println("ERROR la raiz no puede ser negativa");
    }else if(a==0){
      System.out.println("Error el denominador no puede ser 0");
    }else{
    solucion1 = ((b*(-1))+insideroot)/(2*a);
    solucion2 =  ((b*(-1))-insideroot)/(2*a);
    
    System.out.println("Las soluciones son "+solucion1+" "+solucion2);
  }
     
  }
}
