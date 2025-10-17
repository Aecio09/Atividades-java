package com.Paises;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private String nomeCapital;
	private double dimensao;
	private List<Pais> fazFronteira;
	
	public Pais(String nome, String nomeCapital, double dimensao) {
		this.nome = nome;
		this.nomeCapital = nomeCapital;
		this.dimensao = dimensao;
		this.fazFronteira = new ArrayList<>();
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNomeCapital(String nomeCapital) {
		this.nomeCapital = nomeCapital;
	}
	public String getNomeCapital() {
		return nomeCapital;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setFazFronteira(List<Pais> fazFronteira) {
		this.fazFronteira = fazFronteira;
	}
	public List<Pais> getFazFronteira() {
		return fazFronteira;
	}
	
	// area dos metodos, uma coisa que me da raiva é fazer metodo assim, seria muito melhor criar uma class apenas para o metodo
	
	public boolean eIngual(Pais pais2) {
		if(this.getNome().equals(pais2.getNome()) && this.getNomeCapital().equals(pais2.getNomeCapital())) {
			System.out.println("É O MESMO PAIS");
			return true;
		}
		return false;
	}
	public boolean criarFronteiras(Pais paisFronteira) {
		if (this.getNome().equals(paisFronteira.getNome()) && this.getNomeCapital().equals(paisFronteira.getNomeCapital())) {
			System.out.println("FRONTEIRA NÂO ADCIONADA È O MESMO PAIS");
			return false;
		}
		else {
			this.getFazFronteira().add(paisFronteira);
			System.out.println("FRONTEIRA ADCIONADA COM SUCESSO");
			return true;
		}
	}
	public String toString() {
		return nome;
	}
	public String listaFronteira() {
		return this.getFazFronteira().toString();
	}
	public String vizinhosComuns(Pais pais){
		List<Pais> paisEmComun = new ArrayList<>();
		
		for(Pais a : this.getFazFronteira()) {
			if(pais.getFazFronteira().contains(a)) {
				paisEmComun.add(a);
			}
		}
		return paisEmComun.toString();
	}
}














