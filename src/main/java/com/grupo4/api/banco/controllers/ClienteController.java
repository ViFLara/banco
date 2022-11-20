package com.grupo4.api.banco.controllers;

import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.services.ClienteService;
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
@RequestMapping("/clientes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {

    private ClienteService service;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> findById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Find all Clientes")
    public List<Cliente> findAll() throws ChangeSetPersister.NotFoundException {
        return service.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Update Cliente")
    public void update(@Valid @RequestBody Cliente cliente) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException  {
        service.update(cliente);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("New Cliente")
    public Cliente createCliente(@Valid @RequestBody Cliente cliente) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException {
        return service.createCliente(cliente);
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Cliente")
    public void createClienteList(@Valid @RequestBody List<Cliente> clientes) throws ChangeSetPersister.NotFoundException, MethodArgumentNotValidException {
        service.createClienteList(clientes);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete Cliente")
    public void deleteById (@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        service.deleteById(id);
    }

}
