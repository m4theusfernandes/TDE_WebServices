package com.example.tde.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tde.domain.Categoria;
import com.example.tde.domain.model_assembler.CategoriaModelAssembler;
import com.example.tde.service.CategoriaService;

@RestController
@RequestMapping("/example/tde/categoria")
public class CategoriaResource {
    
    @Autowired
    private CategoriaService categoriaService;

    private CategoriaModelAssembler CategoriaModelAssembler;

    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<Categoria>>> obterTodasCategorias(){
        List<Categoria> categoria = categoriaService.findAll();
        if(categoria.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EntityModel<Categoria>> listaEntityModels= new ArrayList<>();
        
        listaEntityModels.addAll(categoria.stream().map(CategoriaModelAssembler::toModel).toList());

        CollectionModel<EntityModel<Categoria>> collectionModel;
        collectionModel = CollectionModel.of(listaEntityModels);
  

        return ResponseEntity.ok(collectionModel);

    }

    private Object linkTo(ResponseEntity<CollectionModel<EntityModel<Categoria>>> obterTodasCategorias) {
        return null;
    }

    private CategoriaResource methodOn(Class<CategoriaResource> class1) {
        return null;
    }

    public Class<?> obterPorId(Long id) {
        return null;
    }
    
}
