import java.util.*;
public class ej6{
  public static void main(String[] args){
    System.out.println("Introduce la base y altura del tirangulo");
    int base,altura;
    Scanner S = new Scanner(System.in);
    System.out.println("Primero la base");
    base = Integer.parseInt(S.nextLine());
    System.out.println("Ahora la altura");
    altura = Integer.parseInt(S.nextLine());
    int size = (base*altura)/2;
    System.out.println("El área es de "+size);
  }
 } 

