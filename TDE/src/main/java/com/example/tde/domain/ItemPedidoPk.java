package com.example.tde.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedidoPk{

    @ManyToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;
    

    @ManyToOne
    @JoinColumn(name="prod_id")
    private Produto produto;
}