import java.util.*;
public class ej11{
  public static void main(String[] args){
      double horas;
      double minutos;
      double segundosRecibidos;
      double segundosDia = 86400;
      double segundosRestantes;
      
      Scanner S = new Scanner(System.in);
      
      System.out.println("Intoroduce una hora");
      System.out.println("Primero la hora");
      horas = S.nextInt();
      System.out.println("Ahora los minutos");
      minutos = S.nextInt();
      segundosRecibidos = (horas*60*60)+(minutos*60);
      segundosRestantes = segundosDia - segundosRecibidos;
      
      System.out.println("Quedan "+segundosRestantes+" segundos");
      
      
  }
}
