package com.example.aula2mateus.controller;

import com.example.aula2mateus.Model.Pessoa;
import com.example.aula2mateus.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    // Outros métodos do controlador

    @GetMapping
    public List<Pessoa> getAllPessoa(){
        return service.getAllPessoas();
    }

    @GetMapping
    public Pessoa getPessoaById(Long id){
        return service.getPessoaById(id);
    }

    @PostMapping
    public Pessoa createPessoa(Pessoa pessoa){
        return service.createPessoa(pessoa);
    }

    @PutMapping
    public Pessoa updatePessoa(Long id, Pessoa pessoa){
        return service.updatePessoa(id, pessoa);
    }

    @DeleteMapping
    public void deletePessoa(Long id){
        service.deletePessoa(id);
    }

}
