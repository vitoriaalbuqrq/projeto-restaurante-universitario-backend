package com.project.restaurante_universitario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.restaurante_universitario.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
