import java.util.*;
public class ej15{
  public static void main ( String[] args){
      String a;
      Scanner S = new Scanner(System.in);
      System.out.println("Introduce con que vas a rellenar la piramide");
      a = System.console().readLine();
      System.out.println("Introduce la opcion");
      System.out.printf("Opcion 1 == vertice arriba\nOpcion 2 == vertice derecha\nOpcion 3 == vertice izquierda\nOpcion 4 == vertice abajo\n");
      int option = Integer.parseInt(System.console().readLine());
      
      switch(option){
        case 1 : 
        System.out.println("  "+a);
        System.out.println(" "+a+a+a);
        System.out.println(a+a+a+a+a);
        case 4:
        System.out.println(a+a+a+a+a);
        System.out.println(" "+a+a+a);
        System.out.println("  "+a);
        case 2:
        System.out.println("    "+a);
        System.out.println("  "+a+" "+a);
        System.out.println(a+" "+a+" "+a);
        System.out.println("  "+a+" "+a);
        System.out.println("    "+a);
        case 3:
        System.out.println(a);
        System.out.println(a+" "+a);
        System.out.println(a+ " " + a + " " +a);
        System.out.println(a+" "+a);
        System.out.println(a);
      }
      
    }
  }
