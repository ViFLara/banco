package com.grupo4.api.banco.converter;

import com.grupo4.api.banco.controllers.dto.TransacaoDTO;
import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import org.springframework.stereotype.Component;


@Component
public class TransacaoConverter {

    public Transacao toModel(TransacaoDTO transacaoDTO) {
        return Transacao.builder()
                .quantia(transacaoDTO.getQuantia())
                .tipoTransacao(transacaoDTO.getTipoTransacao())
                .build();

    }
}
