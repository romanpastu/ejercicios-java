import java.util.*;
public class IVA{
  
  
  public static void main(String[] args){
    
    Scanner S=new Scanner(System.in);
    System.out.println("Introduce su precio con iva");
    double precio_IVA = S.nextInt();
    System.out.println("Introduce su IVA y te devolvere su precio sin IVA");
    double IVA = S.nextInt();
    
    double precio_final;
    precio_final = precio_IVA - (precio_IVA*(IVA/100));
    System.out.println("EL precio SIN IVA es de "+precio_final);
    
      
    
  }
  
}
