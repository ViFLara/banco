package com.grupo4.api.banco.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "conta")
public class Conta {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer agencia;

    private Integer numeroConta;

    //private Cliente cliente;

    private BigDecimal saldo;

    //private Enum status;

    private List<Transacao> transacoes;
}
