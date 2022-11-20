package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.controllers.dto.TransacaoDTO;
import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.converter.TransacaoConverter;
import com.grupo4.api.banco.services.ContaService;
import com.grupo4.api.banco.services.TransacaoService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TransacaoController {

    private TransacaoService service;
    private ContaService contaService;
    private TransacaoConverter transacaoConverter;

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create List Transações")
    public void createTransacaoList(@Valid @RequestBody List<Transacao> transacoes) throws ChangeSetPersister.NotFoundException{
        service.createTransacaoList(transacoes);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Transacoes")
    public List<Transacao> findAll() throws ChangeSetPersister.NotFoundException {
        return service.findAll();
    }

    @PostMapping("/deposito")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Depósitos")
    public Transacao deposit(@Valid  @RequestBody TransacaoDTO transacaoDTO) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException{
        Transacao transacao = transacaoConverter.toModel(transacaoDTO);
        transacao.setContaDestino(contaService.findByAgenciaNumeroContaETipo(
                transacaoDTO.getAgencia(),
                transacaoDTO.getNumeroConta(),
                transacaoDTO.getTipoConta()));
        return service.deposit(transacao);
    }

    @PostMapping("/transfer/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Transacoes")
    public Transacao transfer(@Valid @PathVariable Long id, @RequestBody TransacaoDTO transacaoDTO)
            throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException {
        Transacao transacao = transacaoConverter.toModel(transacaoDTO);
        transacao.setContaOrigem(contaService.findById(id).get());
        transacao.setContaDestino(contaService
                .findByAgenciaNumeroContaETipo(
                        transacaoDTO.getAgencia(),
                        transacaoDTO.getNumeroConta(),
                        transacaoDTO.getTipoConta()));

        return service.transfer(transacao);

    }
}
