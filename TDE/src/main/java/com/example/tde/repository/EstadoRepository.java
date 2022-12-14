package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {
    
}
