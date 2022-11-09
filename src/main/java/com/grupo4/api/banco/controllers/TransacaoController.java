package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.services.TransacaoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private TransacaoService service;

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create List Transações")
    public void createTransacaoList(List<Transacao> transacoes) {
        service.createTransacaoList(transacoes);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Transacoes")
    public List<Transacao> findAll() {
        return service.findAll();
    }

}
