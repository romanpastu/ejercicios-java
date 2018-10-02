import java.util.Scanner;

public class ej11{
  public static void main(String[] args){
   
   System.out.printf("Vamos a convertir de kb a mb\nIntroduce los kb que desees convertir\n");
   Scanner S = new Scanner(System.in);
   double kb = S.nextDouble();
   double mb = kb/1024;
   System.out.println(kb+" kb equivalen a "+mb+" mb");
  }
}

