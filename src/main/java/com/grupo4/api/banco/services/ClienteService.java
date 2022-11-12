package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //@Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
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
        return  clienteRepository.save(cliente);
    }

     public void deleteById( Long id){

     }
}
