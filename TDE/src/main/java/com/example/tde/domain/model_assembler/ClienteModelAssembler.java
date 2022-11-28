package com.example.tde.domain.model_assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import com.example.tde.domain.Cliente;
import com.example.tde.resource.ClienteResouce;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class ClienteModelAssembler implements RepresentationModelAssembler<Cliente, EntityModel <Cliente>> {


    @Override
    public EntityModel<Cliente> toModel(Cliente cliente) {

        EntityModel<Cliente> entityModelCliente = EntityModel.of(cliente);

        entityModelCliente.add( linkTo(methodOn(ClienteResouce.class).obterPorId(cliente.getId())).withSelfRel());

        entityModelCliente.add( linkTo(methodOn(ClienteResouce.class).obterTodos()).withRel(IanaLinkRelations.COLLECTION));

        entityModelCliente.add( linkTo(methodOn(ClienteResouce.class).atualizarEnderecoDoCliente(cliente.getId(),null, null)).withRel("endereços"));
        return entityModelCliente;
    }

}
