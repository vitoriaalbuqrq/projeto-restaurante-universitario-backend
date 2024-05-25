package com.project.restaurante_universitario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurante_universitario.dto.EnderecoDTO;
import com.project.restaurante_universitario.entities.Endereco;
import com.project.restaurante_universitario.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoDTO> findAll(){
        List<Endereco> result = enderecoRepository.findAll();
        return result.stream().map(x -> new EnderecoDTO(x)).toList();

    }
}
