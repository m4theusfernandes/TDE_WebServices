package com.example.tde.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tde.domain.Categoria;
import com.example.tde.domain.Cliente;
import com.example.tde.domain.Endereco;
import com.example.tde.service.ClienteService;
import com.example.tde.domain.model_assembler.ClienteModelAssembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/example/tde/cliente")
public class ClienteResouce {
    
    private ClienteModelAssembler clienteModelAssembler;

    ClienteService clienteService;

    public ClienteResouce (ClienteService clienteService){
        this.clienteService = clienteService;

    }

    @GetMapping("/id")
    public ResponseEntity<Cliente> obterPorId(@PathVariable("id")Integer id){
        Cliente cliente = this.clienteService.findById(id);
        return ResponseEntity.ok().body(cliente);
    }

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> obterTodos() {
        List<Cliente> produtos = this.clienteService.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarClientePorId(@PathVariable("id") Integer id) {
        clienteService.deletePorId(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<EntityModel<Cliente>> atualizarCliente(@RequestBody Cliente cliente) {
        clienteService.findById(cliente.getId());
        clienteService.update(cliente);

        EntityModel<Cliente> entityModelCliente = clienteModelAssembler.toModel(cliente);

        return ResponseEntity.ok(entityModelCliente);
    }

    @PostMapping
    public ResponseEntity<EntityModel<Cliente>> saveCliente(@RequestBody @Valid Cliente cliente, HttpServletRequest request) {

        clienteService.save(cliente);

        URI uri = linkTo(methodOn(ClienteResouce.class).obterPorId(cliente.getId())).withSelfRel().toUri();

        EntityModel<Cliente> entityModelCliente = clienteModelAssembler.toModel(cliente);
        
        return ResponseEntity.created(uri).body(entityModelCliente);
    }

    @PatchMapping("/{id}/endereco")
    public ResponseEntity<EntityModel<Cliente>> atualizarEnderecoDoCliente (@PathVariable("id") Integer idCliente, Endereco endereco, Integer idEndereco) {
       Cliente cliente = clienteService.updatePartial(idCliente,endereco,idEndereco);

        EntityModel<Cliente> entityModelCliente = clienteModelAssembler.toModel(cliente);

        return ResponseEntity.ok(entityModelCliente);
    }


}
