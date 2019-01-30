package ej3;

public class Disco {
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	public Disco (String c, String a, String t, String g, int d) {
		this.codigo  = c;
		this.autor = a;
		this.titulo = t;
		this.genero = g;
		this.duracion = d;
	}
	public Disco() {
		this.codigo = "PRIVADO";
		
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
		
	}
	
}
