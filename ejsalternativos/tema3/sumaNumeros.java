public class sumaNumeros{
  public static void main(String[] args){
    int num1;
    int num2;
    int resultado;
    String lineaDeEntrada;
    
    System.out.println("Introduzca el primer sumando");
    lineaDeEntrada = System.console().readLine();
    num1= Integer.parseInt(lineaDeEntrada);
    
    System.out.println("Introduzca el segundo sumando");
    lineaDeEntrada = System.console().readLine();
    num2= Integer.parseInt(lineaDeEntrada);
    
    resultado = num1 + num2;
    
    System.out.printf("%d + %d = %d\n",num1,num2,resultado);
  }
}
