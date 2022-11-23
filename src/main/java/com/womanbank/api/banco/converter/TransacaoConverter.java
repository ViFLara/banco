package com.womanbank.api.banco.converter;

import com.womanbank.api.banco.controllers.dto.TransacaoDTO;
import com.womanbank.api.banco.entities.Transacao;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class TransacaoConverter {

    public Transacao toModel(TransacaoDTO transacaoDTO) {
        return Transacao.builder()
                .quantia(transacaoDTO.getQuantia())
                .tipoTransacao(transacaoDTO.getTipoTransacao())
                .dataCriacao(LocalDate.now())
                .build();

    }
}
