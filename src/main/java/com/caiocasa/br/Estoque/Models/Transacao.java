package com.caiocasa.br.Estoque.Models;

import java.time.LocalDate;

import com.caiocasa.br.Estoque.Enums.EnumTipo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="trasacao")
public class Transacao {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_transacao")
    private Integer idTrasacao;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    @Column(name="tipo_transacao")
    @Enumerated(EnumType.STRING)
    private EnumTipo tipoTransacao;

    @Column(name="quantidade")
    private Integer quantidade;

    @Column(name="data_transacao")
    private LocalDate dataTransacao;

    public Transacao() {
    }

    public Transacao(LocalDate dataTransacao, Integer idTrasacao, Produto produto, Integer quantidade, EnumTipo tipoTransacao) {
        this.dataTransacao = dataTransacao;
        this.idTrasacao = idTrasacao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipoTransacao = tipoTransacao;
    }

    public Integer getIdTrasacao() {
        return idTrasacao;
    }

    public void setIdTrasacao(Integer idTrasacao) {
        this.idTrasacao = idTrasacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public EnumTipo getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(EnumTipo tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }


    
}
