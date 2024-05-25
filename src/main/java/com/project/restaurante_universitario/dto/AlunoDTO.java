package com.project.restaurante_universitario.dto;

import com.project.restaurante_universitario.entities.Aluno;
import com.project.restaurante_universitario.entities.Endereco;

public class AlunoDTO {
    private Integer id;
    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private String curso;
    private Endereco endereco;

    public AlunoDTO(){}

    public AlunoDTO(Aluno entity) {
        id = entity.getId();
        matricula = entity.getMatricula();
        nomeCompleto = entity.getNomeCompleto();
        cpf = entity.getCpf();
        curso = entity.getCurso();
        endereco = entity.getEndereco();
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

    public Endereco getEndereco() {
        return endereco;
    }
    
}
