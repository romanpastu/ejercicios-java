import java.util.*;
public class restaNumeros{
    public static void main(String[] args){
    int num1,num2,resultado;
    
    Scanner S = new Scanner(System.in);
    
    System.out.println("Introduzca el primer restando");
    num1= Integer.parseInt(S.nextLine());
    //num1 =  S.nextInt();
    
    System.out.println("Introduzca el segundo restando");
    num2 = Integer.parseInt(S.nextLine());
    //num2 = S.nextInt();
    
    resultado = num1-num2;
    
    System.out.printf("%d - %d = %d", num1,num2,resultado);
      
      
    }
    
}
