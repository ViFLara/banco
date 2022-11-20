package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.controllers.dto.ContaDTO;
import com.grupo4.api.banco.converter.ContaConverter;
import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.services.ContaService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contas")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ContaController {

    private ContaService service;
    private ContaConverter contaConverter;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Conta> findById(@PathVariable Long id)
            throws ChangeSetPersister.NotFoundException {return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Contas")
    public List<Conta> findAll() throws ChangeSetPersister.NotFoundException {
        return service.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Update Conta")
    public void update(@Valid @RequestBody Conta conta) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException{
        service.update(conta);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Conta")
    public Conta createConta(@Valid @RequestBody ContaDTO contaDTO)
            throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException {
        Conta conta = contaConverter.toModel(contaDTO);
        return service.createConta(conta);
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Conta")
    public void createContaList(@Valid @RequestBody List<Conta> contas) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException {
        service.createContaList(contas);
    }
}