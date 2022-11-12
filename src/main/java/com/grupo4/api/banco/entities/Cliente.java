package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    //@Column(nullable = false, unique = true)
    private String cpf;

    private String email;

    private String telefone;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    private String profissao;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "endereco_id", referencedColumnName = "id")
    @Embedded
    private Endereco endereco;

    //private Conta conta;

}
