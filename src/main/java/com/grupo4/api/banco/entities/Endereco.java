package com.grupo4.api.banco.entities;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endereco")
//@Embeddable
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String cidade;

    private String estado;

    private String cep;

    private String bairro;

    //private Cliente cliente;
}
