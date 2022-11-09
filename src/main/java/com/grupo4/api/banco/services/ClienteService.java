package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Cliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteService {

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
        return cliente;
    }
     public void deleteById( Long id){

     }
}
