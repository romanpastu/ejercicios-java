package ej4;
import java.util.*;
public class Disco {
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

	public Disco(String c, String a, String t, String g, int d) {
		this.codigo = c;
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

	public static void nuevoDisco(Disco[] colDisco) {
		boolean disponibilidad = false;
		for (int i = 0; i < colDisco.length; i++) {
			if (colDisco[i] == null) {
				colDisco[i] = new Disco();
				i = colDisco.length;
				disponibilidad = true;
			}
		}
		if (!disponibilidad) {
			System.out.println("No hay mas huecos");
		}
	}

	public static void Borrar(String codigo, Disco[] colDisco) {
		boolean existencia = false;
		for (int i = 0; i < colDisco.length; i++) {
			if (colDisco[i] != null) {
				if (colDisco[i].getCodigo().equals(codigo)) {
					colDisco[i] = null;
					existencia = true;
					i = colDisco.length;
				}
			}
		}
		if (!existencia) {
			System.out.println("ese disco no existe");
		}
	}
	
	public static void Mostrar(Disco[] colDisco) {
		System.out.println("Para listar todos los discos pulsa 1.");
		System.out.println("Para listar todos los discos de un autor pulsa 2.");
		System.out.println("Para listar todos los discos de un genero pulsa 3.");
		Scanner S = new Scanner(System.in);
		int opcion = S.nextInt();
		
		if(opcion == 1) {
			for(Disco auxiliar : colDisco) {
				System.out.println(auxiliar);
			}
		}else if(opcion == 2) {
			System.out.println("Introduce el autor");
			String autorInput = S.next();
			for(Disco auxiliar : colDisco) {
				if(auxiliar != null) {
					if(auxiliar.getAutor().equals(autorInput)) {
						System.out.println(auxiliar);
					}
				}
			}
		}else if(opcion == 3) {
			System.out.println("Introduce el genero");
			String generoInput = S.next();
			for(int i = 0 ; i< colDisco.length;i++) {
				if(colDisco[i]  != null) {
					if(colDisco[i].getGenero().equals(generoInput)) {
						System.out.println(colDisco[i]);
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";

	}
}