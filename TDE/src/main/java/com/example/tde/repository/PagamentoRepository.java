package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {
    
}
