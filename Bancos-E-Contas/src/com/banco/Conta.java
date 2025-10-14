package com.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
	private int NumeroDaConta;
	private double Saldo;
	private boolean Especial;
	private double Limite;
	private ArrayList<Movimentacao> movimentacoes;
	
	public Conta(int NumeroDaConta, boolean Especial, double Limite, double Saldo) {
		this.NumeroDaConta = NumeroDaConta;  
	    this.Especial = Especial;            
	    this.Limite = Limite;                
	    this.Saldo = Saldo;   
	    movimentacoes = new ArrayList<>();
	}
	public ArrayList<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(ArrayList<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	public double getLimite() {
		return Limite;
	}
	public void setLimite(int limite) {
		Limite = limite;
	}
	public int getNumeroDaConta() {
		return NumeroDaConta;
	}
	public double getSaldo() {
		return Saldo;
	}
	public boolean isEspecial() {
		return Especial;
	}
	public void setEspecial(boolean especial) {
		Especial = especial;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		NumeroDaConta = numeroDaConta;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public void Transferencia(Conta Destino, double valor) {
        if(this.Saldo >= valor) {
            this.Saldo -= valor;
            Destino.Saldo += valor;
            System.out.println("Transferencia feita com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
		
	}
	
	public void Depositar(double valor) {
		this.Saldo += valor;
		
		AdicionarMovimentacao(new Movimentacao("c", valor, LocalDate.now().toString()));
	}
	public void AdicionarMovimentacao(Movimentacao mov) {
		movimentacoes.add(mov);
	}
	public void CriarExtrato() {
		System.out.println("Extrato da conta " + this.NumeroDaConta + ":");
		for (Movimentacao mov : movimentacoes) {
			System.out.println(mov);
		}
		System.out.println("Saldo atual: " + this.Saldo);
	}
}
