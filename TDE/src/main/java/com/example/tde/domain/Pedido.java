package com.example.tde.domain;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate instante;

    @OneToOne
    @JoinColumn(name = "pag_id")
    private Pagamento pagamento;

    @OneToMany(mappedBy = "id.pedido")
    private List<ItemPedido> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInstante() {
        return instante;
    }

    public void setInstante(LocalDate instante) {
        this.instante = instante;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Pedido(Integer id, LocalDate instante, Pagamento pagamento, List<ItemPedido> itens) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
        this.itens = itens;
    }

    public Pedido() {
    }
}
