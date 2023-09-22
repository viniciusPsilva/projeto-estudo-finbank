package br.com.finbank.view.cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayMenuInicial implements Display{

    @Override
    public void exibir() {
        List<String> opcoesMenu = new ArrayList<>();

        opcoesMenu.add("[ 0 ] - Sair");
        opcoesMenu.add("[ 1 ] - login");
        opcoesMenu.add("[ 2 ] - cadastrar cliente");

        System.out.println("=======================================");
        System.out.println("Olá Bem Vindo ao FinBank");
        System.out.println("=======================================");

        Boolean exibindoMenu = true;

        Scanner scanner = new Scanner(System.in);

        while (exibindoMenu) {

            for (String op : opcoesMenu) {
                System.out.println(op);
            }


            System.out.print("Escolha uma opção para operar: ");
            String opcaoEscolhida = scanner.next();

            switch (opcaoEscolhida) {
                case "0":
                    exibindoMenu = false;
                    System.out.println("Fechando o Programa...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Até Breve!!!");
                    exibindoMenu = false;
                    break;
                case "1":
                    DisplayLogin displayLogin = new DisplayLogin();
                    displayLogin.exibir();
                    exibindoMenu = false;
                    break;
                case "2":
                    DisplayCadastroCliente displayCadastroCliente = new DisplayCadastroCliente();
                    displayCadastroCliente.exibir();
                    exibindoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida, selecione um opção válida!!!");
                    break;

            }


        }
    }
}
