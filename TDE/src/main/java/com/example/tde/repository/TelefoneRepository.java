package com.example.tde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tde.domain.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository <Telefone, Long>{
    
}
