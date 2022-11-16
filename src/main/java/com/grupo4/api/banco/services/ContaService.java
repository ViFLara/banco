package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Conta;
import com.grupo4.api.banco.enums.TipoConta;
import com.grupo4.api.banco.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Transactional(readOnly = true)
    public Optional<Conta> findById(Long id) {
        return contaRepository.findById(id);
    } //feito

    @Transactional(readOnly = true)
    public List<Conta> findAll() { //feito
        return contaRepository.findAll();
    } //feito

    public void update(Conta conta){
        contaRepository.save(conta); //feito
    }

    public Conta createConta(Conta conta){
        return contaRepository.save(conta); //feito
    }

    public void createContaList(List<Conta> contas) {
        contaRepository.saveAll(contas); //feito
    }

    /*public Conta findByAgenciaNumeroContaETipo(String agencia, String numeroConta, TipoConta tipoConta) {
        return contaRepository.findByAgenciaNumeroContaETipo(agencia, numeroConta, tipoConta);
    }*/
}
