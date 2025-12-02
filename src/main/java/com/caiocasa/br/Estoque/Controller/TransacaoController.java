package com.caiocasa.br.Estoque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiocasa.br.Estoque.Dtos.TransacaoDto;
import com.caiocasa.br.Estoque.Services.TransacaoService;

@RestController
@RequestMapping("/Trasacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/Cadastrar")
    public ResponseEntity<String> cadastrarTransacao (@org.springframework.web.bind.annotation.RequestBody TransacaoDto transacao) {
        transacaoService.cadastrarTransacao(transacao);
        return ResponseEntity.ok("Transacao Feita");
    }
}
