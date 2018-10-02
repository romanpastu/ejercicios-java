import java.util.*;
public class ej1{
  public static void main(String[] args){
    double numero;
    
    System.out.println("Le voy a decir si el numero introducido es par o impar.");
    System.out.println("Te dire si el numero es par o impar");
    
    Scanner S = new Scanner(System.in);
    numero = S.nextInt();
    
    if ((numero%2) == 0){
      System.out.println("El numero es par");
    }else{
      System.out.println("El numero es impar");
  }
}
}
