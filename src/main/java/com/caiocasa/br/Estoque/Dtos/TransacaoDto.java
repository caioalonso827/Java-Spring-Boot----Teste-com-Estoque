package com.caiocasa.br.Estoque.Dtos;

import java.time.LocalDate;

import com.caiocasa.br.Estoque.Enums.EnumTipo;

public record TransacaoDto(Integer idProduto, EnumTipo tipoTransacao, Integer quantidade, LocalDate dataTransacao) {
    
}
