package com.example.tde.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.joda.time.LocalDate;

import com.example.tde.enums.EstadoPagamento;

import java.util.Date;

@Entity
@Table(name="Pagamento_Boleto")
public class PagamentoBoleto extends Pagamento{

    private LocalDate dataVencimento;
    private LocalDate dataPagamento;

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public PagamentoBoleto(LocalDate dataVencimento, LocalDate dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoBoleto() {
    }
}
