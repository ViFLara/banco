package com.grupo4.api.banco.entities;

import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "endereco")
public class Transacao {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valorTransferido;

    private Conta contaOrigem;

    private Conta contaDestino;

    //@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTransacaoEnum tipoTransacao;

    //@Column(nullable = false, name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime dataCriacao;

}
