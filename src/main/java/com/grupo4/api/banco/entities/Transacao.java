package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@Entity
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive(message = "A quantia deve ser positiva")
    @DecimalMin(value = "0.01", message = "O valor deve ser maior do que 0.01")
    private BigDecimal quantia;

    @ManyToOne
    @JoinColumn(name = "contaOrigem")
    private Conta contaOrigem;

    @ManyToOne
    @JoinColumn(name = "contaDestino")
    private Conta contaDestino;

    @Enumerated(EnumType.STRING)
    private TipoTransacaoEnum tipoTransacao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCriacao;

}
