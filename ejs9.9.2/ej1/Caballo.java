package ej1;

public class Caballo {
	private String tipo;
	private int edad;
	private String color;
	public Caballo(int e) {
		this.edad = e;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	public int getEdad() {
		return this.edad;
	}

}
