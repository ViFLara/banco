package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //@Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return new Cliente();
    }

    //@Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return null;
    }

    public void update(Cliente cliente){
    }

    public void createClienteList(List<Cliente> clientes){

    }
    public Cliente createCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }
     public void deleteById( Long id){

     }
}
