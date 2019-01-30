package ej1;

public class Perro extends Mamifero {
	private String pelo;
	public Perro(String s, int p, String pelo) {
		super(s, p);
		this.pelo = pelo;
		
	}
	
	public void ladrido() {
		System.out.println("woof");
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	
}
