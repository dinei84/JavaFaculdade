package com.example.cursoinicial.service;

import com.example.cursoinicial.Model.Produto;
import com.example.cursoinicial.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    public Produto adicionarProduto(Produto produto){
        return repository.save(produto);
    }

    public Produto atualizarProduto(Long id, Produto produto){
        produto.setId(id);
        return repository.save(produto);
    }

    public void deletarProduto(Long id){
        repository.deleteById(id);
    }

}
