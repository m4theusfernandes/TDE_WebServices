package com.example.tde.domain;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class ItemPedido {

    @EmbeddedId
    private ItemPedidoPk id;

    public ItemPedido(Pedido pedido, Produto produto) {
        this.id = new ItemPedidoPk(pedido, produto);
    }

    public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantidade, Double preco) {
        this.id = new ItemPedidoPk(pedido, produto);

        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido() {

    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto(){
        return this.id.getProduto();
    }

    public Pedido getPedido(){
        return this.id.getPedido();
    }
}