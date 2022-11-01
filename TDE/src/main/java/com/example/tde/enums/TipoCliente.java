package com.example.tde.enums;

public enum TipoCliente {
    PESSOAFISICA(0,"Pessoa Fisica"),
    PESSOAJURIDICA(1,"Pessoa Juridica"),
    EM_ANALISE();

    private Integer valor;
    private String nome;

    TipoCliente() {
    }

    TipoCliente(Integer valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }






}
