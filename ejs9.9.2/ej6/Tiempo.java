package ej6;

public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tiempo(int h, int m, int s) {
		this.horas = h;
		this.minutos = m;
		this.segundos = s;
	}
	
	public Tiempo suma(Tiempo a) {
		int h = this.horas + a.horas;
		int m = this.minutos + a.minutos;
		int s = this.segundos + a.segundos;
		
		do{
			if(s >= 60) {
				s = s-60;
				m = m+1;
			}
			
		}while(s >= 60);
		
		do {
			if(m >= 60) {
				m = m-60;
				h = h+1;
			}
			
		}while(m >= 60);
		
		this.horas = h;
		this.minutos = m;
		this.segundos = s;
		
		return this;
		
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String toString() {
		return "horas: "+horas+" minutos: "+minutos+" segundos: "+segundos;
	}
	
	
}
