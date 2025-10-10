package com.Imoveis;

import java.util.List;
import java.util.Scanner;

public class ViewImoveis {

    private Scanner scanner;
    private List<Imovel> imoveis;

    public ViewImoveis() {
        scanner = new Scanner(System.in);
    }

    public void Opcao (List<Imovel> imoveis){
        this.imoveis = imoveis;
        System.out.println("==========================");
        System.out.println("Bem vindo a view");
        System.out.println("oque voce deseja?");
        System.out.println("1 para ver imoveis");
        System.out.println("2 para deletar");
        System.out.println("3 para modificar");
        System.out.println("4 para buscar por nome");
        System.out.println("==========================");
        int selecionado = scanner.nextInt();

        if (selecionado == 1) {
            Viewimoveis(imoveis);
        }
        if (selecionado == 2) {
            DeletarImoveis(imoveis);
        }
        if (selecionado == 3) {
            ModificarImovel(imoveis);
        }
        if (selecionado == 4) {
        	Filtrar(imoveis);
        }
//        if (selecionado != 1 || selecionado != 2 || selecionado != 3) {
//            System.out.println("tente outro pai");
//        }

    }

    public void Viewimoveis(List<Imovel> imoveis){
        if (imoveis == null || imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado ainda.");
            return;
        }
        
        for (Imovel imovel : imoveis) {
            System.out.println("Numero de index = " + imoveis.indexOf(imovel));
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
    public void DeletarImoveis(List<Imovel> imoveis){
        if (imoveis == null || imoveis.isEmpty()) {
            System.out.println("NÂO A NADA PARA DELETAR SEU ARROMBADO");
            return;
        }
        System.out.println("==========================");
        System.out.println("Oque voce deseja deletar?");
        System.out.println("==========================");
        int IndiceDesejado = scanner.nextInt();

        imoveis.remove(IndiceDesejado);
    }
    public void ModificarImovel(List<Imovel> imoveis){
        if (imoveis == null || imoveis.isEmpty()) {
            System.out.println("NÂO A NADA PARA MODIFICAR");
            return;
        }
        System.out.println("==========================");
        System.out.println("Qual voce deseja modificar?");
        System.out.println("==========================");
        int IndiceDesejado = scanner.nextInt();
        scanner.nextLine();
        Imovel imovel = imoveis.get(IndiceDesejado);

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
    }
    public void Filtrar(List<Imovel> imoveis){
        System.out.println("==========================");
        System.out.println("Qual Imovel voce deseja encontrar?");
        System.out.println("Digite o nome do imovel");
        System.out.println("==========================");
        String NomeDesejado = scanner.next();

        for (Imovel imovel : imoveis) {
            if (NomeDesejado.equals(imovel.getNome())) {
                
            
        System.out.println("Numero de index = " + imoveis.indexOf(imovel));
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
 }