import java.util.*;
public class ej3{
  public static void main(String[] args){
      System.out.println("Introduce las pesetas a convertir a euros");
      double pesetas;
      Scanner S=new Scanner(System.in);
      pesetas = S.nextInt();
      double euros = pesetas*0.006;
      
      
      System.out.println("Esas pesetas equivalen a "+euros+" euros");
  }
}
