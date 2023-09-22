package br.com.finbank.model;

import br.com.finbank.model.enumerations.TipoCliente;

import java.time.LocalDate;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private int idade;
    private String email;
    private String senha;

    private LocalDate nascimento;

    //Enumeration (ENUM) permite criar uma variavel com valores restritos. [Cliente, Gerente]
    private TipoCliente tipo;
    private String documento;

    // Estrura de dados que permite criar um agrapamento ou lista de objetos.
    private List<Conta> contas;

    // Estrura de dados que permite criar um agrapamento ou lista de objetos.
    private List<Transferencia> transferencias;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {

        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        //TODO definir idade com base na data de nascimento
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(List<Transferencia> transferecias) {
        this.transferencias = transferecias;
    }

}
