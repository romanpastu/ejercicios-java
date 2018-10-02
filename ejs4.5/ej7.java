import java.util.*;
public class ej7{
  public static void main(String[] args){
    double a,b,c;
    double media;
    
    System.out.println("Introduce 3 notas y te devolvere la media");
    Scanner S = new Scanner(System.in);
    
    a = S.nextDouble();
    b = S.nextDouble();
    c = S.nextDouble();
    
    media = (a+b+c)/3;
    
    System.out.printf("La nota media es de %.2f",media);
  }
}
