package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.controllers.dto.TransacaoDTO;
import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.converter.TransacaoConverter;
import com.grupo4.api.banco.services.ContaService;
import com.grupo4.api.banco.services.TransacaoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @Autowired
    private ContaService contaService;

    @Autowired
    private TransacaoConverter transacaoConverter;

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create List Transações")
    public void createTransacaoList(@RequestBody List<Transacao> transacoes) {
        service.createTransacaoList(transacoes);
    } //feito

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Transacoes")
    public List<Transacao> findAll() {
        return service.findAll();
    } // feito

    @PostMapping("/deposito")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Depósitos")
    public Transacao deposito(@RequestBody TransacaoDTO transacaoDTO) {
        Transacao transacao = transacaoConverter.toModel(transacaoDTO);
        transacao.setContaDestino(contaService.findByAgenciaNumeroContaETipo(
                transacaoDTO.getAgencia(),
                transacaoDTO.getNumeroConta(),
                transacaoDTO.getTipoConta()));
        return service.deposito(transacao);
    }

}
