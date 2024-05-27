package com.project.restaurante_universitario.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.project.restaurante_universitario.dto.AlunoDTO;
import com.project.restaurante_universitario.services.AlunoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/{id}")
    public ResponseEntity<AlunoDTO> findById(@PathVariable Integer id) {
        AlunoDTO alunoDTO = alunoService.findById(id);
        return ResponseEntity.ok(alunoDTO);
    }
    
    @GetMapping
    public List<AlunoDTO> findAll() {
        List<AlunoDTO> result = alunoService.findAll();
        return result;
    }

    @PostMapping
    public ResponseEntity<AlunoDTO> create(@RequestBody AlunoDTO alunoDTO) {
        AlunoDTO savedAluno = alunoService.create(alunoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoDTO> update(@PathVariable Integer id, @RequestBody AlunoDTO alunoDTO) {
        System.out.println("Recebendo dados para atualizar: " + alunoDTO);
        AlunoDTO updatedAluno = alunoService.update(id, alunoDTO);
        return ResponseEntity.ok(updatedAluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        alunoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
