package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.StatusContaEnum;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agencia;

    private String numeroConta;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    private StatusContaEnum statusConta;

    //como diferenciar feitas e recebidas

    //@OneToMany(mappedBy = "contaOrigem")
    //private List<Transacao> transferenciasFeitas;

    //@OneToMany(mappedBy = "contaDestino")
    //private List<Transacao> transferenciasRecebidas;

}
