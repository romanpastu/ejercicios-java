import java.util.Scanner;

public class ej10{
  public static void main(String[] args){
   
   System.out.printf("Vamos a convertir de mb a kb\n Introduce los kb que desees convertir");
   Scanner S = new Scanner(System.in);
   double mb = S.nextDouble();
   double kb = mb*1024;
   System.out.println(mb+" mb equivalen a "+kb+" kb");
  }
}
