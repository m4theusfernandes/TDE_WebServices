package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {
    
}
