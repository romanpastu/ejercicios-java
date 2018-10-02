public class ej18{
  public static void main(String[] args){
    System.out.println("Introduce un numero entero y te dire su primera cifra");
    String numero = System.console().readLine();
    int longitud = numero.length();
    int numeroint = Integer.parseInt(numero);
    
    if (longitud == 0 || longitud >5){
      System.out.println("Tienes que introducir un numero que no tenga mas de 5 digitos");
    }else if (longitud == 1){
      int b = numeroint/1;
      System.out.println("El numero es "+b);
    }else if (longitud == 2){
      int b = numeroint/10;
      System.out.println("El numero es "+b);
    }else if (longitud == 3){
      int b = numeroint/100;
      System.out.println("El numero es "+b);
    }else if (longitud == 4){
      int b = numeroint/1000;
      System.out.println("El numero es "+b);
    }else{
      int b = numeroint/10000;
      System.out.println("El numero es "+b);
    }
    
    
    
    
  }
  
}
