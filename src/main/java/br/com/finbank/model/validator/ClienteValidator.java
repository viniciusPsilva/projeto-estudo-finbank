package br.com.finbank.model.validator;

import br.com.finbank.model.Cliente;
import br.com.finbank.model.enumerations.TipoCliente;

public class ClienteValidator {

    private int contadorDeErros = 0;

    public boolean validar(Cliente cliente){

        //TODO validar NOME deve ter no minimo 3 caracteres
        validaNome(cliente.getNome());

        //TODO validar email deve ter no minimo 5 caracteres

        //TODO validar senha deve ter no minimo 6 caracteres

        if (contadorDeErros!=0){
            return false;
        }

        return true;

    }

    public boolean validaNome(String nome){
       return true;
    }

    public boolean validaTipoCliente(String tipo){

        if (tipo.equalsIgnoreCase(TipoCliente.CLIENTE.getValor())) {
            return true;
        } else if (tipo.equalsIgnoreCase(TipoCliente.GERENTE.getValor())) {
            return true;
        }else {
            System.err.println("Tipo informado inválido, informe um tipo valido.");
            return false;
        }


    }

}
