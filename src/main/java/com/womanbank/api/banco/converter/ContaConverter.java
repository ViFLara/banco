package com.womanbank.api.banco.converter;

import com.womanbank.api.banco.controllers.dto.ContaDTO;
import com.womanbank.api.banco.entities.Conta;
import com.womanbank.api.banco.enums.StatusContaEnum;
import com.womanbank.api.banco.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

@Component
public class ContaConverter {

    @Autowired
    private ClienteService clienteService;
    public Conta toModel(ContaDTO contaDTO) throws ChangeSetPersister.NotFoundException {
        return Conta.builder()
                .agencia(contaDTO.getAgencia())
                .numeroConta(contaDTO.getNumeroConta())
                .saldo(contaDTO.getSaldo())
                .statusConta(StatusContaEnum.A)
                .tipoConta(contaDTO.getTipoConta())
                .cliente(clienteService.findById(contaDTO.getIdCliente()).get())
                .build();
    }
}
