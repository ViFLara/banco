package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import javax.persistence.*;

@Getter
@Builder
@Entity
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String cidade;

    private String estado;

    private String cep;

    private String bairro;

}
