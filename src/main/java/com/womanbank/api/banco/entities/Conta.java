package com.womanbank.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.womanbank.api.banco.enums.StatusContaEnum;
import com.womanbank.api.banco.enums.TipoConta;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

    @Size(max = 4, min = 4, message = "Agência deve conter 4 carecteres")
    @NotBlank(message = "O número da agência não pode estar em branco")
    private String agencia;

    private String numeroConta;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    @JsonIgnore
    private Cliente cliente;

    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    private StatusContaEnum statusConta;

    @NotNull(message = "Tipo de conta não deve ser nula")
    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    @OneToMany(mappedBy = "contaDestino")
    @JsonIgnore
    private List<Transacao> transferenciasRecebidas;

    @OneToMany(mappedBy = "contaOrigem")
    @JsonIgnore
    private List<Transacao> transferenciasFeitas;

}
