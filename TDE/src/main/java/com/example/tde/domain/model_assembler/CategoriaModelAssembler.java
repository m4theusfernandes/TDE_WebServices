package com.example.tde.domain.model_assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import javax.persistence.Entity;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import com.example.tde.domain.Categoria;
import com.example.tde.resource.CategoriaResource;


public class CategoriaModelAssembler implements RepresentationModelAssembler<Categoria, EntityModel<Categoria>>{

    @Override
    public EntityModel<Categoria> toModel(Categoria categoria){
        EntityModel<Categoria> entityModelCategoria = EntityModel.of(categoria);

        entityModelCategoria.add( linkTo(methodOn(CategoriaResource.class).obterPorId(categoria.getId())).withSelfRel());

        return entityModelCategoria;
    }
    
}
