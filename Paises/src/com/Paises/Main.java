package com.Paises;

public class Main {

	public static void main(String[] args) {
		Pais brasil = new Pais("brasil", "brasil2", 100 );
		Pais venezuela = new Pais("venezuela", "caracas", 50 );
		Pais brasil1 = new Pais("brasil", "brasil2", 100 );
		Pais russia = new Pais("russia", "moscow", 200 );
		
		brasil.criarFronteiras(russia);
		brasil.criarFronteiras(venezuela);
		venezuela.criarFronteiras(russia);
		venezuela.criarFronteiras(brasil);
		
		System.out.println("FRONTEIRAS DO BRASIL" + brasil.listaFronteira());
		System.out.println("FRONTEIRAS DA VENEZUELA" + venezuela.listaFronteira());
		System.out.println("VIZINHOS EM COMUN" + brasil.vizinhosComuns(venezuela));
	}

}
