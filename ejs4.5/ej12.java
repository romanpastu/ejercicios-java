import java.util.*;
public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int puntuacion = 0;
		String respuesta = "";
		System.out.println("Programa tipo test para evaluar tu conocimiento sobre las asignaturas");
		
		
		System.out.println("Que asignatura hay el lunes a primera hora?");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("sistemas informaticos")) {
			puntuacion++;
		}
		System.out.println("Que asignatura hay el martes a primera hora?");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("programacion")) {
			puntuacion++;
		}
		System.out.println("Que asignatura hay el miercoles a primera hora?");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("entornos de desarrollo")) {
			puntuacion++;
		}
		System.out.println("Que asignatura hay el jueves a primera hora?");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("entornos de desarrollo")) {
			puntuacion++;
		}
		System.out.println("Que asignatura hay el viernes a primera hora?");
		respuesta = S.nextLine();
		if (respuesta.toLowerCase().equals("sistemas informaticos")) {
			puntuacion++;
		}
		
		System.out.println("La puntuacion obtenida es: "+puntuacion+"/5");
	}

}
