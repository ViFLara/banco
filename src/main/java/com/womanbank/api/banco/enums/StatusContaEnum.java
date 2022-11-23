package com.womanbank.api.banco.enums;

public enum StatusContaEnum {

    A("Ativa"),
    B("Bloqueada"),
    C("Cancelada");

    private final String descricao;

    StatusContaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
