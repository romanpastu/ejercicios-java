import java.util.*;
public class ej6{
  public static void main(String[] args){
    System.out.println("Introduce la base imponible:");
    double baseImp;
    
    Scanner S=new Scanner(System.in);
    baseImp = S.nextInt();
    System.out.println("Introduce el IVA en %");
    
    double IVA;
    IVA = S.nextInt();
    
    double totalFactura;
    totalFactura = baseImp + (baseImp*(IVA/100));
    System.out.println("El total de la factura es: "+totalFactura);
    
  }
}
