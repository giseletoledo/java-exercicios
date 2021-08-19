package com.company;

public class Restaurante {
    private String nome;
    String localizacao;
    String cliente;
    float conta;

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getConta() {
        return conta;
    }

    private void setConta(float conta) {
        this.conta = conta;
    }

}
