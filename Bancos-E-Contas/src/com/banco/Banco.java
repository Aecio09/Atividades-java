package com.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco {
	private Scanner scanner = new Scanner(System.in);
	private String NomeDoBanco;
	private List<Conta> Contas;
	
	public Banco(String NomeDoBanco) {
		this.NomeDoBanco = NomeDoBanco;
		this.Contas = new ArrayList<>();
	}
	public List<Conta> getContas() {
		return Contas;
	}
	public String getNomeDoBanco() {
		return NomeDoBanco;
	}
	public void setContas(List<Conta> contas) {
	Contas = contas;
	}
	public void setNomeDoBanco(String nomeDoBanco) {
	NomeDoBanco = nomeDoBanco;
	}
	
	public void CriarConta(int NumeroDaConta, boolean Especial, double Limite, double Saldo ) {
		Conta conta = new Conta(NumeroDaConta, Especial, Limite, Saldo);
		
		Contas.add(conta);
	}
	public void ExcluirConta(int NumeroDaConta) {
		
		for(Conta c : Contas ) {
			if (c.getNumeroDaConta() == NumeroDaConta) {
				Contas.remove(c);
				break;
			}
		}
		}
		public Conta Filtrar(List<Conta> Contas, int NumeroDaConta){

	        for (Conta cc : Contas) {
	            if (NumeroDaConta == cc.getNumeroDaConta()) {
	            	return cc;
	            }
	}
			return null;
		
	}
		public void transferir(int numerodaconta, double valor, int numcontadestino) {
			boolean aprovado = false;
	        for (Conta cc : Contas) {
	            if (numerodaconta == cc.getNumeroDaConta() && cc.getSaldo() >= valor) {
	            	aprovado = true;
	            	cc.setSaldo(numcontadestino);
	            }
	}
	        if(aprovado) {
	        	for (Conta cc : Contas) {
	        		if (numcontadestino == cc.getNumeroDaConta()) {
	        			cc.Depositar(valor);
	        		}
	        	}
	        }
}
		public void emitirSaldo(int numerodaconta) {
			
	        for (Conta cc : Contas) {
	            if (numerodaconta == cc.getNumeroDaConta()) {
	            	System.out.println("O SALDO DESTA CONTA È" + cc.getSaldo());
	            }
	}
		}
		// definitivamente não fiquei com preguiça de escrever e não pedi pro chatgpt fazer esse metodo
		public void emitirExtrato(int numerodaconta) {
			 for (Conta cc : Contas) {
			        if (cc.getNumeroDaConta() == numerodaconta) {
			            System.out.println("===================================");
			            System.out.println("Extrato da Conta: " + cc.getNumeroDaConta());
			            System.out.println("Saldo atual: R$ " + cc.getSaldo());
			            System.out.println("===================================");
			            
			            if (cc.getMovimentacoes().isEmpty()) {
			                System.out.println("Nenhuma movimentação registrada.");
			            } else {
			                for (Movimentacao m : cc.getMovimentacoes()) {
			                    String tipo = m.getTipo().equalsIgnoreCase("C") ? "Crédito" : "Débito";
			                    System.out.println( m.getValor());
			                }
			            }

			            System.out.println("===================================");
			            return;
			        }
			    }

			    System.out.println("Conta não encontrada.");
			}
	public void showContas() {
		for(Conta cc : Contas) {
			System.out.println(cc.getNumeroDaConta());
		}
	}
	}

