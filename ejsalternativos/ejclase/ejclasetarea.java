import java.util.*;
public class ejclasetarea{
  public static void main(String[] args){
    double a;
    double b;
    
    Scanner S = new Scanner(System.in);
    
    System.out.println("Introduce dos números y te dire cual es mayor o si son iguales");
    
    a = S.nextDouble();
    b = S.nextDouble();
    
    
    
    if (a<b){
      System.out.println("Es mas grande "+b);
    }else if(a == b){
      System.out.println("Tanto "+a+" como "+b+" son iguales");
    }else{
      System.out.println(a+" Es mas grande");
    }
}
}
