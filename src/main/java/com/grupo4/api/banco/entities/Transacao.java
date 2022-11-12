package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valorTransferido;

    //private Conta contaOrigem;

    //private Conta contaDestino;

    //@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTransacaoEnum tipoTransacao;

    //@Column(nullable = false, name = "created_at", updatable = false)
    //@CreationTimestamp
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCriacao;

}
