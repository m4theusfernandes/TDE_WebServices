package com.example.tde.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String nome;

    @ManyToOne
    @JoinColumn( name = "est_cidade")
    private Estado estado;

    public Cidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cidade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
