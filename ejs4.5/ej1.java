
public class ej1{
  public static void main(String[] args){
    String dia;
    
    
    System.out.println("Introduce un dia de la semana y devolvere que asignatura te toca a primera hora");
    
    
    dia = (System.console().readLine());
    dia.toLowerCase();
    
    switch(dia) {
      case "lunes":
      case "martes":
      case "miercoles":
        System.out.println("Programación");
      break;
      
      case "jueves":
      System.out.println("Sistemas Informáticos");
      break;
      
      case "viernes":
      System.out.println("Bases de Datos");
      break;
      
      case "sabado":

      case "domingo":
      System.out.println("¡Ese día no hay clase!");
      break;
      
      default:
      
      System.out.println("El día introducido no es correcto.");
      }
    } 
  }
