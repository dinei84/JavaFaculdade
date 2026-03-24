package com.example.cursoinicial.controller;

import com.example.cursoinicial.Model.Produto;
import com.example.cursoinicial.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service, ProdutoService service1) {
        this.service = service1;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return service.listarProdutos();
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return service.adicionarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto){
        return service.atualizarProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
    }

}
