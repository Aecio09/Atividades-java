package com.Imoveis;

import java.util.Scanner;

public class Gerenciador {

    Scanner scanner = new Scanner(System.in);
    AddImovel addImovel = new AddImovel();  
    ViewImoveis view = new ViewImoveis(); 
    boolean VerdadeiroOuFalso = true;

    public void inicio () {
        while (VerdadeiroOuFalso) { 
            System.out.println("==========================");
            System.out.println("Oque voce dejesa?");
            System.out.println("1 para Criar um Imovel");
            System.out.println("2 para ver os imoveis");
            System.out.println("4 para encerrar");
            System.out.println("==========================");
            int Opcao = scanner.nextInt();

            if (Opcao == 1) {
                addImovel.addimovel();
            }
            else if (Opcao == 2) {
                view.Opcao(addImovel.getImoveis());
            }
            else if (Opcao == 4) {
                System.out.println("Muito obrigado por usar nosso sistema");
                VerdadeiroOuFalso = false;
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}
