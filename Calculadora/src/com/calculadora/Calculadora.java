package com.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	private Scanner scanner;
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Calculadora(double a, double b, Scanner scanner) {
		this.a = a;
		this.b = b;
		this.scanner = scanner;
	}
	
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	public void operacao() {
	System.out.println("qual operacao voce deseja 1 + 2 - 3 / 4 *");
	int receba1 = scanner.nextInt();
		
	if (receba1 == 1) {
		System.out.println("VOCE ESCOLHEU SOMA ");
		System.out.println("DECIDA O PRIMEIRO VALOR ");
		a = scanner.nextInt();
		System.out.println("DECIDA O SEGUNDO VALOR ");
		b = scanner.nextInt();
		System.out.println("O RESULTADO É " + (a + b));
	}
	if (receba1 == 2) {
		System.out.println("VOCE ESCOLHEU SUBTRAÇÂO ");
		System.out.println("DECIDA O PRIMEIRO VALOR ");
		a = scanner.nextInt();
		System.out.println("DECIDA O SEGUNDO VALOR ");
		b = scanner.nextInt();
		System.out.println("O RESULTADO É " + (a - b));
	}
	if (receba1 == 3) {
		System.out.println("VOCE ESCOLHEU DIVISÃO ");
		System.out.println("DECIDA O PRIMEIRO VALOR ");
		a = scanner.nextInt();
		System.out.println("DECIDA O SEGUNDO VALOR ");
		b = scanner.nextInt();
		System.out.println("O RESULTADO É " + (a / b));
	}
	if (receba1 == 4) {
		System.out.println("VOCE ESCOLHEU MULTIPLICAÇÃO ");
		System.out.println("DECIDA O PRIMEIRO VALOR ");
		a = scanner.nextInt();
		System.out.println("DECIDA O SEGUNDO VALOR ");
		b = scanner.nextInt();
		System.out.println("O RESULTADO É " + (a * b));
	}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora teste = new Calculadora(0, 0, scanner);
		
		teste.operacao();
	}

	
}
