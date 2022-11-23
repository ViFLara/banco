package com.womanbank.api.banco.repositories;

import com.womanbank.api.banco.entities.Conta;
import com.womanbank.api.banco.enums.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findByAgenciaAndNumeroContaAndTipoConta(String agencia, String numeroConta, TipoConta tipoConta);

}
