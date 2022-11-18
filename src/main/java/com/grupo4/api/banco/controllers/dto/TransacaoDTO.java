package com.grupo4.api.banco.controllers.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoConta;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransacaoDTO {

    private String agencia;

    private String numeroConta;

    private TipoConta tipoConta;

    private BigDecimal quantia;
}
