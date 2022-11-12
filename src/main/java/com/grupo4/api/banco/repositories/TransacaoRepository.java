package com.grupo4.api.banco.repositories;


import com.grupo4.api.banco.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>  {
}
