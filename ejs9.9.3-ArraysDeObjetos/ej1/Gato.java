package ej1;

public class Gato extends Perro{

	public Gato(String s, int p, String pelo) {
		super(s, p, pelo);

	}
	
	public void maullidoGato() {
		System.out.println("miau");
	}
	
	public String toString() {
		return "Sexo: "+getSexo()+" patas "+getPatas()+" pelo: "+getPelo();
		
	}
	
}
