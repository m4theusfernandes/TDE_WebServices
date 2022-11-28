package com.example.tde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tde.domain.Cliente;
import com.example.tde.domain.Endereco;
import com.example.tde.error.NotFoundException;
import com.example.tde.repository.ClienteRepository;

@Service
public class ClienteService {
    
  
    @Autowired
    ClienteRepository clienteRepository;

    private EnderecoService enderecoService;

    public Cliente findById(Integer id) {
        return this.clienteRepository.findById(id).get();
    }

    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    public void deletePorId(Integer id) {
        if(!clienteRepository.existsById(id)){
            throw new NotFoundException("Cliente não encontrado. id="+id);
        }

        clienteRepository.deleteById(id);
    }

    public void update(Cliente cliente) {
        if(!clienteRepository.existsById(cliente.getId())){
            throw new NotFoundException("Cliente não encontrado: id="+cliente.getId());
        }

        clienteRepository.saveAndFlush(cliente);
    }

    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Cliente updatePartial(Integer idCliente, Endereco endereco, Integer idEndereco){
        if(!clienteRepository.existsById(idCliente)){
            throw  new NotFoundException("Cliente não encontrado: id="+idCliente);
        }
        Cliente cliente = clienteRepository.findById(idCliente).get();
        endereco.setId(idEndereco);
        this.save(cliente);

        return cliente;
    }

}
