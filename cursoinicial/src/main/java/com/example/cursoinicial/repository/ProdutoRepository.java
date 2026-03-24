package com.example.cursoinicial.repository;

import com.example.cursoinicial.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
