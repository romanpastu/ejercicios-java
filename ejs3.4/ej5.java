import java.util.*;
public class ej5{
  public static void main(String[] args){
    System.out.println("Introduce los lados del rectangulo");
    int lado1,lado2;
    Scanner S = new Scanner(System.in);
    lado1 = Integer.parseInt(S.nextLine());
    lado2 = Integer.parseInt(S.nextLine());
    int size = lado1 * lado2;
    System.out.println("El área es de "+size);
  }
 } 
