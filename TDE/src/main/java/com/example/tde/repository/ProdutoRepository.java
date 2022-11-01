package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    
}
