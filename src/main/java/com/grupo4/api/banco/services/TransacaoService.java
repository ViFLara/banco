package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.entities.Transacao;
import com.grupo4.api.banco.enums.StatusContaEnum;
import com.grupo4.api.banco.repositories.ContaRepository;
import com.grupo4.api.banco.repositories.TransacaoRepository;
import com.grupo4.api.banco.services.exceptions.InvalidInputException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TransacaoService {

    private TransacaoRepository transacaoRepository;
    private ContaRepository contaRepository;

    public void createTransacaoList(List<Transacao> transacoes){
        transacaoRepository.saveAll(transacoes);
    }

    public List<Transacao> findAll() {
        return transacaoRepository.findAll();
    }

    public Transacao deposit(Transacao transacao) {
        Transacao transacaoSalva = transacaoRepository.save(transacao);
        Conta contaDestino = transacao.getContaDestino();
        contaDestino.setSaldo(contaDestino.getSaldo().add(transacao.getQuantia()));
        transacaoSalva.setContaDestino(contaRepository.save(contaDestino));
        return transacaoSalva;
    }

    public Transacao transfer(Transacao transacao) {
        Conta contaOrigem = transacao.getContaOrigem();
        Conta contaDestino = transacao.getContaDestino();

        if (contaOrigem.getSaldo().compareTo(transacao.getQuantia()) <= 0) {
            throw new InvalidInputException("A conta origem " + contaOrigem.getTipoConta() + " com numero " +
                    contaOrigem.getNumeroConta() + " Não tem saldo suficiente");
        }

        if (!contaDestino.getStatusConta().equals(StatusContaEnum.A)) {
           throw new InvalidInputException("A conta destino " + contaDestino.getTipoConta() + " com numero " +
                    contaDestino.getNumeroConta() + " Não está ativa");
        }

        Transacao transactionSalva = transacaoRepository.save(transacao);
        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(transacao.getQuantia()));
        contaDestino.setSaldo(contaDestino.getSaldo().add(transacao.getQuantia()));
        transactionSalva.setContaOrigem(contaRepository.save(contaOrigem));
        transactionSalva.setContaDestino(contaRepository.save(contaDestino));

        return transactionSalva;
    }

}
