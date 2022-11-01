package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Long> {
    
}
