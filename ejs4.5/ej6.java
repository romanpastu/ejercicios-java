import java.util.*;
import java.lang.Math;
public class ej6{
  public static void main(String[] args){
    final double g=9.81;
    
    double t;
    double h;
    System.out.println("Introduce la altura desde la cual va a caer el objeto");
    Scanner S = new Scanner(System.in);
    h = S.nextDouble();
    
    t=Math.sqrt((2*h)/g);
    
    System.out.println("El objeto tarda en caer "+t+" desde "+h+" de altura");
  }
}
