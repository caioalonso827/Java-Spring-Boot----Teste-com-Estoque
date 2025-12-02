package com.caiocasa.br.Estoque.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiocasa.br.Estoque.Dtos.TransacaoDto;
import com.caiocasa.br.Estoque.Enums.EnumTipo;
import com.caiocasa.br.Estoque.Models.Produto;
import com.caiocasa.br.Estoque.Models.Transacao;
import com.caiocasa.br.Estoque.Repositories.ProdutoRepository;
import com.caiocasa.br.Estoque.Repositories.TransacaoRepository;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public void cadastrarTransacao (TransacaoDto transacao) {
        Produto produto = produtoRepository.findById(transacao.idProduto()).orElseThrow(()-> new RuntimeException("Não existe esse produto"));

        Transacao transacao1 = new Transacao();
        transacao1.setTipoTransacao(transacao.tipoTransacao());
        transacao1.setQuantidade(transacao.quantidade());
        transacao1.setDataTransacao(transacao.dataTransacao());
        transacao1.setProduto(produto);

        if (transacao1.getTipoTransacao() == EnumTipo.ENTRADA) {produto.setEstoqueProduto(transacao1.getQuantidade() + produto.getEstoqueProduto());}
        else if (transacao1.getTipoTransacao() == EnumTipo.SAIDA) {if (transacao1.getQuantidade() > produto.getEstoqueProduto()) {throw new RuntimeException("Não há estoque o suficiente");}
        produto.setEstoqueProduto(produto.getEstoqueProduto() - transacao1.getQuantidade());
        }


        transacaoRepository.saveAndFlush(transacao1);
        produtoRepository.saveAndFlush(produto);
    }   
}
