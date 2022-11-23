package com.womanbank.api.banco.repositories;

import com.womanbank.api.banco.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>  {
}
