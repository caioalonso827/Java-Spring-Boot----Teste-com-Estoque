package com.caiocasa.br.Estoque.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Integer idProduto;

    @Column(name="nome_produto")
    private String nomeProduto;

    @Column(name="descricao_produto")
    private String descricaoProduto;

    @Column(name="preco_produto")
    private BigDecimal precoProduto;

    @Column(name="estoque_produto")
    private Integer estoqueProduto;

    public Produto() {
    }

    public Produto(String descricaoProduto, Integer estoqueProduto, Integer idProduto, String nomeProduto, BigDecimal precoProduto) {
        this.descricaoProduto = descricaoProduto;
        this.estoqueProduto = estoqueProduto;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Integer estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    
}
