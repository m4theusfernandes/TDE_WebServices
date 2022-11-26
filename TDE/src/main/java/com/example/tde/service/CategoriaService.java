package com.example.tde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tde.domain.Categoria;
import com.example.tde.error.NotFoundException;
import com.example.tde.repository.CategoriaRepository;

import antlr.collections.List;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id){
        return categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Categoria não encontrada. id="+id));
    }

    public void save(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void update(Categoria categoria){
        if(!categoriaRepository.existsById(categoria.getId())){
            throw new NotFoundException("Categoria não encontrada: id=" + categoria.getId());
        }
        categoriaRepository.saveAndFlush(categoria);
    }

    public void deletePorId(Integer id){
        if(!categoriaRepository.existsById(id)){
            throw new NotFoundException("Categoria não encontrada: id=" + id);
        }

        categoriaRepository.deleteById(id);
    }

    public java.util.List<Categoria> findAll() {
        return null;
    }



}
