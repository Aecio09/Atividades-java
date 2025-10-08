package com.Imoveis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddImovel {

    private Scanner scanner;
    private List<Imovel> imoveis;
    
    public AddImovel() {
        scanner = new Scanner(System.in);
        imoveis = new ArrayList<>();
    }

public Imovel preencherImovel() {
    Imovel imovel = new Imovel();

    System.out.print("Nome do Imóvel: ");
    imovel.setNome(scanner.nextLine());
    System.out.print("Número de andares: ");
    imovel.setAndares(scanner.nextInt());
    System.out.print("Apartamentos por andar: ");
    imovel.setAptPorAndares(scanner.nextInt());
    scanner.nextLine();
    System.out.print("Endereço: ");
    imovel.setEndereco(scanner.nextLine());
    System.out.print("Área (em m²): ");
    imovel.setArea(scanner.nextDouble());
    System.out.print("Quantidade de quartos: ");
    imovel.setQuartos(scanner.nextInt());
    System.out.print("Quantidade de banheiros: ");
    imovel.setBanheiros(scanner.nextInt());
    System.out.print("Vagas de garagem: ");
    imovel.setVagasGaragem(scanner.nextInt());
    scanner.nextLine();
    System.out.print("Possui algo especial (ex: piscina, elevador, etc): ");
    imovel.setPossui(scanner.nextLine());
    System.out.println("\n Imóvel cadastrado com sucesso!\n");

    return imovel;
}
    
    public  void addimovel(){
        Imovel imovel = preencherImovel();
        imoveis.add(imovel);
        System.out.println("Imóvel adicionado Total: " + imoveis.size());
    }
    
    public List<Imovel> getImoveis() {
        return imoveis;
    }
    
}
