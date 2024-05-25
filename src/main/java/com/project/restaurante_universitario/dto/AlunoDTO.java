package com.project.restaurante_universitario.dto;

import com.project.restaurante_universitario.entities.Aluno;

public class AlunoDTO {
    private Integer id;
    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private String curso;

    public AlunoDTO(){}

    public AlunoDTO(Aluno entity) {
        id = entity.getId();
        matricula = entity.getMatricula();
        nomeCompleto = entity.getNomeCompleto();
        cpf = entity.getCpf();
        curso = entity.getCurso();
    }

    public Integer getId() {
        return id;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }
    
    
}
