package com.example.tde;


import com.example.tde.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tde.domain.Cidade;
import com.example.tde.domain.Cliente;
import com.example.tde.domain.Endereco;
import com.example.tde.domain.Estado;
import com.example.tde.enums.TipoCliente;

@SpringBootApplication
public class TdeApplication implements CommandLineRunner {

    @Autowired
    EstadoRepository estadoRepository;

    @Autowired
    CidadeRepository cidadeRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TdeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        // TODO Auto-generated method stub
//
//        Cliente cli1 = new Cliente((long) 1,"Joaneide","joaneid@teste.com","78978978978",
//         TipoCliente.PESSOAFISICA,"9898989898989898");
//
//
//        Endereco end1 = new Endereco("Avenida","1","Quadra 12 lt 28", "Joaneidense","74474330");
//        Cidade cid1 = new Cidade(1,"Avenida Leste Norte");
//        Estado est1 = new Estado(1,"Go");

    }

}
