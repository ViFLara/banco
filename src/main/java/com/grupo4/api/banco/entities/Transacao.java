package com.grupo4.api.banco.entities;

import lombok.*;

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
}
