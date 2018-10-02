import java.util.*;
public class ej8{
  public static void main(String[] args){
    double a,b,c;
    double media;
    String tipo;
    System.out.println("Introduce 3 notas y te devolvere la media");
    Scanner S = new Scanner(System.in);
    
    a = S.nextDouble();
    b = S.nextDouble();
    c = S.nextDouble();
    
    media = (a+b+c)/3;
    if (media <5){
    tipo = "INSUFICIENTE";
    System.out.printf("La nota media es de %.2f %s",media,tipo);
    }else if (media >=5 && media <6){
    tipo = "BIEN";
    System.out.printf("La nota media es de %.2f %s",media,tipo);
    }else if (media >=6 && media <7){
      tipo = "BIEN";
      System.out.printf("La nota media es de %.2f %s",media,tipo);
    }else if (media >=7 && media <9){
      tipo = "NOTABLE";
      System.out.printf("La nota media es de %.2f %s",media,tipo);
    }else{
      tipo = "SOBRESALIENTE";
      System.out.printf("La nota media es de %.2f %s",media,tipo);
    }
}
}
