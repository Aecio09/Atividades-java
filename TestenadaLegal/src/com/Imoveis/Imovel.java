package com.Imoveis;

public class Imovel {
    private String Nome;
    private int Andares;
    private int AptPorAndares;
    private String Endereco;
    private double Area;
    private int Quartos;
    private int Banheiros;
    private int VagasGaragem;
    private String Possui;

    public int getAptPorAndares() {
        return AptPorAndares;
    }
    public double getArea() {
        return Area;
    }
    public int getBanheiros() {
        return Banheiros;
    }
    public String getEndereco() {
        return Endereco;
    }
    public int getQuartos() {
        return Quartos;
    }
    public String getNome() {
        return Nome;
    }
    public int getAndares() {
        return Andares;
    }
    public int getVagasGaragem() {
        return VagasGaragem;
    }
    public String getPossui() {
        return Possui;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setAndares(int andares) {
        Andares = andares;
    }
    public void setVagasGaragem(int vagasGaragem) {
        VagasGaragem = vagasGaragem;
    }
    public void setPossui(String possui) {
        Possui = possui;
    }
    public void setAptPorAndares(int aptPorAndares) {
        AptPorAndares = aptPorAndares;
    }
    public void setArea(double area) {
        Area = area;
    }
    public void setBanheiros(int banheiros) {
        Banheiros = banheiros;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public void setQuartos(int quartos) {
        Quartos = quartos;
    }
}
