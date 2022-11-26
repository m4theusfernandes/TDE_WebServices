package com.example.tde.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ItemPedidoPk implements Serializable {

    private static final long serialVersionUID = 4413390854328120134L;

    @ManyToOne
    @JoinColumn(name = "ped_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Produto produto;

    public ItemPedidoPk() {
    }

    public ItemPedidoPk(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
    }


    public Pedido getPedido() {
        return pedido;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}