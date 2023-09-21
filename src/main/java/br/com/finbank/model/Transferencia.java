package br.com.finbank.model;

public class Transferencia {

    // Atributos
    private Long idTransferencia;
    private Long idContaPagador;
    private Long idContaRecebedor;

    //construtor padrão
    public Transferencia() {

    }
    // construtor com Atributos

    public Transferencia(Long idTransferencia, Long idContaPagador, Long idContaRecebedor) {
        this.idTransferencia = idTransferencia;
        this.idContaPagador = idContaPagador;
        this.idContaRecebedor = idContaRecebedor;
    }

    // Me
    // Métodos de acesso e modificação

    public Long getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Long idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public Long getIdContaPagador() {
        return idContaPagador;
    }

    public void setIdContaPagador(Long idContaPagador) {
        this.idContaPagador = idContaPagador;
    }

    public Long getIdContaRecebedor() {
        return idContaRecebedor;
    }

    public void setIdContaRecebedor(Long idContaRecebedor) {
        this.idContaRecebedor = idContaRecebedor;
    }
}

