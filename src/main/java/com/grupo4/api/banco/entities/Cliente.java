package com.grupo4.api.banco.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "cliente")
public class Cliente {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    //@Column(nullable = false, unique = true)
    private String cpf;

    private String email;

    private String telefone;

    //@JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;

    private String profissao;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    private Conta conta;

}
