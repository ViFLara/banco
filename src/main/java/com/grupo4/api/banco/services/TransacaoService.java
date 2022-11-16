package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.repositories.ContaRepository;
import com.grupo4.api.banco.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private ContaRepository contaRepository;

    public void createTransacaoList(List<Transacao> transacoes){
        transacaoRepository.saveAll(transacoes); // feito
    }

    public List<Transacao> findAll() {
        return transacaoRepository.findAll(); // feito
    }

  /*  public Transacao deposito(Transacao transacao) {
        Transacao transacaoSalva = transacaoRepository.save(transacao);
        Conta contaDestino = transacao.getContaDestino();
        contaDestino.setSaldo(contaDestino.getSaldo().add(transacao.getQuantia()));
        transacaoSalva.setContaDestino(contaRepository.save(contaDestino));
        return transacaoSalva;
    }*/

}
