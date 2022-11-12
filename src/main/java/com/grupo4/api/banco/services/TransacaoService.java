package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public void createTransacaoList(List<Transacao> transacoes){
        transacaoRepository.saveAll(transacoes); // feito
    }

    public List<Transacao> findAll() {
        return null;
    }
}
