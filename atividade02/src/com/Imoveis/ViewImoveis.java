package com.Imoveis;

import java.util.List;

public class ViewImoveis {

    public void Viewimoveis(List<Imovel> imoveis){
        if (imoveis == null || imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado ainda.");
            return;
        }
        
        for (Imovel imovel : imoveis) {
            System.out.println("Nome: " + imovel.getNome());
            System.out.println("Endereço: " + imovel.getEndereco());
            System.out.println("Andares: " + imovel.getAndares());
            System.out.println("Apt por andar: " + imovel.getAptPorAndares());
            System.out.println("Área: " + imovel.getArea() + " m²");
            System.out.println("Quartos: " + imovel.getQuartos());
            System.out.println("Banheiros: " + imovel.getBanheiros());
            System.out.println("Vagas: " + imovel.getVagasGaragem());
            System.out.println("Possui: " + imovel.getPossui());
            System.out.println("------------------------");
        }
    }
}
