package com.banco;

import java.util.Scanner;

public class Gerenciador {
	private Scanner scanner = new Scanner(System.in);
	private Banco banco = new Banco("BANCO DO MAL");
	
	public void inicializacao() {
		
		
	int option = -1;
	
	while(option != 0) {
	System.out.println("Escolha sua opção" + "\n" + "1 criar uma conta" + "\n" + "2 para deletar uma conta" + "\n" + "3 para fazer um deposito" + "\n" + "4 para emitir saldo de uma conta" + "\n" + "5 para emitir o extrato da conta" + "\n" + "6 para exibir contas" + "\n" + "7 para entrar na sua conta" + "\n" + "0 para sair");
	
	option = scanner.nextInt();
	
	switch(option) {
	case 1:
		criarConta();
		break;
	case 2:
		deletarConta();
		break;
	case 3:
		fazerDeposito();
		break;
	case 4:
		emitirSaldo();
		break;
	case 5:
		emitirExtrato();
		break;
	case 6:
		showContas();
		break;
	case 7:
		entrarNaConta();
		break;
	case 0:
		System.out.println("GOODBYE");
	}
	
	}
	}
	
	public void criarConta() {
		System.out.println("QUAL O NUMERO DA CONTA?");
		int numerodaconta = scanner.nextInt();
		
		System.out.println("QUAL O LIMITE DA CONTA?");
		double limitedaconta = scanner.nextDouble();
		
		System.out.println("A CONTA È ESPECIAL?");
		boolean especial = scanner.nextBoolean();
	
		System.out.println("QUAL SALDO INICIAL DA CONTA");
		double saldoinicial = scanner.nextDouble();
		
		banco.CriarConta(numerodaconta, especial, limitedaconta, saldoinicial);

	}
	public void deletarConta() {
		System.out.println("QUAL NUMERO DA CONTA QUE VOCE DESEJA DELTAR");
		int numerodaconta = scanner.nextInt();
		
		banco.ExcluirConta(numerodaconta);
	}
	public void fazerDeposito() {
		System.out.println("QUAL NUMERO DA CONTA QUE VOCE DESEJA DEPOSITAR");
		int numerodaconta = scanner.nextInt();
		System.out.println("QUAL O VALOR");
		int valor = scanner.nextInt();
		System.out.println("DESTINO DA TRANSFERENCIA?");
		int contadestino = scanner.nextInt();
		
		banco.transferir(numerodaconta, valor, contadestino);
	}
	public void emitirSaldo() {
		System.out.println("QUAL O NUMERO DA CONTA?");
		int numerodaconta = scanner.nextInt();
		
		banco.emitirSaldo(numerodaconta);
	}
	public void emitirExtrato() {
		System.out.println("QUAL O NUMERO DA CONTA?");
		int numerodaconta = scanner.nextInt();
		
		banco.emitirExtrato(numerodaconta);
	}
	public void showContas() {
		banco.showContas();
	}
	public void entrarNaConta() {
		System.out.println("QUAL NUMERO DA CONTA");
		int numerodaconta = scanner.nextInt();
		
		Conta conta = banco.Filtrar(banco.getContas(), numerodaconta);
		
		if(conta != null) {
			menu(conta);
		}
	}
	public void menu(Conta conta) {
		int opcao = -1;
		
	while(opcao != 0) {
		System.out.println("CONTA " + conta.getNumeroDaConta());
		System.out.println("1 - Ver Saldo");
		System.out.println("2 - Fazer Depósito");
		System.out.println("3 - Fazer Transferência");
		System.out.println("0 - Voltar");
		        
		opcao = scanner.nextInt();
		        
		switch(opcao) {
		case 1:
			System.out.println("Saldo: R$ " + conta.getSaldo());
				break;
		case 2:
			System.out.println("Valor do depósito:");
				double valor = scanner.nextDouble();
				conta.Depositar(valor);
		        break;
		case 3:
			transferirMASEODECONTA(conta);
		        break;
		case 0:
		    System.out.println("Voltando ao menu principal...");
		        break;
		        }
		    }
		}
	public void transferirMASEODECONTA(Conta contacerta) {
		System.out.println("SUA CONTA" + contacerta.getNumeroDaConta());
		int numerodaconta = contacerta.getNumeroDaConta();
		System.out.println("QUAL O VALOR");
		int valor = scanner.nextInt();
		System.out.println("DESTINO DA TRANSFERENCIA?");
		int contadestino = scanner.nextInt();
		
		banco.transferir(numerodaconta, valor, contadestino);
	}
	}

