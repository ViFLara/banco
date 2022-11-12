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
    }//feito



    //@Transactional(readOnly = true)
    public List<Cliente> findAll() { //feito
        return clienteRepository.findAll();
    }

    public void update(Cliente cliente){ // feito
        clienteRepository.save(cliente);
    }

    public void createClienteList(List<Cliente> clientes){ // feito
        clienteRepository.saveAll(clientes); //feito

    }
    public Cliente createCliente(Cliente cliente){ //feito
        return  clienteRepository.save(cliente);
    }//feito

     public void deleteById( Long id){
        clienteRepository.deleteById(id); //feito
     }
}
