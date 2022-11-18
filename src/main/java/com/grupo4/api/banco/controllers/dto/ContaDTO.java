package com.grupo4.api.banco.controllers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoConta;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContaDTO {
    private String agencia;

    private String numeroConta;

    private TipoConta tipoConta;

    private BigDecimal saldo;

    private Long idCliente;
}
