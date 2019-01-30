package ej4;

import ej4.Disco;


public class MainDisco {

	public static void main(String[] args) {
		Disco d1 = new Disco("233","acdc","taltaltaltal","jazz",13);
		Disco d2 = new Disco("288","madonna","fff","rock",15);
		Disco d3 = new Disco("567","madonna","noseque","pop",12);
		Disco d4 = new Disco("3874","queen","taltal","pop",13);
		System.out.println(d2);
		
		System.out.println(d1);
		
		Disco[] colDis = new Disco[4];
		colDis[0] = d1;
		colDis[1] = d2;
		colDis[2] = d3;
		colDis[3] = d4;
		
		Disco.Mostrar(colDis);
		
		
		
		
		
		
		
	

	}
}
