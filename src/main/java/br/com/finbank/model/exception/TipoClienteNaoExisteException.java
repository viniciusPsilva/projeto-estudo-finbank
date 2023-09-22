package br.com.finbank.model.exception;

public class TipoClienteNaoExisteException extends RuntimeException{

    String mensagem;

    public TipoClienteNaoExisteException(String message) {
        super(message);
        this.mensagem = message;
    }
}
