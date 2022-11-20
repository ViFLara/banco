package com.grupo4.api.banco.controllers.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoConta;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransacaoDTO {

    @Size(max = 4, min = 4, message = "Agência deve conter 4 carecteres")
    @NotBlank(message = "Deve-se colocar o número da agência")
    private String agencia;

    private String numeroConta;

    private TipoConta tipoConta;

    @NotNull
    @Positive(message = "A quantia deve ser positiva")
    @DecimalMin(value = "0.01", message = "O valor deve ser maior do que 0.01")
    private BigDecimal quantia;

    private TipoTransacaoEnum tipoTransacao;
}
