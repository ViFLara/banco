package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.services.ContaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    private ContaService service;
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Conta findById(Long id) {
        return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Contas")
    public List<Conta> findAll() {
        return service.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Update Conta")
    public void update(Conta conta) {
        service.update(conta); }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Conta")
    public Conta createConta(Conta conta) {
        return service.createConta(conta);
    }

}
