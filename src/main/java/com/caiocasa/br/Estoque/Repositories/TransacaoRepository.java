package com.caiocasa.br.Estoque.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caiocasa.br.Estoque.Models.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
    
}
