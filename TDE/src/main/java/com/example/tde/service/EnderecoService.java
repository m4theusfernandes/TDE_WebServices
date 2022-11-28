package com.example.tde.service;

import com.example.tde.domain.Endereco;
import com.example.tde.error.NotFoundException;
import com.example.tde.repository.EnderecoRepository;

public class EnderecoService {
   
    private EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository){
        this.repository = repository;
    }

    public void deleteById(Endereco endereco){
        if (repository.existsById(endereco.getId()))
            throw new NotFoundException("Endereço não encontrado: id="+endereco.getId());
        repository.delete(endereco);
    }
}
