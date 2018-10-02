import java.util.*;
public class ej1{
  public static void main (String[] args){
  int num1;
  int num2;
  int multiplicacion;
  System.out.println("Introduce dos numeros por pantalla y se te devolveran multiplicados");
  
  Scanner S = new Scanner(System.in);
  num1= Integer.parseInt(S.nextLine());
  num2= Integer.parseInt(S.nextLine());
  
  multiplicacion = num1*num2;
  System.out.println("La multiplicacion de los dos anteriores es");
  
  System.out.printf("%d * %d = %d",num1,num2,multiplicacion);
  }
}
