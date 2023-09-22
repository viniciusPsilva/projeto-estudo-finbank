package br.com.finbank.model.enumerations;

import br.com.finbank.model.exception.TipoClienteNaoExisteException;

public enum TipoCliente {
    GERENTE("gerente"),
    CLIENTE("cliente");
    private String valor;
    TipoCliente(String valor) {
        this.valor = valor;
    }
    public String getValor(){
        return valor;
    }

    public static TipoCliente of(String tipo){
        if (tipo.equalsIgnoreCase(CLIENTE.getValor())){
            return TipoCliente.CLIENTE;
        } else if (tipo.equalsIgnoreCase(GERENTE.getValor())) {
            return TipoCliente.GERENTE;
        }

        throw new TipoClienteNaoExisteException("Tipo cliente informado não existe");
    }



}
