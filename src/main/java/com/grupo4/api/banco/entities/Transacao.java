package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;
import javax.persistence.*;
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

    private BigDecimal quantia;

    @ManyToOne
    @JoinColumn(name = "contaOrigem")
    private Conta contaOrigem;

    //private Conta contaDestino;

    //@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTransacaoEnum tipoTransacao;

    //@Column(nullable = false, name = "created_at", updatable = false)
    //@CreationTimestamp
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCriacao;

}
