import java.util.*;
public class ej24{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    
    int cargo;
    int viaje;
    int estadoCivil;
    double sueldoBase = 0;
    double dietas;
    double sueldoBruto;
    double retencionIRPF = 0;
    String porcentaje = "%";
    
    System.out.println("Introduce el cargo del empleado");
    System.out.println("1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
    
    cargo = S.nextInt();
    
    System.out.println("Introduce los dias que ha estado de viaje visitando clientes durante el mes");
    viaje = S.nextInt();
    
    System.out.println("Introduce tu estado civil (1 - Soltero, 2 - Casado)");
    estadoCivil = S.nextInt();
    S.close();
    
    if (cargo == 1){
      sueldoBase = 950;
    }else if( cargo == 2){
      sueldoBase = 1200;
    }else if(cargo == 3){
      sueldoBase = 1600;
    }else if (cargo >3){
      System.out.println("Ese cargo no existe"); 
      System.exit(0);
    }
   
    dietas = viaje*30;
    sueldoBruto = sueldoBase + dietas;
    
    if(estadoCivil == 1){
      retencionIRPF = 25;
      
    }else if(estadoCivil == 2){
      retencionIRPF = 20;
      
    }else{
      System.out.println("Estado civil incorrecto");
      System.exit(0);
    }
    
    double irpfRetenido = (sueldoBruto*(retencionIRPF/100));
    
    int retencionIRPFint = parseInt(retencionIRPF);
    double sueldoNetof = sueldoBruto-irpfRetenido;
    
    System.out.println("Sueldo base "+sueldoBase);
    System.out.println("Dietas ( "+viaje+" viajes ) "+dietas);
    System.out.println("Sueldo bruto "+sueldoBruto);
    System.out.println("Retencion IRPF ("+retencionIRPF+") "+irpfRetenido);
    System.out.println("Sueldo neto "+(sueldoBruto-irpfRetenido));
    
    
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo base                  %7.2f =\n", sueldoBase);
    System.out.printf("= Dietas (%2d viajes)           %7.2f =\n", viaje,dietas);
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo bruto                 %7.2f =\n", sueldoBruto);
    System.out.printf("= Retencion IRPF (%2.0f%%)         %7.2f =\n",retencionIRPF,irpfRetenido);
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo neto                  %7.2f =\n", sueldoNetof);
    System.out.printf("========================================\n");
  }

private static int parseInt(double retencionIRPF) {
	// TODO Auto-generated method stub
	return 0;
}
}