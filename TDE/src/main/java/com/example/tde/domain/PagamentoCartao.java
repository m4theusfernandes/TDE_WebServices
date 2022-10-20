package com.example.tde.domain;

import javax.validation.constraints.NotNull;

public class PagamentoCartao {

    @NotNull
    private Integer numeroDeParcelas;


    public PagamentoCartao() {
    }

    public PagamentoCartao(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
