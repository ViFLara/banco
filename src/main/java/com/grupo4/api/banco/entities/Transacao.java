package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.TipoTransacaoEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
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
    @Setter
    @JoinColumn(name = "contaOrigem")
    private Conta contaOrigem;

    @ManyToOne
    @Setter
    @JoinColumn(name = "contaDestino")
    private Conta contaDestino;

    @Enumerated(EnumType.STRING)
    private TipoTransacaoEnum tipoTransacao;

    @Column(nullable = false, name = "created_at", updatable = false)
    @CreationTimestamp
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCriacao;

}
