package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.controllers.dto.ContaDTO;
import com.grupo4.api.banco.converter.ContaConverter;
import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.services.ContaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService service;

    @Autowired
    private ContaConverter contaConverter;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Conta> findById(@PathVariable Long id) {
        return service.findById(id); //feito
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Contas")
    public List<Conta> findAll() {
        return service.findAll();
    } //feito

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Update Conta")
    public void update(@RequestBody Conta conta) {
        service.update(conta);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Conta")
    public Conta createConta(@RequestBody ContaDTO contaDTO) {
        Conta conta = contaConverter.toModel(contaDTO);
        return service.createConta(conta);
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Conta")
    public void createContaList(@RequestBody List<Conta> contas) {
        service.createContaList(contas); //feito
    }
}