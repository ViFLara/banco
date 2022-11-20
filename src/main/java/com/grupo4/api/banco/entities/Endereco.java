package com.grupo4.api.banco.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.grupo4.api.banco.enums.UF;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
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

    @NotBlank
    @Size(min = 5, max = 100)
    private String logradouro;

    @NotNull
    private Integer numero;

    @Size(max= 10)
    private String complemento;

    @NotBlank
    @Size(min = 9, max = 9)
    private String cep;

    @NotBlank
    @Size(min = 2, max = 45)
    private String bairro;

    @NotBlank
    @Size(min = 2, max = 30)
    private String cidade;

    @NotNull(message = "{NotNull.endereco.uf}")
    private UF estado;

    @NotBlank
    @Size(min = 2, max = 25)
    private String pais;

}
