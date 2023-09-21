package br.com.finbank.model;

import java.math.BigDecimal;

public class Conta {


    // Atributos
    private Long idConta;
    private BigDecimal saldo;
    private boolean isAtiva;
    private String numero;
    private String agencia;

    // Construtor padrãp
    public Conta(){

    }

    // Construtor com argumentos
    public Conta(Long idConta, BigDecimal saldo, boolean isAtiva, String numero, String agencia) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.isAtiva = isAtiva;
        this.numero = numero;
        this.agencia = agencia;
    }

    // Metodos de acesso e modificação
    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean ativa) {
        isAtiva = ativa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
