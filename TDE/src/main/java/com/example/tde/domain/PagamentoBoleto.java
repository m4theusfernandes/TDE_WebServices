package com.example.tde.domain;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PagamentoBoleto {
    @NotNull
    private Date dataPagamento;

    @NotNull
    private Date dataVencimento;

    public PagamentoBoleto() {
    }

    public PagamentoBoleto(Date dataPagamento, Date dataVencimento) {
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
