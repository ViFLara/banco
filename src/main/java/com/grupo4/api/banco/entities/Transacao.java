package com.grupo4.api.banco.entities;

import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
