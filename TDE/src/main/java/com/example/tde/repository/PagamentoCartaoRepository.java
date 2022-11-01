package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.PagamentoCartao;

@Repository
public interface PagamentoCartaoRepository extends JpaRepository <PagamentoCartao, Long>{
    
}
