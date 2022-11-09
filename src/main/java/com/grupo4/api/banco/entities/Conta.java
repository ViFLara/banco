package com.grupo4.api.banco.entities;

import com.grupo4.api.banco.enums.StatusContaEnum;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

    @Enumerated(EnumType.STRING)
    private StatusContaEnum statusConta;

    //como diferenciar feitas e recebidas

    //@OneToMany(mappedBy = "contaOrigem")
    private List<Transacao> transferenciasFeitas;

    //@OneToMany(mappedBy = "contaDestino")
    private List<Transacao> transferenciasRecebidas;

}
