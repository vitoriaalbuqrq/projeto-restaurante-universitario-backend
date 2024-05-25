package com.project.restaurante_universitario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.restaurante_universitario.dto.EnderecoDTO;
import com.project.restaurante_universitario.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoDTO> findAll(){
        List<EnderecoDTO> result = enderecoService.findAll();
        return result;
    }
}
