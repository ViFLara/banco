package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.StatusContaEnum;
import com.grupo4.api.banco.enums.TipoConta;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

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
    @JsonIgnore
    private Cliente cliente;

    @JsonIgnore
    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    private StatusContaEnum statusConta;

/*    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoConta tipoConta;*/

    //como diferenciar feitas e recebidas

    //private List<Transacao> transferenciasRecebidas;

    @OneToMany(mappedBy = "contaOrigem")
    private List<Transacao> transferenciasFeitas;

}
