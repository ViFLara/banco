package com.grupo4.api.banco.controllers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoConta;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContaDTO {

    @Size(max = 4, message = "Agência deve conter 4 carecteres")
    @NotNull(message = "O número da agência não pode ser nulo")
    private String agencia;

    private String numeroConta;

    @NotNull(message = "Tipo de conta não deve ser nula")
    private TipoConta tipoConta;

    private BigDecimal saldo;

    @NotNull(message = "cliente id não deve ser nulo")
    private Long idCliente;
}
