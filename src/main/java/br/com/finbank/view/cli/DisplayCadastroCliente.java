package br.com.finbank.view.cli;

import br.com.finbank.model.Cliente;
import br.com.finbank.model.enumerations.TipoCliente;
import br.com.finbank.model.validator.ClienteValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class DisplayCadastroCliente implements Display {
    @Override
    public void exibir() {
        System.out.println("===========================");
        System.out.println("Cadastro de clientes");
        System.out.println("===========================");

        Cliente cliente = solicitarInformacoesCLiente();

        //TODO cadastrar cliente no banco de dados

    }

    public Cliente solicitarInformacoesCLiente(){
        Cliente cliente = new Cliente();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        cliente.setNome(nome);

        System.out.print("Informa o email do cliente: ");
        String email = scanner.nextLine();
        cliente.setEmail(email);

        System.out.print("Informa a senha: ");
        String senha = scanner.nextLine();
        cliente.setSenha(senha);

        boolean tipoNaoValido = true;
        int tentativasDoClienteInformarTipo = 0;

        do{ //faça
            tentativasDoClienteInformarTipo += 1;

            System.out.print("Informa o Tipo do cliente [cliente , gerente]: ");
            String tipo = scanner.nextLine();

            ClienteValidator validator = new ClienteValidator();

            if (validator.validaTipoCliente(tipo)){
                cliente.setTipo(TipoCliente.of(tipo));
                tipoNaoValido = false;
            }


        }while (tipoNaoValido); //enquanto

        System.out.print("Informe o nascimento: ");
        String nascimento = scanner.nextLine();

        //TODO validar padrão de data informada pelo cliente, data aceita deve estar no padrão dd/mm/yyyy (19/09/2023)

        String[] informacaoNascimento = nascimento.split("/");

        int dia = Integer.parseInt(informacaoNascimento[0]);
        int mes = Integer.parseInt(informacaoNascimento[1]);
        int ano = Integer.parseInt(informacaoNascimento[2]);


        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        cliente.setNascimento(dataNascimento);

        System.out.print("Informe o documento: ");
        String documento = scanner.nextLine();
        cliente.setDocumento(documento);

        return cliente;
    }
}
