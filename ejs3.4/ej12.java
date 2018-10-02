import java.util.Scanner;
public class ej12{
  public static void main(String[] args){
    System.out.println("Introduce la nota que desees sacar");
    Scanner S = new Scanner(System.in);
    double notaDeseada= S.nextDouble();
    System.out.println("Introduce la nota que tienes en el primer bloque");
    double notaInicial = S.nextDouble();
    double nota2 = (notaDeseada - (notaInicial*0.4))/0.6;
    
    //System.out.println("Debes sacar "+nota2+" Para tener un "+notaDeseada);
    System.out.printf("Debes sacar %.2f para tener un %.2f",nota2,notaDeseada);
  }
}
