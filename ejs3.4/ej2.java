import java.util.*;

public class ej2{
    public static void main(String []args){
      System.out.println("Introduce los euros a convertir a pesetas");
      int euros;
      Scanner S=new Scanner(System.in);
      euros=S.nextInt();
      double pesetas = euros*166.386;
      
      
      System.out.println("Esos euros equivalen a "+pesetas+" pesetas");
}
}
