package com.example.tde.enums;

public enum EstadoPagamento {
    APROVADO(0,"Aprovado"),
    REPROVADO(1,"Reprovado"),
    EM_ANALISE(2,"Em Análise");

    private Integer valor;
    private String nome;

    private EstadoPagamento (Integer valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    private EstadoPagamento(){

    }
}
