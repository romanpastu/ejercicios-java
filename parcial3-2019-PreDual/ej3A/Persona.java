//Román Pastushenko
package ej3A;

public class Persona {
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
