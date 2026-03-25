package com.example.aula2mateus.service;

import com.example.aula2mateus.Model.Pessoa;
import com.example.aula2mateus.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    // Outros métodos do serviço
    public List<Pessoa> getAllPessoas(){
        return repository.findAll();
    }

    public Pessoa getPessoaById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Pessoa createPessoa(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public Pessoa updatePessoa(Long id, Pessoa pessoa){
        Pessoa existingPessoa = repository.findById(id).orElse(null);
        if (existingPessoa != null) {
            existingPessoa.setNome(pessoa.getNome());
            existingPessoa.setEmail(pessoa.getEmail());
            return repository.save(existingPessoa);
        } else {
            return null;
        }
    }

    public void deletePessoa(Long id){
        repository.deleteById(id);
    }

}
