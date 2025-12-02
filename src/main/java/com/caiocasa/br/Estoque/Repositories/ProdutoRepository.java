package com.caiocasa.br.Estoque.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caiocasa.br.Estoque.Models.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
