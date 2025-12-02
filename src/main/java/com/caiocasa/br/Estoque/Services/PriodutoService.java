package com.caiocasa.br.Estoque.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiocasa.br.Estoque.Models.Produto;
import com.caiocasa.br.Estoque.Repositories.ProdutoRepository;

@Service
public class PriodutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void cadastrarProduto (Produto produto) {
        produtoRepository.saveAndFlush(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    
}
