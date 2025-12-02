package com.caiocasa.br.Estoque.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiocasa.br.Estoque.Models.Produto;
import com.caiocasa.br.Estoque.Services.PriodutoService;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {
    @Autowired
    private PriodutoService priodutoService;

    @PostMapping("Cadastrar")
    public ResponseEntity<String> cadastrarProduto (@org.springframework.web.bind.annotation.RequestBody Produto produto) {
        priodutoService.cadastrarProduto(produto);
        return ResponseEntity.ok("Produto cadastrado");
    }

    @GetMapping("/Listar")
    public List<Produto> listaProdutos() {
        return priodutoService.listarProdutos();
    }
}
