package com.example.tde.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="cli_id")
    private Cliente cliente;

    @DateTimeFormat
    @NotNull
    private Date instante;

    @OneToMany
    private Collection<ItemPedido> itemPedido;


    @ManyToOne
    @JoinColumn(name = "cli_id")
    private List<Cliente> clientes;


    public Pedido() {
    }

    public Pedido(Integer id, Date instante) {
        this.id = id;
        this.instante = instante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }
}
