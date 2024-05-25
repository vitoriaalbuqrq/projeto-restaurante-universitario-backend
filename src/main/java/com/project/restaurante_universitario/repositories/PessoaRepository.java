package com.project.restaurante_universitario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.restaurante_universitario.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    
}