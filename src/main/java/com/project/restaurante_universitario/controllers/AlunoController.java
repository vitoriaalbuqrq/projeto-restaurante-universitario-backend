package com.project.restaurante_universitario.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.project.restaurante_universitario.dto.AlunoDTO;
import com.project.restaurante_universitario.services.AlunoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoDTO> findAll(){
        List<AlunoDTO> result = alunoService.findAll();
        return result;
    }
    
}
