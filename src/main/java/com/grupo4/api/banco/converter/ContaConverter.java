package com.grupo4.api.banco.converter;

import com.grupo4.api.banco.controllers.dto.ContaDTO;
import com.grupo4.api.banco.entities.Cliente;
import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.enums.StatusContaEnum;
import com.grupo4.api.banco.services.ClienteService;
import com.grupo4.api.banco.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContaConverter {

    @Autowired
    private ClienteService clienteService;
    public Conta toModel(ContaDTO contaDTO){
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
