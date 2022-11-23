package com.womanbank.api.banco.enums;

public enum TipoConta {

    CC("Conta Corrente"),
    CP("Conta Poupança ");

    private final String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
