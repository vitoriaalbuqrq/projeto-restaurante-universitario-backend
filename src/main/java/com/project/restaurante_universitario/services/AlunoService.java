package com.project.restaurante_universitario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurante_universitario.dto.AlunoDTO;
import com.project.restaurante_universitario.entities.Aluno;
import com.project.restaurante_universitario.repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoDTO> findAll(){
        List<Aluno> result = alunoRepository.findAll();
        return result.stream().map(x -> new AlunoDTO(x)).toList();
    }
}
