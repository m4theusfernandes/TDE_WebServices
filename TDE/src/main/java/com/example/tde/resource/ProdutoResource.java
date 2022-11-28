package com.example.tde.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.tde.domain.Produto;
import com.example.tde.service.ProdutoService;

@RestController
@RequestMapping("/example/tde/produto")
public class ProdutoResource {
    
    ProdutoService produtoService;

    public ProdutoResource(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> obterPorId(@PathVariable("id") Integer id) {
        Produto produto = this.produtoService.findById(id);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping("/")
    public ResponseEntity<List<Produto>> obterTodos() {
        List<Produto> produtos = this.produtoService.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarClientePorId(@PathVariable("id") Integer id) {
        produtoService.deletePorId(id);
        return ResponseEntity.noContent().build();
    }
    
}
