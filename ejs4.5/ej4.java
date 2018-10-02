import java.util.*;
public class ej4{
  public static void main(String[] args){
    
    double horas;
    double horasRestantes;
    double sueldo;
    double horasSub;
    
    Scanner S = new Scanner(System.in);
    System.out.println("Introduce el numero de horas trabajadas durante la semana");
    horas = S.nextInt();
    horasSub = horas*12;
    
    if(horas <=40){
      System.out.println("El sueldo semanal que le corresponde es de "+horasSub+" euros");
    }else if(horas >40){
      horasRestantes = horas-40;
      sueldo = (horasRestantes*16)+(40*12);
      System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros");
    }
    
  }
}
