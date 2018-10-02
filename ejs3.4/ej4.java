import java.util.*;
public class ej4{
  public static void main(String[] args){
    System.out.println("Este programa va a dividir, sumar, restar, y multiplicar los numeros que se introduzcan por teclado");
    System.out.println("Introduce los dos numeros con los cuales desees operar (uno por linea)");
    int num1,num2;
    int multiplicacion;
    int division;
    int resta;
    int suma;
    Scanner S = new Scanner(System.in);
    num1= Integer.parseInt(S.nextLine());
    num2 = Integer.parseInt(S.nextLine());
    
    multiplicacion = num1*num2;
    division = num1/num2;
    resta = num1-num2;
    suma = num1+num2;
    
    System.out.printf("Los numeros son: %d %d\n Su resta es: %d\n Su suma es: %d\n Su multiplicacion es %d\n Su division es: %d\n", num1,num2,resta,suma,multiplicacion,division);
    
    
  }
}
