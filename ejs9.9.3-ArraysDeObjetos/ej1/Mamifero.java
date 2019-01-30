package ej1;

public class Mamifero extends Animal {
	private int patas;
	public Mamifero(String s, int p) {
		
		super(s);
		this.patas = p;
		
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	



}
