package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.services.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    ClienteService service;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente findById(Long id) {
        return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Clientes")
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Update Cliente")
    public void update(Cliente cliente) {
        service.update(cliente); }


    //get
    //post
    //put
    //delete
}
