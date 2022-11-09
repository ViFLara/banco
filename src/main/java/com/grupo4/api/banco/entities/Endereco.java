package com.grupo4.api.banco.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "endereco")
public class Endereco {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String cidade;

    private String estado;

    private String cep;

    private String bairro;

    private Cliente cliente;
}
