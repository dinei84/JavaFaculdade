package com.example.aula2mateus.repository;

import com.example.aula2mateus.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
