package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
    
}
