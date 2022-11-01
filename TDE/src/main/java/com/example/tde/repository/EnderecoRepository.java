package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tde.domain.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, Long>{
    
}
