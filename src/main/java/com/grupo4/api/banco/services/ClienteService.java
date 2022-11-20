package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) throws ChangeSetPersister.NotFoundException {verifyIfExists(id); return clienteRepository.findById(id);}//feito

    @Transactional(readOnly = true)
    public List<Cliente> findAll() { //feito
        return clienteRepository.findAll();
    }

    public void update(Cliente cliente){ // feito
        clienteRepository.save(cliente);
    }

    public void createClienteList(List<Cliente> clientes){
        clienteRepository.saveAll(clientes);
    }

    public Cliente createCliente(Cliente cliente){ //feito
        return  clienteRepository.save(cliente);
    }

     public void deleteById( Long id) throws ChangeSetPersister.NotFoundException {
         verifyIfExists(id);
        clienteRepository.deleteById(id);
     }

    private void verifyIfExists(Long id) throws ChangeSetPersister.NotFoundException {
        clienteRepository.findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }
}
