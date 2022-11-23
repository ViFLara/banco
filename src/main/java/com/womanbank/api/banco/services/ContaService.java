package com.womanbank.api.banco.services;

import com.womanbank.api.banco.entities.Conta;
import com.womanbank.api.banco.enums.TipoConta;
import com.womanbank.api.banco.repositories.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ContaService {

    private ContaRepository contaRepository;

    @Transactional(readOnly = true)
    public Optional<Conta> findById(Long id) throws ChangeSetPersister.NotFoundException { verifyIfExists(id); return contaRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Conta> findAll() { //feito
        return contaRepository.findAll();
    }

    public void update(Conta conta){
        contaRepository.save(conta);
    }

    public Conta createConta(Conta conta){
        return contaRepository.save(conta);
    }

    public void createContaList(List<Conta> contas) {
        contaRepository.saveAll(contas);
    }

    public Conta findByAgenciaNumeroContaETipo(String agencia, String numeroConta, TipoConta tipoConta) {
        return contaRepository.findByAgenciaAndNumeroContaAndTipoConta(agencia, numeroConta, tipoConta);
    }

    private void verifyIfExists(Long id) throws ChangeSetPersister.NotFoundException {
        contaRepository.findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }
}
