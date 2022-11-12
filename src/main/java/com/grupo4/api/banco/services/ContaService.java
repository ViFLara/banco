package com.grupo4.api.banco.services;

import com.grupo4.api.banco.entities.Conta;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContaService {

    @Transactional(readOnly = true)
    public Conta findById(Long id) {
        return new Conta();
    }

    @Transactional(readOnly = true)
    public List<Conta> findAll() {
        return null;
    }

    public void update(Conta conta){
    }

    public Conta createConta(Conta conta){
        return new Conta();
    }
}
