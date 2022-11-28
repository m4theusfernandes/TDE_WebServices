package com.example.tde.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tde.domain.Produto;
import com.example.tde.error.NotFoundException;
import com.example.tde.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    
    @Autowired
    ProdutoRepository produtoRepository;

    public Produto findById(Integer id) {
        return produtoRepository.findById(id).get();
    }

    public List<Produto> findAll() {
        return this.produtoRepository.findAll();
    }

    public void deletePorId(Integer id) {
        if(!produtoRepository.existsById(id)){
            throw new NotFoundException("Cliente não encontrado. id="+id);
        }

        produtoRepository.deleteById(id);
    }

}
