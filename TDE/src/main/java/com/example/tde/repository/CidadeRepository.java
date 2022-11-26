package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Integer> {
    
}
