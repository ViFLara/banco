package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.services.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente findById(@PathVariable Long id) {
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
    public void update(@RequestBody Cliente cliente) {
        cliente.setCpf("12345678901");
        cliente.setNome("Ana");
        //service.update(cliente);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("New Cliente")
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return service.createCliente(cliente);
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(" Cliente")
    public void createClienteList(@RequestBody List<Cliente> clientes) {
        service.createClienteList(clientes);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete Cliente")
    public void deleteById (Long id) {
        service.deleteById(id);
    }

}
