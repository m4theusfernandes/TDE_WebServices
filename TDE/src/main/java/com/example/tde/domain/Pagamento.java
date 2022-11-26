package com.example.tde.domain;

import com.example.tde.enums.EstadoPagamento;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private EstadoPagamento estado;

    @OneToOne(mappedBy = "pagamento")
    private Pedido pedido;

}
